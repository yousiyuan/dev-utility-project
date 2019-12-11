package org.artemis.sparrow.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "risk_product_busniss_type")
public class RiskProductBusnissType {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 产品编码
     */
    @Column(name = "product_code")
    private String productCode;

    /**
     * 业务编码
     */
    @Column(name = "business_code")
    private String businessCode;

    /**
     * 一个平台公司的额度编码
     */
    @Column(name = "project_code")
    private String projectCode;

    /**
     * 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     */
    @Column(name = "cust_model")
    private String custModel;

    /**
     * 模型id
     */
    @Column(name = "model_id")
    private String modelId;

    /**
     * 0-正常  1-已删除
     */
    @Column(name = "record_status")
    private Byte recordStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 模型相关联的hbase表
     */
    @Column(name = "hbase_table")
    private String hbaseTable;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取产品编码
     *
     * @return product_code - 产品编码
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置产品编码
     *
     * @param productCode 产品编码
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * 获取业务编码
     *
     * @return business_code - 业务编码
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * 设置业务编码
     *
     * @param businessCode 业务编码
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    /**
     * 获取一个平台公司的额度编码
     *
     * @return project_code - 一个平台公司的额度编码
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置一个平台公司的额度编码
     *
     * @param projectCode 一个平台公司的额度编码
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    /**
     * 获取平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     *
     * @return cust_model - 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     */
    public String getCustModel() {
        return custModel;
    }

    /**
     * 设置平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     *
     * @param custModel 平台：PLATFORM 、 KA：KA  、小微 ：MICRO 、个人 ：PERSON
     */
    public void setCustModel(String custModel) {
        this.custModel = custModel == null ? null : custModel.trim();
    }

    /**
     * 获取模型id
     *
     * @return model_id - 模型id
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 设置模型id
     *
     * @param modelId 模型id
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * 获取0-正常  1-已删除
     *
     * @return record_status - 0-正常  1-已删除
     */
    public Byte getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置0-正常  1-已删除
     *
     * @param recordStatus 0-正常  1-已删除
     */
    public void setRecordStatus(Byte recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取模型相关联的hbase表
     *
     * @return hbase_table - 模型相关联的hbase表
     */
    public String getHbaseTable() {
        return hbaseTable;
    }

    /**
     * 设置模型相关联的hbase表
     *
     * @param hbaseTable 模型相关联的hbase表
     */
    public void setHbaseTable(String hbaseTable) {
        this.hbaseTable = hbaseTable == null ? null : hbaseTable.trim();
    }
}