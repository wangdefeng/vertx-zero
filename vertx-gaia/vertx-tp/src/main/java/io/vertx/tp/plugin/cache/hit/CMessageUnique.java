package io.vertx.tp.plugin.cache.hit;

import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class CMessageUnique extends AbstractCMessage {
    private final transient JsonObject condition = new JsonObject();

    public CMessageUnique(final JsonObject condition, final Class<?> type) {
        super(type);
        if (Objects.nonNull(condition)) {
            this.condition.mergeIn(condition, true);
        }
    }

    public CMessageUnique(final String field, final Object value, final Class<?> type) {
        super(type);
        this.condition.put(field, value);
    }

    @Override
    public String dataUnique() {
        /*
         * Single Record
         */
        final L1Algorithm algorithm = Ut.singleton(AlgorithmRecord.class);
        return algorithm.dataUnique(this.typeName(), this.condition);
    }

    @Override
    public boolean isList() {
        return Boolean.FALSE;
    }

    @Override
    public boolean isRef() {
        return Boolean.TRUE;
    }

    @Override
    public JsonObject dataCondition() {
        return this.condition.copy();
    }
}
