/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.RRolePerm;
import cn.vertxup.rbac.domain.tables.records.RRolePermRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RRolePermDao extends DAOImpl<RRolePermRecord, cn.vertxup.rbac.domain.tables.pojos.RRolePerm, Record2<String, String>> implements VertxDAO<cn.vertxup.rbac.domain.tables.records.RRolePermRecord,cn.vertxup.rbac.domain.tables.pojos.RRolePerm,org.jooq.Record2<java.lang.String, java.lang.String>> {

    /**
     * Create a new RRolePermDao without any configuration
     */
    public RRolePermDao() {
        super(RRolePerm.R_ROLE_PERM, cn.vertxup.rbac.domain.tables.pojos.RRolePerm.class);
    }

    /**
     * Create a new RRolePermDao with an attached configuration
     */
    public RRolePermDao(Configuration configuration) {
        super(RRolePerm.R_ROLE_PERM, cn.vertxup.rbac.domain.tables.pojos.RRolePerm.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(cn.vertxup.rbac.domain.tables.pojos.RRolePerm object) {
        return compositeKeyRecord(object.getPermId(), object.getRoleId());
    }

    /**
     * Fetch records that have <code>PERM_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.RRolePerm> fetchByPermId(String... values) {
        return fetch(RRolePerm.R_ROLE_PERM.PERM_ID, values);
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.RRolePerm> fetchByRoleId(String... values) {
        return fetch(RRolePerm.R_ROLE_PERM.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>PERM_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.RRolePerm>> fetchByPermIdAsync(List<String> values) {
        return fetchAsync(RRolePerm.R_ROLE_PERM.PERM_ID,values);
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.RRolePerm>> fetchByRoleIdAsync(List<String> values) {
        return fetchAsync(RRolePerm.R_ROLE_PERM.ROLE_ID,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
