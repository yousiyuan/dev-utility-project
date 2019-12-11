package com.glp.backend.mybatis.generate.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;
import java.util.Date;

public class ruleItem extends BaseEntity {
    /**
     * 
     * 表字段 : rule_item.id
     */
    private Integer id;

    /**
     * 模型ID
     * 表字段 : rule_item.model_id
     */
    private Integer modelId;

    /**
     * 子模型ID
     * 表字段 : rule_item.sub_model_id
     */
    private Integer subModelId;

    /**
     * 风险维度ID
     * 表字段 : rule_item.dimension_id
     */
    private Integer dimensionId;

    /**
     * 规则组ID
     * 表字段 : rule_item.rule_group_Id
     */
    private Integer ruleGroupId;

    /**
     * 规则码
     * 表字段 : rule_item.rule_code
     */
    private String ruleCode;

    /**
     * 规则名称
     * 表字段 : rule_item.rule_name
     */
    private String ruleName;

    /**
     * 规则描述
     * 表字段 : rule_item.rule_content
     */
    private String ruleContent;

    /**
     * 规则条件
     * 表字段 : rule_item.rule_condition
     */
    private String ruleCondition;

    /**
     * 规则条件javascript语法
     * 表字段 : rule_item.rule_condition_js
     */
    private String ruleConditionJs;

    /**
     * 规则条件 显示名称
     * 表字段 : rule_item.rule_condition_name
     */
    private String ruleConditionName;

    /**
     * 控制力度
     * 表字段 : rule_item.control_level
     */
    private String controlLevel;

    /**
     * 监控主题编码
     * 表字段 : rule_item.monitor_title_code
     */
    private String monitorTitleCode;

    /**
     * 监控主题
     * 表字段 : rule_item.monitor_title
     */
    private String monitorTitle;

    /**
     * 变量状态（启用：禁用）
     * 表字段 : rule_item.rule_status
     */
    private String ruleStatus;

    /**
     * 锁定周期
     * 表字段 : rule_item.lock_cycle
     */
    private String lockCycle;

    /**
     * 备注
     * 表字段 : rule_item.comments
     */
    private String comments;

    /**
     * 
     * 表字段 : rule_item.created_at
     */
    private Date createdAt;

    /**
     * 
     * 表字段 : rule_item.updated_at
     */
    private Date updatedAt;

    /**
     * 
     * 表字段 : rule_item.created_by
     */
    private String createdBy;

    /**
     * 
     * 表字段 : rule_item.updated_by
     */
    private String updatedBy;

    /**
     * 
     * 表字段 : rule_item.version
     */
    private Integer version;

    /**
     * 规则id
     * 表字段 : rule_item.sys_rule_id
     */
    private Integer sysRuleId;

    /**
     * 时间表达式
     * 表字段 : rule_item.cron_type
     */
    private String cronType;

    /**
     * 定时任务名称
     * 表字段 : rule_item.cron_name
     */
    private String cronName;

    /**
     * 风险类型
     * 表字段 : rule_item.risk_type
     */
    private String riskType;

    /**
     * 定时任务类型
     * 表字段 : rule_item.timing_type
     */
    private String timingType;

    /**
     * 规则类型
     * 表字段 : rule_item.rule_type
     */
    private String ruleType;

    /**
     * 业务类型暂不使用
     * 表字段 : rule_item.business_type
     */
    private String businessType;

    /**
     * 风险级别
     * 表字段 : rule_item.risk_level
     */
    private Integer riskLevel;

    /**
     * 获取  字段:rule_item.id
     *
     * @return rule_item.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:rule_item.id
     *
     * @param id the value for rule_item.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 模型ID 字段:rule_item.model_id
     *
     * @return rule_item.model_id, 模型ID
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * 设置 模型ID 字段:rule_item.model_id
     *
     * @param modelId the value for rule_item.model_id, 模型ID
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * 获取 子模型ID 字段:rule_item.sub_model_id
     *
     * @return rule_item.sub_model_id, 子模型ID
     */
    public Integer getSubModelId() {
        return subModelId;
    }

    /**
     * 设置 子模型ID 字段:rule_item.sub_model_id
     *
     * @param subModelId the value for rule_item.sub_model_id, 子模型ID
     */
    public void setSubModelId(Integer subModelId) {
        this.subModelId = subModelId;
    }

    /**
     * 获取 风险维度ID 字段:rule_item.dimension_id
     *
     * @return rule_item.dimension_id, 风险维度ID
     */
    public Integer getDimensionId() {
        return dimensionId;
    }

    /**
     * 设置 风险维度ID 字段:rule_item.dimension_id
     *
     * @param dimensionId the value for rule_item.dimension_id, 风险维度ID
     */
    public void setDimensionId(Integer dimensionId) {
        this.dimensionId = dimensionId;
    }

