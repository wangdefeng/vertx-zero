/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XTabularRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class XTabular extends TableImpl<XTabularRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_TABULAR</code>
     */
    public static final XTabular X_TABULAR = new XTabular();
    private static final long serialVersionUID = -1658793888;
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    public final TableField<XTabularRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 列表主键");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    public final TableField<XTabularRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 列表名称");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    public final TableField<XTabularRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 列表编号");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    public final TableField<XTabularRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「type」- 列表类型");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    public final TableField<XTabularRecord, String> ICON = createField("ICON", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「icon」- 列表图标");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    public final TableField<XTabularRecord, Integer> SORT = createField("SORT", org.jooq.impl.SQLDataType.INTEGER, this, "「sort」- 排序信息");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    public final TableField<XTabularRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」- 备注信息");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<XTabularRecord, String> APP_ID = createField("APP_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「appId」- 关联的应用程序ID");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XTabularRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XTabularRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XTabularRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XTabularRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XTabularRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XTabularRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XTabularRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XTabularRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.X_TABULAR</code> table reference
     */
    public XTabular() {
        this(DSL.name("X_TABULAR"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_TABULAR</code> table reference
     */
    public XTabular(String alias) {
        this(DSL.name(alias), X_TABULAR);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_TABULAR</code> table reference
     */
    public XTabular(Name alias) {
        this(alias, X_TABULAR);
    }

    private XTabular(Name alias, Table<XTabularRecord> aliased) {
        this(alias, aliased, null);
    }

    private XTabular(Name alias, Table<XTabularRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XTabularRecord> getRecordType() {
        return XTabularRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.X_TABULAR_APP_ID, Indexes.X_TABULAR_IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE, Indexes.X_TABULAR_IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE, Indexes.X_TABULAR_PRIMARY, Indexes.X_TABULAR_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XTabularRecord> getPrimaryKey() {
        return Keys.KEY_X_TABULAR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XTabularRecord>> getKeys() {
        return Arrays.<UniqueKey<XTabularRecord>>asList(Keys.KEY_X_TABULAR_PRIMARY, Keys.KEY_X_TABULAR_APP_ID, Keys.KEY_X_TABULAR_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XTabular as(String alias) {
        return new XTabular(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XTabular as(Name alias) {
        return new XTabular(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XTabular rename(String name) {
        return new XTabular(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XTabular rename(Name name) {
        return new XTabular(name, null);
    }
}
