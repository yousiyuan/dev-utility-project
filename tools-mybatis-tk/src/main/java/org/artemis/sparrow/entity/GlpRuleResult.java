package org.artemis.sparrow.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "glp_rule_result")
public class GlpRuleResult {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 查询编号
     */
    @Column(name = "search_code")
    private String searchCode;

    /**
     * 客户Id
     */
    @Column(name = "cust_id")
    private String custId;

    /**
     * 项目大类
     */
    private String type;

    /**
     * 数据来源
     */
    private String source;

    /**
     * 项目小类
     */
    @Column(name = "project_type")
    private String projectType;

    /**
     * 预警规则
     */
    @Column(name = "project_sub_type")
    private String projectSubType;

    /**
     * 是否命中
     */
    @Column(name = "is_hit")
    private String isHit;

    /**
     * 规则编号
     */
    @Column(name = "rule_code")
    private String ruleCode;

    /**
     * 规则Id
     */
    @Column(name = "rule_id")
    private String ruleId;

    private String result;

    /**
     * 查询时间
     */
    @Column(name = "search_time")
    private String searchTime;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 修改人
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * 修改时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 客户名称
     */
    @Column(name = "cust_name")
    private String custName;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取查询编号
     *
     * @return search_code - 查询编号
     */
    public String getSearchCode() {
        return searchCode;
    }

    /**
     * 设置查询编号
     *
     * @param searchCode 查询编号
     */
    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode == null ? null : searchCode.trim();
    }

    /**
     * 获取客户Id
     *
     * @return cust_id - 客户Id
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置客户Id
     *
     * @param custId 客户Id
     */
    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    /**
     * 获取项目大类
     *
     * @return type - 项目大类
     */
    public String getType() {
        return type;
    }

    /**
     * 设置项目大类
     *
     * @param type 项目大类
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取数据来源
     *
     * @return source - 数据来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置数据来源
     *
     * @param source 数据来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取项目小类
     *
     * @return project_type - 项目小类
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * 设置项目小类
     *
     * @param projectType 项目小类
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    /**
     * 获取预警规则
     *
     * @return project_sub_type - 预警规则
     */
    public String getProjectSubType() {
        return projectSubType;
    }

    /**
     * 设置预警规则
     *
     * @param projectSubType 预警规则
     */
    public void setProjectSubType(String projectSubType) {
        this.projectSubType = projectSubType == null ? null : projectSubType.trim();
    }

    /**
     * 获取是否命中
     *
     * @return is_hit - 是否命中
     */
    public String getIsHit() {
        return isHit;
    }

    /**
     * 设置是否命中
     *
     * @param isHit 是否命中
     */
    public void setIsHit(String isHit) {
        this.isHit = isHit == null ? null : isHit.trim();
    }

    /**
     * 获取规则编号
     *
     * @return rule_code - 规则编号
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置规则编号
     *
     * @param ruleCode 规则编号
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    /**
     * 获取规则Id
     *
     * @return rule_id - 规则Id
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * 设置规则Id
     *
     * @param ruleId 规则Id
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    /**
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * 获取查询时间
     *
     * @return search_time - 查询时间
     */
    public String getSearchTime() {
        return searchTime;
    }

    /**
     * 设置查询时间
     *
     * @param searchTime 查询时间
     */
    public void setSearchTime(String searchTime) {
        this.searchTime = searchTime == null ? null : searchTime.trim();
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 获取创建时间
     *
     * @return created_at - 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取修改人
     *
     * @return updated_by - 修改人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置修改人
     *
     * @param updatedBy 修改人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 获取修改时间
     *
     * @return updated_at - 修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt 修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取客户名称
     *
     * @return cust_name - 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置客户名称
     *
     * @param custName 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }
}