    /**
     * 获取 规则组ID 字段:rule_item.rule_group_Id
     *
     * @return rule_item.rule_group_Id, 规则组ID
     */
    public Integer getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * 设置 规则组ID 字段:rule_item.rule_group_Id
     *
     * @param ruleGroupId the value for rule_item.rule_group_Id, 规则组ID
     */
    public void setRuleGroupId(Integer ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * 获取 规则码 字段:rule_item.rule_code
     *
     * @return rule_item.rule_code, 规则码
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置 规则码 字段:rule_item.rule_code
     *
     * @param ruleCode the value for rule_item.rule_code, 规则码
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    /**
     * 获取 规则名称 字段:rule_item.rule_name
     *
     * @return rule_item.rule_name, 规则名称
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * 设置 规则名称 字段:rule_item.rule_name
     *
     * @param ruleName the value for rule_item.rule_name, 规则名称
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    /**
     * 获取 规则描述 字段:rule_item.rule_content
     *
     * @return rule_item.rule_content, 规则描述
     */
    public String getRuleContent() {
        return ruleContent;
    }

    /**
     * 设置 规则描述 字段:rule_item.rule_content
     *
     * @param ruleContent the value for rule_item.rule_content, 规则描述
     */
    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent == null ? null : ruleContent.trim();
    }

    /**
     * 获取 规则条件 字段:rule_item.rule_condition
     *
     * @return rule_item.rule_condition, 规则条件
     */
    public String getRuleCondition() {
        return ruleCondition;
    }

    /**
     * 设置 规则条件 字段:rule_item.rule_condition
     *
     * @param ruleCondition the value for rule_item.rule_condition, 规则条件
     */
    public void setRuleCondition(String ruleCondition) {
        this.ruleCondition = ruleCondition == null ? null : ruleCondition.trim();
    }

    /**
     * 获取 规则条件javascript语法 字段:rule_item.rule_condition_js
     *
     * @return rule_item.rule_condition_js, 规则条件javascript语法
     */
    public String getRuleConditionJs() {
        return ruleConditionJs;
    }

    /**
     * 设置 规则条件javascript语法 字段:rule_item.rule_condition_js
     *
     * @param ruleConditionJs the value for rule_item.rule_condition_js, 规则条件javascript语法
     */
    public void setRuleConditionJs(String ruleConditionJs) {
        this.ruleConditionJs = ruleConditionJs == null ? null : ruleConditionJs.trim();
    }

    /**
     * 获取 规则条件 显示名称 字段:rule_item.rule_condition_name
     *
     * @return rule_item.rule_condition_name, 规则条件 显示名称
     */
    public String getRuleConditionName() {
        return ruleConditionName;
    }

    /**
     * 设置 规则条件 显示名称 字段:rule_item.rule_condition_name
     *
     * @param ruleConditionName the value for rule_item.rule_condition_name, 规则条件 显示名称
     */
    public void setRuleConditionName(String ruleConditionName) {
        this.ruleConditionName = ruleConditionName == null ? null : ruleConditionName.trim();
    }

    /**
     * 获取 控制力度 字段:rule_item.control_level
     *
     * @return rule_item.control_level, 控制力度
     */
    public String getControlLevel() {
        return controlLevel;
    }

    /**
     * 设置 控制力度 字段:rule_item.control_level
     *
     * @param controlLevel the value for rule_item.control_level, 控制力度
     */
    public void setControlLevel(String controlLevel) {
        this.controlLevel = controlLevel == null ? null : controlLevel.trim();
    }

    /**
     * 获取 监控主题编码 字段:rule_item.monitor_title_code
     *
     * @return rule_item.monitor_title_code, 监控主题编码
     */
    public String getMonitorTitleCode() {
        return monitorTitleCode;
    }

    /**
     * 设置 监控主题编码 字段:rule_item.monitor_title_code
     *
     * @param monitorTitleCode the value for rule_item.monitor_title_code, 监控主题编码
     */
    public void setMonitorTitleCode(String monitorTitleCode) {
        this.monitorTitleCode = monitorTitleCode == null ? null : monitorTitleCode.trim();
    }

    /**
     * 获取 监控主题 字段:rule_item.monitor_title
     *
     * @return rule_item.monitor_title, 监控主题
     */
    public String getMonitorTitle() {
        return monitorTitle;
    }

    /**
     * 设置 监控主题 字段:rule_item.monitor_title
     *
     * @param monitorTitle the value for rule_item.monitor_title, 监控主题
     */
    public void setMonitorTitle(String monitorTitle) {
        this.monitorTitle = monitorTitle == null ? null : monitorTitle.trim();
    }

    /**
     * 获取 变量状态（启用：禁用） 字段:rule_item.rule_status
     *
     * @return rule_item.rule_status, 变量状态（启用：禁用）
     */
    public String getRuleStatus() {
        return ruleStatus;
    }

