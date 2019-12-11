package org.artemis.sparrow.entity;

import javax.persistence.*;

@Table(name = "factor_bill")
public class FactorBillKey {
    @Id
    private Integer id;

    /**
     * 订单关联ID
     */
    @Id
    @Column(name = "factor_order_id")
    private Integer factorOrderId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单关联ID
     *
     * @return factor_order_id - 订单关联ID
     */
    public Integer getFactorOrderId() {
        return factorOrderId;
    }

    /**
     * 设置订单关联ID
     *
     * @param factorOrderId 订单关联ID
     */
    public void setFactorOrderId(Integer factorOrderId) {
        this.factorOrderId = factorOrderId;
    }
}