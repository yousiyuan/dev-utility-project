package com.glp.backend.mybatis.generate.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;
import java.util.Date;

public class StVariableDefine extends BaseEntity {
    /**
     * 
     * 表字段 : st_variable_define.id
     */
    private Integer id;

    /**
     * 变量大分类ID
     * 表字段 : st_variable_define.category_id
     */
    private Integer categoryId;

    /**
     * 变量的分组ID
     * 表字段 : st_variable_define.group_id
     */
    private Integer groupId;

    /**
     * 变量的分组名称
     * 表字段 : st_variable_define.group_name
     */
    private String groupName;

    /**
     * 变量中文名称
     * 表字段 : st_variable_define.chinese_name
     */
    private String chineseName;

    /**
     * 变量描述
     * 表字段 : st_variable_define.description
     */
    private String description;

    /**
     * 变量名称（英文）
     * 表字段 : st_variable_define.name
     */
    private String name;

    /**
     * 变量类型（STRING，NUMBER）
     * 表字段 : st_variable_define.type
     */
    private String type;

    /**
     * 变量控件类型
     * 表字段 : st_variable_define.control_type
     */
    private String controlType;

    /**
     * 变量值列表（用逗号分隔）
     * 表字段 : st_variable_define.value_list
     */
    private String valueList;

    /**
     * 变量默认值
     * 表字段 : st_variable_define.default_value
     */
    private String defaultValue;

    /**
     * 变量状态（ENABLED，DISABLED）

     * 表字段 : st_variable_define.status
     */
    private String status;

    /**
     * 变量主题
     * 表字段 : st_variable_define.subject
     */
    private String subject;

    /**
     * 主题数据类型
     * 表字段 : st_variable_define.subject_data_type
     */
    private String subjectDataType;

    /**
     * 变量来源
     * 表字段 : st_variable_define.variable_source
     */
    private String variableSource;

    /**
     * 数据类型（A:普通变量，B:业务变量，C:汇数平台变量，D:衍生变量）
     * 表字段 : st_variable_define.data_type
     */
    private String dataType;

    /**
     * 
     * 表字段 : st_variable_define.variable_condition
     */
    private String variableCondition;

    /**
     * 
     * 表字段 : st_variable_define.variable_condition_js
     */
    private String variableConditionJs;

    /**
     * 
     * 表字段 : st_variable_define.variable_condition_name
     */
    private String variableConditionName;

    /**
     * 创建时间
     * 表字段 : st_variable_define.created_at
     */
    private Date createdAt;

    /**
     * 更新时间
     * 表字段 : st_variable_define.updated_at
     */
    private Date updatedAt;

    /**
     * 
     * 表字段 : st_variable_define.created_by
     */
    private String createdBy;

    /**
     * 
     * 表字段 : st_variable_define.updated_by
     */
    private String updatedBy;

    /**
     * 
     * 表字段 : st_variable_define.version
     */
    private Integer version;

    /**
     * 指标号
     * 表字段 : st_variable_define.kpi_no
     */
    private Integer kpiNo;

