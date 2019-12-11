package com.glp.backend.mybatis.generate.factor.pojo;

public class GlpUserCompanyWithBLOBs extends GlpUserCompany {
    /**
     * 经营范围
     * 表字段 : glp_user_company.scope
     */
    private String scope;

    /**
     * 更新毫秒记录
     * 表字段 : glp_user_company.microtime
     */
    private String microtime;

    /**
     * 获取 经营范围 字段:glp_user_company.scope
     *
     * @return glp_user_company.scope, 经营范围
     */
    public String getScope() {
        return scope;
    }

    /**
     * 设置 经营范围 字段:glp_user_company.scope
     *
     * @param scope the value for glp_user_company.scope, 经营范围
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    /**
     * 获取 更新毫秒记录 字段:glp_user_company.microtime
     *
     * @return glp_user_company.microtime, 更新毫秒记录
     */
    public String getMicrotime() {
        return microtime;
    }

    /**
     * 设置 更新毫秒记录 字段:glp_user_company.microtime
     *
     * @param microtime the value for glp_user_company.microtime, 更新毫秒记录
     */
    public void setMicrotime(String microtime) {
        this.microtime = microtime == null ? null : microtime.trim();
    }
}