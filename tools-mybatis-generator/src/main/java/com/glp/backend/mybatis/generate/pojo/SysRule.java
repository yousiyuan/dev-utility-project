package com.glp.backend.mybatis.generate.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;
import java.util.Date;

public class SysRule extends BaseEntity {
    /**
     * 
     * 表字段 : sys_rule.id
     */
    private Integer id;

    /**
     * 模型id
     * 表字段 : sys_rule.model_id
     */
    private Integer modelId;

    /**
     * 规则码
     * 表字段 : sys_rule.code
     */
    private String code;

    /**
     * 规则类型(评分卡指标规则:PZ | 评分等级规则:PD | 风险策略规则:FC | 风险规则规则:FG | 风险等级规则:FD)
     * 表字段 : sys_rule.type
     */
    private String type;

    /**
     * 
     * 表字段 : sys_rule.condition
     */
    private String condition;

    /**
     * 
     * 表字段 : sys_rule.condition_js
     */
    private String conditionJs;

    /**
     * 
     * 表字段 : sys_rule.condition_name
     */
    private String conditionName;

    /**
     * 结果
     * 表字段 : sys_rule.result
     */
    private String result;

    /**
     * 
     * 表字段 : sys_rule.created_at
     */
    private Date createdAt;

    /**
     * 
     * 表字段 : sys_rule.updated_at
     */
    private Date updatedAt;

    /**
     * 
     * 表字段 : sys_rule.created_by
     */
    private String createdBy;

    /**
     * 
     * 表字段 : sys_rule.updated_by
     */
    private String updatedBy;

    /**
     * 
     * 表字段 : sys_rule.version
     */
    private Integer version;

    private ruleItem ruleItem;

    /**
     * 获取  字段:sys_rule.id
     *
     * @return sys_rule.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:sys_rule.id
     *
     * @param id the value for sys_rule.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 模型id 字段:sys_rule.model_id
     *
     * @return sys_rule.model_id, 模型id
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * 设置 模型id 字段:sys_rule.model_id
     *
     * @param modelId the value for sys_rule.model_id, 模型id
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * 获取 规则码 字段:sys_rule.code
     *
     * @return sys_rule.code, 规则码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置 规则码 字段:sys_rule.code
     *
     * @param code the value for sys_rule.code, 规则码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取 规则类型(评分卡指标规则:PZ | 评分等级规则:PD | 风险策略规则:FC | 风险规则规则:FG | 风险等级规则:FD) 字段:sys_rule.type
     *
     * @return sys_rule.type, 规则类型(评分卡指标规则:PZ | 评分等级规则:PD | 风险策略规则:FC | 风险规则规则:FG | 风险等级规则:FD)
     */
    public String getType() {
        return type;
    }

    /**
     * 设置 规则类型(评分卡指标规则:PZ | 评分等级规则:PD | 风险策略规则:FC | 风险规则规则:FG | 风险等级规则:FD) 字段:sys_rule.type
     *
     * @param type the value for sys_rule.type, 规则类型(评分卡指标规则:PZ | 评分等级规则:PD | 风险策略规则:FC | 风险规则规则:FG | 风险等级规则:FD)
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取  字段:sys_rule.condition
     *
     * @return sys_rule.condition, 
     */
    public String getCondition() {
        return condition;
    }

    /**
     * 设置  字段:sys_rule.condition
     *
     * @param condition the value for sys_rule.condition, 
     */
    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    /**
     * 获取  字段:sys_rule.condition_js
     *
     * @return sys_rule.condition_js, 
     */
    public String getConditionJs() {
        return conditionJs;
    }

    /**
     * 设置  字段:sys_rule.condition_js
     *
     * @param conditionJs the value for sys_rule.condition_js, 
     */
    public void setConditionJs(String conditionJs) {
        this.conditionJs = conditionJs == null ? null : conditionJs.trim();
    }

    /**
     * 获取  字段:sys_rule.condition_name
     *
     * @return sys_rule.condition_name, 
     */
    public String getConditionName() {
        return conditionName;
    }

    /**
     * 设置  字段:sys_rule.condition_name
     *
     * @param conditionName the value for sys_rule.condition_name, 
     */
    public void setConditionName(String conditionName) {
        this.conditionName = conditionName == null ? null : conditionName.trim();
    }

    /**
     * 获取 结果 字段:sys_rule.result
     *
     * @return sys_rule.result, 结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置 结果 字段:sys_rule.result
     *
     * @param result the value for sys_rule.result, 结果
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * 获取  字段:sys_rule.created_at
     *
     * @return sys_rule.created_at, 
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置  字段:sys_rule.created_at
     *
     * @param createdAt the value for sys_rule.created_at, 
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取  字段:sys_rule.updated_at
     *
     * @return sys_rule.updated_at, 
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置  字段:sys_rule.updated_at
     *
     * @param updatedAt the value for sys_rule.updated_at, 
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取  字段:sys_rule.created_by
     *
     * @return sys_rule.created_by, 
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置  字段:sys_rule.created_by
     *
     * @param createdBy the value for sys_rule.created_by, 
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 获取  字段:sys_rule.updated_by
     *
     * @return sys_rule.updated_by, 
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置  字段:sys_rule.updated_by
     *
     * @param updatedBy the value for sys_rule.updated_by, 
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 获取  字段:sys_rule.version
     *
     * @return sys_rule.version, 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置  字段:sys_rule.version
     *
     * @param version the value for sys_rule.version, 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    public ruleItem getruleItem() {
        return ruleItem;
    }

    public void setruleItem(ruleItem ruleItem) {
        this.ruleItem=ruleItem;
    }
}