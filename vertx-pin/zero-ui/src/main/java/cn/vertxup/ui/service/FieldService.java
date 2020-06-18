package cn.vertxup.ui.service;

import cn.vertxup.ui.domain.tables.daos.UiFieldDao;
import cn.vertxup.ui.domain.tables.pojos.UiField;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.ke.cv.KeField;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.tp.ui.cv.em.RowType;
import io.vertx.tp.ui.refine.Ui;
import io.vertx.up.log.Annal;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class FieldService implements FieldStub {
    private static final Annal LOGGER = Annal.get(FieldService.class);

    @Override
    public Future<JsonArray> fetchUi(final String formId) {
        return Ux.Jooq.on(UiFieldDao.class)
                .<UiField>fetchAsync(KeField.Ui.CONTROL_ID, formId)
                .compose(ui -> {
                    if (Objects.isNull(ui) || ui.isEmpty()) {
                        Ui.infoWarn(FieldService.LOGGER, " Field not configured.");
                        return Ux.future(new JsonArray());
                    } else {
                        final JsonArray uiJson = Ut.serializeJson(ui);
                        return this.attachConfig(uiJson);
                    }
                });
    }

    @Override
    public Future<JsonArray> updateA(final String controlId, final JsonArray data) {
        final ConcurrentMap<Object, Boolean> seen = new ConcurrentHashMap<>();
        // 1. mountIn fields, convert those into object from string
        final List<UiField> fields = Ut.itJArray(data)
                // filter(deduplicate) by name
                .filter(item -> (!item.containsKey(KeField.NAME)) ||
                                (Ut.notNil(item.getString(KeField.NAME)) && null == seen.putIfAbsent(item.getString(KeField.NAME), Boolean.TRUE)))
                .map(this::mountIn)
                .map(field -> field.put(KeField.Ui.CONTROL_ID, Optional.ofNullable(field.getString(KeField.Ui.CONTROL_ID)).orElse(controlId)))
                .map(field -> Ux.fromJson(field, UiField.class))
                .collect(Collectors.toList());
        // 2. delete old ones and insert new ones
        return this.deleteByControlId(controlId)
                .compose(result -> Ux.Jooq.on(UiFieldDao.class)
                        .insertAsync(fields)
                        .compose(Ux::fnJArray)
                        // 3. mountOut
                        .compose(updatedFields -> {
                            List<JsonObject> list = Ut.itJArray(updatedFields)
                                    .map(this::mountOut)
                                    .collect(Collectors.toList());
                            return Ux.future(new JsonArray(list));
                        }));
    }

    @Override
    public Future<Boolean> deleteByControlId(String controlId) {
        return Ux.Jooq.on(UiFieldDao.class)
                .deleteAsync(new JsonObject().put(KeField.Ui.CONTROL_ID, controlId));
    }

    private Future<JsonArray> attachConfig(final JsonArray fieldJson) {
        /*
         * metadata mode for parsing processor
         */
        final JsonArray ui = new JsonArray();
        /*
         * Calculate row
         */
        final int rowIndex = Ut.itJArray(fieldJson)
                .map(each -> each.getInteger("yPoint"))
                .max(Comparator.naturalOrder())
                .orElse(0);
        for (int idx = 0; idx <= rowIndex; idx++) {
            final Integer current = idx;
            final List<JsonObject> row = Ut.itJArray(fieldJson)
                    .filter(item -> current.equals(item.getInteger("yPoint")))
                    .sorted(Comparator.comparing(item -> item.getInteger("xPoint")))
                    .collect(Collectors.toList());
            /*
             * Calculate columns
             */
            final JsonArray rowArr = new JsonArray();
            row.forEach(cell -> {
                /*
                 * Title row is special here
                 */
                final RowType rowType = Ut.toEnum(() -> cell.getString("rowType"),
                        RowType.class, RowType.FIELD);
                final JsonObject dataCell = new JsonObject();
                if (RowType.TITLE == rowType) {
                    dataCell.put("title", cell.getValue("label"));
                    dataCell.put("field", cell.getValue("key"));    // Specific field for title.
                } else {
                    Ke.mount(cell, FieldStub.OPTION_JSX);
                    Ke.mount(cell, FieldStub.OPTION_CONFIG);
                    Ke.mount(cell, FieldStub.OPTION_ITEM);
                    Ke.mountArray(cell, "rules");
                    final String render = Objects.isNull(cell.getString("render")) ? "" :
                            cell.getString("render");
                    final String label = Objects.isNull(cell.getString("label")) ? "" :
                            cell.getString("label");
                    final String metadata = cell.getString("name")
                            + "," + label + "," + cell.getInteger("span")
                            + ",," + render;

                    dataCell.put("metadata", metadata);
                    /*
                     * hidden
                     */
                    final Boolean hidden = cell.getBoolean("hidden");
                    if (hidden) {
                        dataCell.put("hidden", Boolean.TRUE);
                    }
                    /*
                     * Rules
                     */
                    final JsonArray rules = cell.getJsonArray("rules");
                    if (Objects.nonNull(rules) && !rules.isEmpty()) {
                        dataCell.put("optionConfig.rules", rules);
                    }
                    /*
                     * Three core configuration
                     */
                    if (Objects.nonNull(cell.getValue(FieldStub.OPTION_JSX))) {
                        dataCell.put(FieldStub.OPTION_JSX, cell.getValue(FieldStub.OPTION_JSX));
                    }
                    if (Objects.nonNull(cell.getValue(FieldStub.OPTION_CONFIG))) {
                        dataCell.put(FieldStub.OPTION_CONFIG, cell.getValue(FieldStub.OPTION_CONFIG));
                    }
                    if (Objects.nonNull(cell.getValue(FieldStub.OPTION_ITEM))) {
                        dataCell.put(FieldStub.OPTION_ITEM, cell.getValue(FieldStub.OPTION_ITEM));
                    }

                    /*
                     * moment
                     * 1) When `Edit/Add` status
                     * 2) When `View` status
                     * In this kind of situation, the config `optionJsx` must contains `config.format` here.
                     */
                    final JsonObject optionJsx = cell.getJsonObject(FieldStub.OPTION_JSX);
                    if (Ut.notNil(optionJsx)) {
                        final JsonObject config = optionJsx.getJsonObject("config");
                        if (Ut.notNil(config) && config.containsKey("format")) {
                            /*
                             * Date here for moment = true
                             */
                            dataCell.put("moment", true);
                        }
                    }
                }
                rowArr.add(dataCell);
            });
            ui.add(rowArr);
        }
        return Ux.future(ui);
    }

    private JsonObject mountIn(final JsonObject data) {
        Ke.mountString(data, FieldStub.OPTION_JSX);
        Ke.mountString(data, FieldStub.OPTION_CONFIG);
        Ke.mountString(data, FieldStub.OPTION_ITEM);
        Ke.mountString(data, FieldStub.RULES);
        Ke.mountString(data, KeField.METADATA);
        return data;
    }
    private JsonObject mountOut(final JsonObject data) {
        Ke.mount(data, FieldStub.OPTION_JSX);
        Ke.mount(data, FieldStub.OPTION_CONFIG);
        Ke.mount(data, FieldStub.OPTION_ITEM);
        Ke.mountArray(data, FieldStub.RULES);
        Ke.mount(data, KeField.METADATA);
        return data;
    }
}
