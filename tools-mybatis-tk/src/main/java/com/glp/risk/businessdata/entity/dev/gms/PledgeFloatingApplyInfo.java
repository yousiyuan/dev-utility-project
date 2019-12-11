package com.glp.risk.businessdata.entity.dev.gms;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pledge_floating_apply_info")
public class PledgeFloatingApplyInfo {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 浮动质押总单号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 总用信金额
     */
    @Column(name = "total_credit_amount")
    private BigDecimal totalCreditAmount;

    /**
     * 总用信金额更新时间
     */
    @Column(name = "total_credit_amount_update_time")
    private Date totalCreditAmountUpdateTime;

    /**
     * 总质押金额
     */
    @Column(name = "total_pledge_amount")
    private BigDecimal totalPledgeAmount;

    /**
     * 总质押金额更新时间
     */
    @Column(name = "total_pledge_amount_update_time")
    private Date totalPledgeAmountUpdateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_user")
    private String updateUser;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取浮动质押总单号
     *
     * @return apply_no - 浮动质押总单号
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 设置浮动质押总单号
     *
     * @param applyNo 浮动质押总单号
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    /**
     * 获取总用信金额
     *
     * @return total_credit_amount - 总用信金额
     */
    public BigDecimal getTotalCreditAmount() {
        return totalCreditAmount;
    }

    /**
     * 设置总用信金额
     *
     * @param totalCreditAmount 总用信金额
     */
    public void setTotalCreditAmount(BigDecimal totalCreditAmount) {
        this.totalCreditAmount = totalCreditAmount;
    }

    /**
     * 获取总用信金额更新时间
     *
     * @return total_credit_amount_update_time - 总用信金额更新时间
     */
    public Date getTotalCreditAmountUpdateTime() {
        return totalCreditAmountUpdateTime;
    }

    /**
     * 设置总用信金额更新时间
     *
     * @param totalCreditAmountUpdateTime 总用信金额更新时间
     */
    public void setTotalCreditAmountUpdateTime(Date totalCreditAmountUpdateTime) {
        this.totalCreditAmountUpdateTime = totalCreditAmountUpdateTime;
    }

    /**
     * 获取总质押金额
     *
     * @return total_pledge_amount - 总质押金额
     */
    public BigDecimal getTotalPledgeAmount() {
        return totalPledgeAmount;
    }

    /**
     * 设置总质押金额
     *
     * @param totalPledgeAmount 总质押金额
     */
    public void setTotalPledgeAmount(BigDecimal totalPledgeAmount) {
        this.totalPledgeAmount = totalPledgeAmount;
    }

    /**
     * 获取总质押金额更新时间
     *
     * @return total_pledge_amount_update_time - 总质押金额更新时间
     */
    public Date getTotalPledgeAmountUpdateTime() {
        return totalPledgeAmountUpdateTime;
    }

    /**
     * 设置总质押金额更新时间
     *
     * @param totalPledgeAmountUpdateTime 总质押金额更新时间
     */
    public void setTotalPledgeAmountUpdateTime(Date totalPledgeAmountUpdateTime) {
        this.totalPledgeAmountUpdateTime = totalPledgeAmountUpdateTime;
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
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return update_user - 更新人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新人
     *
     * @param updateUser 更新人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}