    /**
     * 获取  字段:st_variable_define.id
     *
     * @return st_variable_define.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:st_variable_define.id
     *
     * @param id the value for st_variable_define.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 变量大分类ID 字段:st_variable_define.category_id
     *
     * @return st_variable_define.category_id, 变量大分类ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置 变量大分类ID 字段:st_variable_define.category_id
     *
     * @param categoryId the value for st_variable_define.category_id, 变量大分类ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取 变量的分组ID 字段:st_variable_define.group_id
     *
     * @return st_variable_define.group_id, 变量的分组ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置 变量的分组ID 字段:st_variable_define.group_id
     *
     * @param groupId the value for st_variable_define.group_id, 变量的分组ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 变量的分组名称 字段:st_variable_define.group_name
     *
     * @return st_variable_define.group_name, 变量的分组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置 变量的分组名称 字段:st_variable_define.group_name
     *
     * @param groupName the value for st_variable_define.group_name, 变量的分组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 获取 变量中文名称 字段:st_variable_define.chinese_name
     *
     * @return st_variable_define.chinese_name, 变量中文名称
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * 设置 变量中文名称 字段:st_variable_define.chinese_name
     *
     * @param chineseName the value for st_variable_define.chinese_name, 变量中文名称
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * 获取 变量描述 字段:st_variable_define.description
     *
     * @return st_variable_define.description, 变量描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 变量描述 字段:st_variable_define.description
     *
     * @param description the value for st_variable_define.description, 变量描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取 变量名称（英文） 字段:st_variable_define.name
     *
     * @return st_variable_define.name, 变量名称（英文）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 变量名称（英文） 字段:st_variable_define.name
     *
     * @param name the value for st_variable_define.name, 变量名称（英文）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 变量类型（STRING，NUMBER） 字段:st_variable_define.type
     *
     * @return st_variable_define.type, 变量类型（STRING，NUMBER）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置 变量类型（STRING，NUMBER） 字段:st_variable_define.type
     *
     * @param type the value for st_variable_define.type, 变量类型（STRING，NUMBER）
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取 变量控件类型 字段:st_variable_define.control_type
     *
     * @return st_variable_define.control_type, 变量控件类型
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * 设置 变量控件类型 字段:st_variable_define.control_type
     *
     * @param controlType the value for st_variable_define.control_type, 变量控件类型
     */
    public void setControlType(String controlType) {
        this.controlType = controlType == null ? null : controlType.trim();
    }

    /**
     * 获取 变量值列表（用逗号分隔） 字段:st_variable_define.value_list
     *
     * @return st_variable_define.value_list, 变量值列表（用逗号分隔）
     */
    public String getValueList() {
        return valueList;
    }

    /**
     * 设置 变量值列表（用逗号分隔） 字段:st_variable_define.value_list
     *
     * @param valueList the value for st_variable_define.value_list, 变量值列表（用逗号分隔）
     */
    public void setValueList(String valueList) {
        this.valueList = valueList == null ? null : valueList.trim();
    }

    /**
     * 获取 变量默认值 字段:st_variable_define.default_value
     *
     * @return st_variable_define.default_value, 变量默认值
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置 变量默认值 字段:st_variable_define.default_value
     *
     * @param defaultValue the value for st_variable_define.default_value, 变量默认值
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    /**
     * 获取 变量状态（ENABLED，DISABLED）
 字段:st_variable_define.status
     *
     * @return st_variable_define.status, 变量状态（ENABLED，DISABLED）

     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 变量状态（ENABLED，DISABLED）
 字段:st_variable_define.status
     *
     * @param status the value for st_variable_define.status, 变量状态（ENABLED，DISABLED）

     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取 变量主题 字段:st_variable_define.subject
     *
     * @return st_variable_define.subject, 变量主题
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置 变量主题 字段:st_variable_define.subject
     *
     * @param subject the value for st_variable_define.subject, 变量主题
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * 获取 主题数据类型 字段:st_variable_define.subject_data_type
     *
     * @return st_variable_define.subject_data_type, 主题数据类型
     */
    public String getSubjectDataType() {
        return subjectDataType;
    }

    /**
     * 设置 主题数据类型 字段:st_variable_define.subject_data_type
     *
     * @param subjectDataType the value for st_variable_define.subject_data_type, 主题数据类型
     */
    public void setSubjectDataType(String subjectDataType) {
        this.subjectDataType = subjectDataType == null ? null : subjectDataType.trim();
    }

    /**
     * 获取 变量来源 字段:st_variable_define.variable_source
     *
     * @return st_variable_define.variable_source, 变量来源
     */
    public String getVariableSource() {
        return variableSource;
    }

