/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ambient.domain;


import cn.vertxup.ambient.domain.tables.XActivity;
import cn.vertxup.ambient.domain.tables.XActivityChange;
import cn.vertxup.ambient.domain.tables.XApp;
import cn.vertxup.ambient.domain.tables.XAttachment;
import cn.vertxup.ambient.domain.tables.XCategory;
import cn.vertxup.ambient.domain.tables.XLog;
import cn.vertxup.ambient.domain.tables.XMenu;
import cn.vertxup.ambient.domain.tables.XModule;
import cn.vertxup.ambient.domain.tables.XNumber;
import cn.vertxup.ambient.domain.tables.XSource;
import cn.vertxup.ambient.domain.tables.XTabular;
import cn.vertxup.ambient.domain.tables.XTodo;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>DB_ETERNAL</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index X_ACTIVITY_IDXM_X_ACTIVITY_MODEL_ID_MODEL_KEY = Indexes0.X_ACTIVITY_IDXM_X_ACTIVITY_MODEL_ID_MODEL_KEY;
    public static final Index X_ACTIVITY_PRIMARY = Indexes0.X_ACTIVITY_PRIMARY;
    public static final Index X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_ACTIVITY_ID = Indexes0.X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_ACTIVITY_ID;
    public static final Index X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_CREATED_AT = Indexes0.X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_CREATED_AT;
    public static final Index X_ACTIVITY_CHANGE_PRIMARY = Indexes0.X_ACTIVITY_CHANGE_PRIMARY;
    public static final Index X_APP_CODE = Indexes0.X_APP_CODE;
    public static final Index X_APP_IDX_X_APP_NAME = Indexes0.X_APP_IDX_X_APP_NAME;
    public static final Index X_APP_NAME = Indexes0.X_APP_NAME;
    public static final Index X_APP_PATH = Indexes0.X_APP_PATH;
    public static final Index X_APP_PATH_2 = Indexes0.X_APP_PATH_2;
    public static final Index X_APP_PRIMARY = Indexes0.X_APP_PRIMARY;
    public static final Index X_ATTACHMENT_FILE_KEY = Indexes0.X_ATTACHMENT_FILE_KEY;
    public static final Index X_ATTACHMENT_FILE_PATH = Indexes0.X_ATTACHMENT_FILE_PATH;
    public static final Index X_ATTACHMENT_FILE_URL = Indexes0.X_ATTACHMENT_FILE_URL;
    public static final Index X_ATTACHMENT_PRIMARY = Indexes0.X_ATTACHMENT_PRIMARY;
    public static final Index X_CATEGORY_APP_ID = Indexes0.X_CATEGORY_APP_ID;
    public static final Index X_CATEGORY_IDXM_X_CATEGORY_APP_ID_TYPE_ACTIVE = Indexes0.X_CATEGORY_IDXM_X_CATEGORY_APP_ID_TYPE_ACTIVE;
    public static final Index X_CATEGORY_IDXM_X_CATEGORY_SIGMA_TYPE_ACTIVE = Indexes0.X_CATEGORY_IDXM_X_CATEGORY_SIGMA_TYPE_ACTIVE;
    public static final Index X_CATEGORY_PRIMARY = Indexes0.X_CATEGORY_PRIMARY;
    public static final Index X_CATEGORY_SIGMA = Indexes0.X_CATEGORY_SIGMA;
    public static final Index X_LOG_IDXM_X_LOG_SIGMA_TYPE = Indexes0.X_LOG_IDXM_X_LOG_SIGMA_TYPE;
    public static final Index X_LOG_PRIMARY = Indexes0.X_LOG_PRIMARY;
    public static final Index X_MENU_IDX_X_MENU_APP_ID = Indexes0.X_MENU_IDX_X_MENU_APP_ID;
    public static final Index X_MENU_NAME = Indexes0.X_MENU_NAME;
    public static final Index X_MENU_PRIMARY = Indexes0.X_MENU_PRIMARY;
    public static final Index X_MODULE_ENTRY = Indexes0.X_MODULE_ENTRY;
    public static final Index X_MODULE_PRIMARY = Indexes0.X_MODULE_PRIMARY;
    public static final Index X_NUMBER_APP_ID = Indexes0.X_NUMBER_APP_ID;
    public static final Index X_NUMBER_PRIMARY = Indexes0.X_NUMBER_PRIMARY;
    public static final Index X_SOURCE_APP_ID = Indexes0.X_SOURCE_APP_ID;
    public static final Index X_SOURCE_PRIMARY = Indexes0.X_SOURCE_PRIMARY;
    public static final Index X_TABULAR_APP_ID = Indexes0.X_TABULAR_APP_ID;
    public static final Index X_TABULAR_IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE = Indexes0.X_TABULAR_IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE;
    public static final Index X_TABULAR_IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE = Indexes0.X_TABULAR_IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE;
    public static final Index X_TABULAR_PRIMARY = Indexes0.X_TABULAR_PRIMARY;
    public static final Index X_TABULAR_SIGMA = Indexes0.X_TABULAR_SIGMA;
    public static final Index X_TODO_IDXM_X_TODO_SIGMA_STATUS = Indexes0.X_TODO_IDXM_X_TODO_SIGMA_STATUS;
    public static final Index X_TODO_IDXM_X_TODO_SIGMA_TYPE_STATUS = Indexes0.X_TODO_IDXM_X_TODO_SIGMA_TYPE_STATUS;
    public static final Index X_TODO_PRIMARY = Indexes0.X_TODO_PRIMARY;
    public static final Index X_TODO_SIGMA = Indexes0.X_TODO_SIGMA;
    public static final Index X_TODO_SIGMA_2 = Indexes0.X_TODO_SIGMA_2;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index X_ACTIVITY_IDXM_X_ACTIVITY_MODEL_ID_MODEL_KEY = Internal.createIndex("IDXM_X_ACTIVITY_MODEL_ID_MODEL_KEY", XActivity.X_ACTIVITY, new OrderField[] { XActivity.X_ACTIVITY.MODEL_ID, XActivity.X_ACTIVITY.MODEL_KEY }, false);
        public static Index X_ACTIVITY_PRIMARY = Internal.createIndex("PRIMARY", XActivity.X_ACTIVITY, new OrderField[] { XActivity.X_ACTIVITY.KEY }, true);
        public static Index X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_ACTIVITY_ID = Internal.createIndex("IDX_X_ACTIVITY_CHANGE_ACTIVITY_ID", XActivityChange.X_ACTIVITY_CHANGE, new OrderField[] { XActivityChange.X_ACTIVITY_CHANGE.ACTIVITY_ID }, false);
        public static Index X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_CREATED_AT = Internal.createIndex("IDX_X_ACTIVITY_CHANGE_CREATED_AT", XActivityChange.X_ACTIVITY_CHANGE, new OrderField[] { XActivityChange.X_ACTIVITY_CHANGE.CREATED_AT }, false);
        public static Index X_ACTIVITY_CHANGE_PRIMARY = Internal.createIndex("PRIMARY", XActivityChange.X_ACTIVITY_CHANGE, new OrderField[] { XActivityChange.X_ACTIVITY_CHANGE.KEY }, true);
        public static Index X_APP_CODE = Internal.createIndex("CODE", XApp.X_APP, new OrderField[] { XApp.X_APP.CODE }, true);
        public static Index X_APP_IDX_X_APP_NAME = Internal.createIndex("IDX_X_APP_NAME", XApp.X_APP, new OrderField[] { XApp.X_APP.NAME }, false);
        public static Index X_APP_NAME = Internal.createIndex("NAME", XApp.X_APP, new OrderField[] { XApp.X_APP.NAME }, true);
        public static Index X_APP_PATH = Internal.createIndex("PATH", XApp.X_APP, new OrderField[] { XApp.X_APP.PATH, XApp.X_APP.URL_ENTRY }, true);
        public static Index X_APP_PATH_2 = Internal.createIndex("PATH_2", XApp.X_APP, new OrderField[] { XApp.X_APP.PATH, XApp.X_APP.URL_MAIN }, true);
        public static Index X_APP_PRIMARY = Internal.createIndex("PRIMARY", XApp.X_APP, new OrderField[] { XApp.X_APP.KEY }, true);
        public static Index X_ATTACHMENT_FILE_KEY = Internal.createIndex("FILE_KEY", XAttachment.X_ATTACHMENT, new OrderField[] { XAttachment.X_ATTACHMENT.FILE_KEY }, true);
        public static Index X_ATTACHMENT_FILE_PATH = Internal.createIndex("FILE_PATH", XAttachment.X_ATTACHMENT, new OrderField[] { XAttachment.X_ATTACHMENT.FILE_PATH }, true);
        public static Index X_ATTACHMENT_FILE_URL = Internal.createIndex("FILE_URL", XAttachment.X_ATTACHMENT, new OrderField[] { XAttachment.X_ATTACHMENT.FILE_URL }, true);
        public static Index X_ATTACHMENT_PRIMARY = Internal.createIndex("PRIMARY", XAttachment.X_ATTACHMENT, new OrderField[] { XAttachment.X_ATTACHMENT.KEY }, true);
        public static Index X_CATEGORY_APP_ID = Internal.createIndex("APP_ID", XCategory.X_CATEGORY, new OrderField[] { XCategory.X_CATEGORY.APP_ID, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.CODE }, true);
        public static Index X_CATEGORY_IDXM_X_CATEGORY_APP_ID_TYPE_ACTIVE = Internal.createIndex("IDXM_X_CATEGORY_APP_ID_TYPE_ACTIVE", XCategory.X_CATEGORY, new OrderField[] { XCategory.X_CATEGORY.APP_ID, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.ACTIVE }, false);
        public static Index X_CATEGORY_IDXM_X_CATEGORY_SIGMA_TYPE_ACTIVE = Internal.createIndex("IDXM_X_CATEGORY_SIGMA_TYPE_ACTIVE", XCategory.X_CATEGORY, new OrderField[] { XCategory.X_CATEGORY.SIGMA, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.ACTIVE }, false);
        public static Index X_CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", XCategory.X_CATEGORY, new OrderField[] { XCategory.X_CATEGORY.KEY }, true);
        public static Index X_CATEGORY_SIGMA = Internal.createIndex("SIGMA", XCategory.X_CATEGORY, new OrderField[] { XCategory.X_CATEGORY.SIGMA, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.CODE }, true);
        public static Index X_LOG_IDXM_X_LOG_SIGMA_TYPE = Internal.createIndex("IDXM_X_LOG_SIGMA_TYPE", XLog.X_LOG, new OrderField[] { XLog.X_LOG.SIGMA, XLog.X_LOG.TYPE }, false);
        public static Index X_LOG_PRIMARY = Internal.createIndex("PRIMARY", XLog.X_LOG, new OrderField[] { XLog.X_LOG.KEY }, true);
        public static Index X_MENU_IDX_X_MENU_APP_ID = Internal.createIndex("IDX_X_MENU_APP_ID", XMenu.X_MENU, new OrderField[] { XMenu.X_MENU.APP_ID }, false);
        public static Index X_MENU_NAME = Internal.createIndex("NAME", XMenu.X_MENU, new OrderField[] { XMenu.X_MENU.NAME, XMenu.X_MENU.APP_ID }, true);
        public static Index X_MENU_PRIMARY = Internal.createIndex("PRIMARY", XMenu.X_MENU, new OrderField[] { XMenu.X_MENU.KEY }, true);
        public static Index X_MODULE_ENTRY = Internal.createIndex("ENTRY", XModule.X_MODULE, new OrderField[] { XModule.X_MODULE.ENTRY, XModule.X_MODULE.APP_ID }, true);
        public static Index X_MODULE_PRIMARY = Internal.createIndex("PRIMARY", XModule.X_MODULE, new OrderField[] { XModule.X_MODULE.KEY }, true);
        public static Index X_NUMBER_APP_ID = Internal.createIndex("APP_ID", XNumber.X_NUMBER, new OrderField[] { XNumber.X_NUMBER.APP_ID, XNumber.X_NUMBER.IDENTIFIER, XNumber.X_NUMBER.CODE }, true);
        public static Index X_NUMBER_PRIMARY = Internal.createIndex("PRIMARY", XNumber.X_NUMBER, new OrderField[] { XNumber.X_NUMBER.KEY }, true);
        public static Index X_SOURCE_APP_ID = Internal.createIndex("APP_ID", XSource.X_SOURCE, new OrderField[] { XSource.X_SOURCE.APP_ID }, true);
        public static Index X_SOURCE_PRIMARY = Internal.createIndex("PRIMARY", XSource.X_SOURCE, new OrderField[] { XSource.X_SOURCE.KEY }, true);
        public static Index X_TABULAR_APP_ID = Internal.createIndex("APP_ID", XTabular.X_TABULAR, new OrderField[] { XTabular.X_TABULAR.APP_ID, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.CODE }, true);
        public static Index X_TABULAR_IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE = Internal.createIndex("IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE", XTabular.X_TABULAR, new OrderField[] { XTabular.X_TABULAR.APP_ID, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.ACTIVE }, false);
        public static Index X_TABULAR_IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE = Internal.createIndex("IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE", XTabular.X_TABULAR, new OrderField[] { XTabular.X_TABULAR.SIGMA, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.ACTIVE }, false);
        public static Index X_TABULAR_PRIMARY = Internal.createIndex("PRIMARY", XTabular.X_TABULAR, new OrderField[] { XTabular.X_TABULAR.KEY }, true);
        public static Index X_TABULAR_SIGMA = Internal.createIndex("SIGMA", XTabular.X_TABULAR, new OrderField[] { XTabular.X_TABULAR.SIGMA, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.CODE }, true);
        public static Index X_TODO_IDXM_X_TODO_SIGMA_STATUS = Internal.createIndex("IDXM_X_TODO_SIGMA_STATUS", XTodo.X_TODO, new OrderField[] { XTodo.X_TODO.SIGMA, XTodo.X_TODO.STATUS }, false);
        public static Index X_TODO_IDXM_X_TODO_SIGMA_TYPE_STATUS = Internal.createIndex("IDXM_X_TODO_SIGMA_TYPE_STATUS", XTodo.X_TODO, new OrderField[] { XTodo.X_TODO.SIGMA, XTodo.X_TODO.STATUS, XTodo.X_TODO.TYPE }, false);
        public static Index X_TODO_PRIMARY = Internal.createIndex("PRIMARY", XTodo.X_TODO, new OrderField[] { XTodo.X_TODO.KEY }, true);
        public static Index X_TODO_SIGMA = Internal.createIndex("SIGMA", XTodo.X_TODO, new OrderField[] { XTodo.X_TODO.SIGMA, XTodo.X_TODO.CODE }, true);
        public static Index X_TODO_SIGMA_2 = Internal.createIndex("SIGMA_2", XTodo.X_TODO, new OrderField[] { XTodo.X_TODO.SIGMA, XTodo.X_TODO.SERIAL }, true);
    }
}
