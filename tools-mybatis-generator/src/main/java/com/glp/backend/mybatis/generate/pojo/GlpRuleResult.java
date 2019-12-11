package com.glp.backend.mybatis.generate.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GlpRuleResult extends BaseEntity {
    /**
     * 主键id
     * 表字段 : glp_rule_result.id
     */
    private Integer id;

    /**
     * 查询编号
     * 表字段 : glp_rule_result.search_code
     */
    private String searchCode;

    /**
     * 客户Id
     * 表字段 : glp_rule_result.cust_id
     */
    private String custId;

    /**
     * 项目大类
     * 表字段 : glp_rule_result.type
     */
    private String type;

    /**
     * 数据来源
     * 表字段 : glp_rule_result.source
     */
    private String source;

    /**
     * 项目小类
     * 表字段 : glp_rule_result.project_type
     */
    private String projectType;

    /**
     * 预警规则
     * 表字段 : glp_rule_result.project_sub_type
     */
    private String projectSubType;

    /**
     * 是否命中
     * 表字段 : glp_rule_result.is_hit
     */
    private String isHit;

    /**
     * 规则编号
     * 表字段 : glp_rule_result.rule_code
     */
    private String ruleCode;

    /**
     * 规则Id
     * 表字段 : glp_rule_result.rule_id
     */
    private String ruleId;

    /**
     * 
     * 表字段 : glp_rule_result.result
     */
    private String result;

    /**
     * 查询时间
     * 表字段 : glp_rule_result.search_time
     */
    private String searchTime;

    /**
     * 创建人
     * 表字段 : glp_rule_result.created_by
     */
    private String createdBy;

    /**
     * 创建时间
     * 表字段 : glp_rule_result.created_at
     */
    private Date createdAt;

    /**
     * 修改人
     * 表字段 : glp_rule_result.updated_by
     */
    private String updatedBy;

    /**
     * 修改时间
     * 表字段 : glp_rule_result.updated_at
     */
    private Date updatedAt;

    /**
     * 版本号
     * 表字段 : glp_rule_result.version
     */
    private Integer version;

    /**
     * 客户名称
     * 表字段 : glp_rule_result.cust_name
     */
    private String custName;

    /**
     * 获取 主键id 字段:glp_rule_result.id
     *
     * @return glp_rule_result.id, 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键id 字段:glp_rule_result.id
     *
     * @param id the value for glp_rule_result.id, 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 查询编号 字段:glp_rule_result.search_code
     *
     * @return glp_rule_result.search_code, 查询编号
     */
    public String getSearchCode() {
        return searchCode;
    }

    /**
     * 设置 查询编号 字段:glp_rule_result.search_code
     *
     * @param searchCode the value for glp_rule_result.search_code, 查询编号
     */
    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode == null ? null : searchCode.trim();
    }

    /**
     * 获取 客户Id 字段:glp_rule_result.cust_id
     *
     * @return glp_rule_result.cust_id, 客户Id
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置 客户Id 字段:glp_rule_result.cust_id
     *
     * @param custId the value for glp_rule_result.cust_id, 客户Id
     */
    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    /**
     * 获取 项目大类 字段:glp_rule_result.type
     *
     * @return glp_rule_result.type, 项目大类
     */
    public String getType() {
        return type;
    }

    /**
     * 设置 项目大类 字段:glp_rule_result.type
     *
     * @param type the value for glp_rule_result.type, 项目大类
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取 数据来源 字段:glp_rule_result.source
     *
     * @return glp_rule_result.source, 数据来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置 数据来源 字段:glp_rule_result.source
     *
     * @param source the value for glp_rule_result.source, 数据来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取 项目小类 字段:glp_rule_result.project_type
     *
     * @return glp_rule_result.project_type, 项目小类
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * 设置 项目小类 字段:glp_rule_result.project_type
     *
     * @param projectType the value for glp_rule_result.project_type, 项目小类
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    /**
     * 获取 预警规则 字段:glp_rule_result.project_sub_type
     *
     * @return glp_rule_result.project_sub_type, 预警规则
     */
    public String getProjectSubType() {
        return projectSubType;
    }

    /**
     * 设置 预警规则 字段:glp_rule_result.project_sub_type
     *
     * @param projectSubType the value for glp_rule_result.project_sub_type, 预警规则
     */
    public void setProjectSubType(String projectSubType) {
        this.projectSubType = projectSubType == null ? null : projectSubType.trim();
    }

    /**
     * 获取 是否命中 字段:glp_rule_result.is_hit
     *
     * @return glp_rule_result.is_hit, 是否命中
     */
    public String getIsHit() {
        return isHit;
    }

    /**
     * 设置 是否命中 字段:glp_rule_result.is_hit
     *
     * @param isHit the value for glp_rule_result.is_hit, 是否命中
     */
    public void setIsHit(String isHit) {
        this.isHit = isHit == null ? null : isHit.trim();
    }

    /**
     * 获取 规则编号 字段:glp_rule_result.rule_code
     *
     * @return glp_rule_result.rule_code, 规则编号
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置 规则编号 字段:glp_rule_result.rule_code
     *
     * @param ruleCode the value for glp_rule_result.rule_code, 规则编号
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    /**
     * 获取 规则Id 字段:glp_rule_result.rule_id
     *
     * @return glp_rule_result.rule_id, 规则Id
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * 设置 规则Id 字段:glp_rule_result.rule_id
     *
     * @param ruleId the value for glp_rule_result.rule_id, 规则Id
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    /**
     * 获取  字段:glp_rule_result.result
     *
     * @return glp_rule_result.result, 
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置  字段:glp_rule_result.result
     *
     * @param result the value for glp_rule_result.result, 
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * 获取 查询时间 字段:glp_rule_result.search_time
     *
     * @return glp_rule_result.search_time, 查询时间
     */
    public String getSearchTime() {
        return searchTime;
    }

    /**
     * 设置 查询时间 字段:glp_rule_result.search_time
     *
     * @param searchTime the value for glp_rule_result.search_time, 查询时间
     */
    public void setSearchTime(String searchTime) {
        this.searchTime = searchTime == null ? null : searchTime.trim();
    }

    /**
     * 获取 创建人 字段:glp_rule_result.created_by
     *
     * @return glp_rule_result.created_by, 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置 创建人 字段:glp_rule_result.created_by
     *
     * @param createdBy the value for glp_rule_result.created_by, 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 获取 创建时间 字段:glp_rule_result.created_at
     *
     * @return glp_rule_result.created_at, 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 创建时间 字段:glp_rule_result.created_at
     *
     * @param createdAt the value for glp_rule_result.created_at, 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 修改人 字段:glp_rule_result.updated_by
     *
     * @return glp_rule_result.updated_by, 修改人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置 修改人 字段:glp_rule_result.updated_by
     *
     * @param updatedBy the value for glp_rule_result.updated_by, 修改人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 获取 修改时间 字段:glp_rule_result.updated_at
     *
     * @return glp_rule_result.updated_at, 修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置 修改时间 字段:glp_rule_result.updated_at
     *
     * @param updatedAt the value for glp_rule_result.updated_at, 修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取 版本号 字段:glp_rule_result.version
     *
     * @return glp_rule_result.version, 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置 版本号 字段:glp_rule_result.version
     *
     * @param version the value for glp_rule_result.version, 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取 客户名称 字段:glp_rule_result.cust_name
     *
     * @return glp_rule_result.cust_name, 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置 客户名称 字段:glp_rule_result.cust_name
     *
     * @param custName the value for glp_rule_result.cust_name, 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "GlpRuleResult{" +
                "id=" + id +
                ", searchCode='" + searchCode + '\'' +
                ", type='" + type + '\'' +
                ", isHit='" + isHit + '\'' +
                ", ruleCode='" + ruleCode + '\'' +
                ", ruleId='" + ruleId + '\'' +
                ", result='" + result + '\'' +
                ", createdAt=" + format.format(createdAt) +
                '}';
    }
}