    /**
     * 设置 变量来源 字段:st_variable_define.variable_source
     *
     * @param variableSource the value for st_variable_define.variable_source, 变量来源
     */
    public void setVariableSource(String variableSource) {
        this.variableSource = variableSource == null ? null : variableSource.trim();
    }

    /**
     * 获取 数据类型（A:普通变量，B:业务变量，C:汇数平台变量，D:衍生变量） 字段:st_variable_define.data_type
     *
     * @return st_variable_define.data_type, 数据类型（A:普通变量，B:业务变量，C:汇数平台变量，D:衍生变量）
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置 数据类型（A:普通变量，B:业务变量，C:汇数平台变量，D:衍生变量） 字段:st_variable_define.data_type
     *
     * @param dataType the value for st_variable_define.data_type, 数据类型（A:普通变量，B:业务变量，C:汇数平台变量，D:衍生变量）
     */
    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    /**
     * 获取  字段:st_variable_define.variable_condition
     *
     * @return st_variable_define.variable_condition, 
     */
    public String getVariableCondition() {
        return variableCondition;
    }

    /**
     * 设置  字段:st_variable_define.variable_condition
     *
     * @param variableCondition the value for st_variable_define.variable_condition, 
     */
    public void setVariableCondition(String variableCondition) {
        this.variableCondition = variableCondition == null ? null : variableCondition.trim();
    }

    /**
     * 获取  字段:st_variable_define.variable_condition_js
     *
     * @return st_variable_define.variable_condition_js, 
     */
    public String getVariableConditionJs() {
        return variableConditionJs;
    }

    /**
     * 设置  字段:st_variable_define.variable_condition_js
     *
     * @param variableConditionJs the value for st_variable_define.variable_condition_js, 
     */
    public void setVariableConditionJs(String variableConditionJs) {
        this.variableConditionJs = variableConditionJs == null ? null : variableConditionJs.trim();
    }

    /**
     * 获取  字段:st_variable_define.variable_condition_name
     *
     * @return st_variable_define.variable_condition_name, 
     */
    public String getVariableConditionName() {
        return variableConditionName;
    }

    /**
     * 设置  字段:st_variable_define.variable_condition_name
     *
     * @param variableConditionName the value for st_variable_define.variable_condition_name, 
     */
    public void setVariableConditionName(String variableConditionName) {
        this.variableConditionName = variableConditionName == null ? null : variableConditionName.trim();
    }

    /**
     * 获取 创建时间 字段:st_variable_define.created_at
     *
     * @return st_variable_define.created_at, 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 创建时间 字段:st_variable_define.created_at
     *
     * @param createdAt the value for st_variable_define.created_at, 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 更新时间 字段:st_variable_define.updated_at
     *
     * @return st_variable_define.updated_at, 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置 更新时间 字段:st_variable_define.updated_at
     *
     * @param updatedAt the value for st_variable_define.updated_at, 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取  字段:st_variable_define.created_by
     *
     * @return st_variable_define.created_by, 
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置  字段:st_variable_define.created_by
     *
     * @param createdBy the value for st_variable_define.created_by, 
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 获取  字段:st_variable_define.updated_by
     *
     * @return st_variable_define.updated_by, 
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置  字段:st_variable_define.updated_by
     *
     * @param updatedBy the value for st_variable_define.updated_by, 
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 获取  字段:st_variable_define.version
     *
     * @return st_variable_define.version, 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置  字段:st_variable_define.version
     *
     * @param version the value for st_variable_define.version, 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取 指标号 字段:st_variable_define.kpi_no
     *
     * @return st_variable_define.kpi_no, 指标号
     */
    public Integer getKpiNo() {
        return kpiNo;
    }

    /**
     * 设置 指标号 字段:st_variable_define.kpi_no
     *
     * @param kpiNo the value for st_variable_define.kpi_no, 指标号
     */
    public void setKpiNo(Integer kpiNo) {
        this.kpiNo = kpiNo;
    }
}