package com.glp.backend.mybatis.generate.factor.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;

public class FactorBillKey extends BaseEntity {
    /**
     * 
     * 表字段 : factor_bill.id
     */
    private Integer id;

    /**
     * 订单关联ID
     * 表字段 : factor_bill.factor_order_id
     */
    private Integer factorOrderId;

    /**
     * 获取  字段:factor_bill.id
     *
     * @return factor_bill.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:factor_bill.id
     *
     * @param id the value for factor_bill.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 订单关联ID 字段:factor_bill.factor_order_id
     *
     * @return factor_bill.factor_order_id, 订单关联ID
     */
    public Integer getFactorOrderId() {
        return factorOrderId;
    }

    /**
     * 设置 订单关联ID 字段:factor_bill.factor_order_id
     *
     * @param factorOrderId the value for factor_bill.factor_order_id, 订单关联ID
     */
    public void setFactorOrderId(Integer factorOrderId) {
        this.factorOrderId = factorOrderId;
    }
}