    /**
     * 设置 变量状态（启用：禁用） 字段:rule_item.rule_status
     *
     * @param ruleStatus the value for rule_item.rule_status, 变量状态（启用：禁用）
     */
    public void setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus == null ? null : ruleStatus.trim();
    }

    /**
     * 获取 锁定周期 字段:rule_item.lock_cycle
     *
     * @return rule_item.lock_cycle, 锁定周期
     */
    public String getLockCycle() {
        return lockCycle;
    }

    /**
     * 设置 锁定周期 字段:rule_item.lock_cycle
     *
     * @param lockCycle the value for rule_item.lock_cycle, 锁定周期
     */
    public void setLockCycle(String lockCycle) {
        this.lockCycle = lockCycle == null ? null : lockCycle.trim();
    }

    /**
     * 获取 备注 字段:rule_item.comments
     *
     * @return rule_item.comments, 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置 备注 字段:rule_item.comments
     *
     * @param comments the value for rule_item.comments, 备注
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * 获取  字段:rule_item.created_at
     *
     * @return rule_item.created_at, 
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置  字段:rule_item.created_at
     *
     * @param createdAt the value for rule_item.created_at, 
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取  字段:rule_item.updated_at
     *
     * @return rule_item.updated_at, 
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置  字段:rule_item.updated_at
     *
     * @param updatedAt the value for rule_item.updated_at, 
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取  字段:rule_item.created_by
     *
     * @return rule_item.created_by, 
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置  字段:rule_item.created_by
     *
     * @param createdBy the value for rule_item.created_by, 
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 获取  字段:rule_item.updated_by
     *
     * @return rule_item.updated_by, 
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置  字段:rule_item.updated_by
     *
     * @param updatedBy the value for rule_item.updated_by, 
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 获取  字段:rule_item.version
     *
     * @return rule_item.version, 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置  字段:rule_item.version
     *
     * @param version the value for rule_item.version, 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取 规则id 字段:rule_item.sys_rule_id
     *
     * @return rule_item.sys_rule_id, 规则id
     */
    public Integer getSysRuleId() {
        return sysRuleId;
    }

    /**
     * 设置 规则id 字段:rule_item.sys_rule_id
     *
     * @param sysRuleId the value for rule_item.sys_rule_id, 规则id
     */
    public void setSysRuleId(Integer sysRuleId) {
        this.sysRuleId = sysRuleId;
    }

    /**
     * 获取 时间表达式 字段:rule_item.cron_type
     *
     * @return rule_item.cron_type, 时间表达式
     */
    public String getCronType() {
        return cronType;
    }

    /**
     * 设置 时间表达式 字段:rule_item.cron_type
     *
     * @param cronType the value for rule_item.cron_type, 时间表达式
     */
    public void setCronType(String cronType) {
        this.cronType = cronType == null ? null : cronType.trim();
    }

    /**
     * 获取 定时任务名称 字段:rule_item.cron_name
     *
     * @return rule_item.cron_name, 定时任务名称
     */
    public String getCronName() {
        return cronName;
    }

    /**
     * 设置 定时任务名称 字段:rule_item.cron_name
     *
     * @param cronName the value for rule_item.cron_name, 定时任务名称
     */
    public void setCronName(String cronName) {
        this.cronName = cronName == null ? null : cronName.trim();
    }

    /**
     * 获取 风险类型 字段:rule_item.risk_type
     *
     * @return rule_item.risk_type, 风险类型
     */
    public String getRiskType() {
        return riskType;
    }

    /**
     * 设置 风险类型 字段:rule_item.risk_type
     *
     * @param riskType the value for rule_item.risk_type, 风险类型
     */
    public void setRiskType(String riskType) {
        this.riskType = riskType == null ? null : riskType.trim();
    }

    /**
     * 获取 定时任务类型 字段:rule_item.timing_type
     *
     * @return rule_item.timing_type, 定时任务类型
     */
    public String getTimingType() {
        return timingType;
    }

    /**
     * 设置 定时任务类型 字段:rule_item.timing_type
     *
     * @param timingType the value for rule_item.timing_type, 定时任务类型
     */
    public void setTimingType(String timingType) {
        this.timingType = timingType == null ? null : timingType.trim();
    }

    /**
     * 获取 规则类型 字段:rule_item.rule_type
     *
     * @return rule_item.rule_type, 规则类型
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * 设置 规则类型 字段:rule_item.rule_type
     *
     * @param ruleType the value for rule_item.rule_type, 规则类型
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    /**
     * 获取 业务类型暂不使用 字段:rule_item.business_type
     *
     * @return rule_item.business_type, 业务类型暂不使用
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置 业务类型暂不使用 字段:rule_item.business_type
     *
     * @param businessType the value for rule_item.business_type, 业务类型暂不使用
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * 获取 风险级别 字段:rule_item.risk_level
     *
     * @return rule_item.risk_level, 风险级别
     */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    /**
     * 设置 风险级别 字段:rule_item.risk_level
     *
     * @param riskLevel the value for rule_item.risk_level, 风险级别
     */
    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }
}