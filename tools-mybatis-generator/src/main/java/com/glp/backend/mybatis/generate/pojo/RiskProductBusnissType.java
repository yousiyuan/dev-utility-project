package com.glp.backend.mybatis.generate.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;
import java.util.Date;

public class RiskProductBusnissType extends BaseEntity {
    /**
     * 主键
     * 表字段 : risk_product_busniss_type.id
     */
    private Long id;

    /**
     * 产品编码
     * 表字段 : risk_product_busniss_type.product_code
     */
    private String productCode;

    /**
     * 业务编码
     * 表字段 : risk_product_busniss_type.business_code
     */
    private String businessCode;

    /**
     * 一个平台公司的额度编码
     * 表字段 : risk_product_busniss_type.project_code
     */
    private String projectCode;

    /**
     * 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     * 表字段 : risk_product_busniss_type.cust_model
     */
    private String custModel;

    /**
     * 模型id
     * 表字段 : risk_product_busniss_type.model_id
     */
    private String modelId;

    /**
     * 0-正常  1-已删除
     * 表字段 : risk_product_busniss_type.record_status
     */
    private Byte recordStatus;

    /**
     * 创建时间
     * 表字段 : risk_product_busniss_type.create_time
     */
    private Date createTime;

    /**
     * 修改时间
     * 表字段 : risk_product_busniss_type.update_time
     */
    private Date updateTime;

    /**
     * 模型相关联的hbase表
     * 表字段 : risk_product_busniss_type.hbase_table
     */
    private String hbaseTable;

    /**
     * 获取 主键 字段:risk_product_busniss_type.id
     *
     * @return risk_product_busniss_type.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:risk_product_busniss_type.id
     *
     * @param id the value for risk_product_busniss_type.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 产品编码 字段:risk_product_busniss_type.product_code
     *
     * @return risk_product_busniss_type.product_code, 产品编码
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置 产品编码 字段:risk_product_busniss_type.product_code
     *
     * @param productCode the value for risk_product_busniss_type.product_code, 产品编码
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * 获取 业务编码 字段:risk_product_busniss_type.business_code
     *
     * @return risk_product_busniss_type.business_code, 业务编码
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * 设置 业务编码 字段:risk_product_busniss_type.business_code
     *
     * @param businessCode the value for risk_product_busniss_type.business_code, 业务编码
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    /**
     * 获取 一个平台公司的额度编码 字段:risk_product_busniss_type.project_code
     *
     * @return risk_product_busniss_type.project_code, 一个平台公司的额度编码
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置 一个平台公司的额度编码 字段:risk_product_busniss_type.project_code
     *
     * @param projectCode the value for risk_product_busniss_type.project_code, 一个平台公司的额度编码
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    /**
     * 获取 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON 字段:risk_product_busniss_type.cust_model
     *
     * @return risk_product_busniss_type.cust_model, 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     */
    public String getCustModel() {
        return custModel;
    }

    /**
     * 设置 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON 字段:risk_product_busniss_type.cust_model
     *
     * @param custModel the value for risk_product_busniss_type.cust_model, 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     */
    public void setCustModel(String custModel) {
        this.custModel = custModel == null ? null : custModel.trim();
    }

    /**
     * 获取 模型id 字段:risk_product_busniss_type.model_id
     *
     * @return risk_product_busniss_type.model_id, 模型id
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 设置 模型id 字段:risk_product_busniss_type.model_id
     *
     * @param modelId the value for risk_product_busniss_type.model_id, 模型id
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * 获取 0-正常  1-已删除 字段:risk_product_busniss_type.record_status
     *
     * @return risk_product_busniss_type.record_status, 0-正常  1-已删除
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置 0-正常  1-已删除 字段:risk_product_busniss_type.record_status
     *
     * @param recordStatus the value for risk_product_busniss_type.record_status, 0-正常  1-已删除
     */
    public void setRecordStatus(Byte recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * 获取 创建时间 字段:risk_product_busniss_type.create_time
     *
     * @return risk_product_busniss_type.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:risk_product_busniss_type.create_time
     *
     * @param createTime the value for risk_product_busniss_type.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改时间 字段:risk_product_busniss_type.update_time
     *
     * @return risk_product_busniss_type.update_time, 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间 字段:risk_product_busniss_type.update_time
     *
     * @param updateTime the value for risk_product_busniss_type.update_time, 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 模型相关联的hbase表 字段:risk_product_busniss_type.hbase_table
     *
     * @return risk_product_busniss_type.hbase_table, 模型相关联的hbase表
     */
    public String getHbaseTable() {
        return hbaseTable;
    }

    /**
     * 设置 模型相关联的hbase表 字段:risk_product_busniss_type.hbase_table
     *
     * @param hbaseTable the value for risk_product_busniss_type.hbase_table, 模型相关联的hbase表
     */
    public void setHbaseTable(String hbaseTable) {
        this.hbaseTable = hbaseTable == null ? null : hbaseTable.trim();
    }
}