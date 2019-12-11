package com.glp.backend.mybatis.generate.factor.pojo;

import java.math.BigDecimal;

public class FactorBill extends FactorBillKey {
    /**
     * 订单来源1默认/2代表1.2版本的订单
     * 表字段 : factor_bill.order_type
     */
    private Byte orderType;

    /**
     * 申请单关联ID
     * 表字段 : factor_bill.factor_requisition_id
     */
    private Integer factorRequisitionId;

    /**
     * 
     * 表字段 : factor_bill.order_number
     */
    private String orderNumber;

    /**
     * 账单号
     * 表字段 : factor_bill.number
     */
    private String number;

    /**
     * 保理金额
     * 表字段 : factor_bill.amount
     */
    private BigDecimal amount;

    /**
     * 最长期限
     * 表字段 : factor_bill.time_limit
     */
    private Integer timeLimit;

    /**
     * 利率
     * 表字段 : factor_bill.rate
     */
    private BigDecimal rate;

    /**
     * 买方母公司ID
     * 表字段 : factor_bill.buyer_enterprise_id
     */
    private Integer buyerEnterpriseId;

    /**
     * 买方ID
     * 表字段 : factor_bill.buyer_id
     */
    private Integer buyerId;

    /**
     * 买方名称
     * 表字段 : factor_bill.buyer_name
     */
    private String buyerName;

    /**
     * 卖方母公司ID
     * 表字段 : factor_bill.seller_enterprise_id
     */
    private Integer sellerEnterpriseId;

    /**
     * 卖方ID
     * 表字段 : factor_bill.seller_id
     */
    private Integer sellerId;

    /**
     * 卖方名称
     * 表字段 : factor_bill.seller_name
     */
    private String sellerName;

    /**
     * 计息开始日期
     * 表字段 : factor_bill.interest_time
     */
    private Integer interestTime;

    /**
     * 最晚还款日
     * 表字段 : factor_bill.end_repayment_time
     */
    private Integer endRepaymentTime;

    /**
     * 实体卡号
     * 表字段 : factor_bill.pay_bank_real_number
     */
    private String payBankRealNumber;

    /**
     * 实体卡城市
     * 表字段 : factor_bill.payerCity
     */
    private String payercity;

    /**
     * 还款开户名
     * 表字段 : factor_bill.repayment_back_username
     */
    private String repaymentBackUsername;

    /**
     * 还款银行账号
     * 表字段 : factor_bill.repayment_bank_number
     */
    private String repaymentBankNumber;

    /**
     * 预计应还总额
     * 表字段 : factor_bill.estimate_repayment_amount
     */
    private BigDecimal estimateRepaymentAmount;

    /**
     * 预计应还本金
     * 表字段 : factor_bill.estimate_balance
     */
    private BigDecimal estimateBalance;

    /**
     * 预计收益
     * 表字段 : factor_bill.estimate_interest
     */
    private BigDecimal estimateInterest;

    /**
     * 实际已还本金
     * 表字段 : factor_bill.reality_balance
     */
    private BigDecimal realityBalance;

    /**
     * 实际已还利息
     * 表字段 : factor_bill.reality_interest
     */
    private BigDecimal realityInterest;

    /**
     * 实际已还正常期利息
     * 表字段 : factor_bill.reality_normal_interest
     */
    private BigDecimal realityNormalInterest;

    /**
     * 实际已还宽限期利息
     * 表字段 : factor_bill.reality_grace_interest
     */
    private BigDecimal realityGraceInterest;

    /**
     * 实际已还罚息
     * 表字段 : factor_bill.reality_break_interest
     */
    private BigDecimal realityBreakInterest;

    /**
     * 实际已还复利
     * 表字段 : factor_bill.reality_compound_interest
     */
    private BigDecimal realityCompoundInterest;

    /**
     * 当前预计应还利息
     * 表字段 : factor_bill.today_interest
     */
    private BigDecimal todayInterest;

    /**
     * 当前预计应还正常利息
     * 表字段 : factor_bill.today_normal_interest
     */
    private BigDecimal todayNormalInterest;

    /**
     * 当前预计应还宽限期利息
     * 表字段 : factor_bill.today_grace_interest
     */
    private BigDecimal todayGraceInterest;

    /**
     * 当前预计应还罚息
     * 表字段 : factor_bill.today_break_interest
     */
    private BigDecimal todayBreakInterest;

    /**
     * 当前预计应还复利
     * 表字段 : factor_bill.today_compound_interest
     */
    private BigDecimal todayCompoundInterest;

    /**
     * 剩余未还本金
     * 表字段 : factor_bill.surplus_balance
     */
    private BigDecimal surplusBalance;

    /**
     * 1/等待还款，2/部分还款，3/已还款
     * 表字段 : factor_bill.status
     */
    private Byte status;

    /**
     * 结清日期
     * 表字段 : factor_bill.settle_time
     */
    private Integer settleTime;

    /**
     * 是否已代偿 0否1是
     * 表字段 : factor_bill.is_compensatory
     */
    private Boolean isCompensatory;

    /**
     * 是否减免罚息 0否1是
     * 表字段 : factor_bill.is_reduce_interest
     */
    private Boolean isReduceInterest;

    /**
     * 减免罚息金额
     * 表字段 : factor_bill.reduce_interest_amount
     */
    private BigDecimal reduceInterestAmount;

    /**
     * 多买方公司ID
     * 表字段 : factor_bill.buyer_company_ids
     */
    private String buyerCompanyIds;

    /**
     * 账单生成时间
     * 表字段 : factor_bill.create_time
     */
    private Integer createTime;

    /**
     * 
     * 表字段 : factor_bill.update_time
     */
    private Integer updateTime;

    /**
     * 是否坏账   0 否 1 是
     * 表字段 : factor_bill.is_bad_debt
     */
    private Boolean isBadDebt;

    /**
     * 已收利息转本金
     * 表字段 : factor_bill.bad_reality_interest_to_balance
     */
    private BigDecimal badRealityInterestToBalance;

    /**
     * 冲后已还本金
     * 表字段 : factor_bill.bad_strike_balance
     */
    private BigDecimal badStrikeBalance;

    /**
     * 冲后坏账
     * 表字段 : factor_bill.bad_balance
     */
    private BigDecimal badBalance;

    /**
     * 减少已收利息
     * 表字段 : factor_bill.bad_interest
     */
    private BigDecimal badInterest;

    /**
     * 冲后已还利息
     * 表字段 : factor_bill.bad_strike_interest
     */
    private BigDecimal badStrikeInterest;

    /**
     * 是否生成已代偿计息账单 0 否 1 是
     * 表字段 : factor_bill.is_compensatory_interest
     */
    private Boolean isCompensatoryInterest;

    /**
     * 多买方公司名称
     * 表字段 : factor_bill.buyer_company_names
     */
    private String buyerCompanyNames;

    /**
     * 获取 订单来源1默认/2代表1.2版本的订单 字段:factor_bill.order_type
     *
     * @return factor_bill.order_type, 订单来源1默认/2代表1.2版本的订单
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * 设置 订单来源1默认/2代表1.2版本的订单 字段:factor_bill.order_type
     *
     * @param orderType the value for factor_bill.order_type, 订单来源1默认/2代表1.2版本的订单
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取 申请单关联ID 字段:factor_bill.factor_requisition_id
     *
     * @return factor_bill.factor_requisition_id, 申请单关联ID
     */
    public Integer getFactorRequisitionId() {
        return factorRequisitionId;
    }

    /**
     * 设置 申请单关联ID 字段:factor_bill.factor_requisition_id
     *
     * @param factorRequisitionId the value for factor_bill.factor_requisition_id, 申请单关联ID
     */
    public void setFactorRequisitionId(Integer factorRequisitionId) {
        this.factorRequisitionId = factorRequisitionId;
    }

    /**
     * 获取  字段:factor_bill.order_number
     *
     * @return factor_bill.order_number, 
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置  字段:factor_bill.order_number
     *
     * @param orderNumber the value for factor_bill.order_number, 
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * 获取 账单号 字段:factor_bill.number
     *
     * @return factor_bill.number, 账单号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置 账单号 字段:factor_bill.number
     *
     * @param number the value for factor_bill.number, 账单号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 获取 保理金额 字段:factor_bill.amount
     *
     * @return factor_bill.amount, 保理金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置 保理金额 字段:factor_bill.amount
     *
     * @param amount the value for factor_bill.amount, 保理金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取 最长期限 字段:factor_bill.time_limit
     *
     * @return factor_bill.time_limit, 最长期限
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置 最长期限 字段:factor_bill.time_limit
     *
     * @param timeLimit the value for factor_bill.time_limit, 最长期限
     */
    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * 获取 利率 字段:factor_bill.rate
     *
     * @return factor_bill.rate, 利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置 利率 字段:factor_bill.rate
     *
     * @param rate the value for factor_bill.rate, 利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取 买方母公司ID 字段:factor_bill.buyer_enterprise_id
     *
     * @return factor_bill.buyer_enterprise_id, 买方母公司ID
     */
    public Integer getBuyerEnterpriseId() {
        return buyerEnterpriseId;
    }

    /**
     * 设置 买方母公司ID 字段:factor_bill.buyer_enterprise_id
     *
     * @param buyerEnterpriseId the value for factor_bill.buyer_enterprise_id, 买方母公司ID
     */
    public void setBuyerEnterpriseId(Integer buyerEnterpriseId) {
        this.buyerEnterpriseId = buyerEnterpriseId;
    }

    /**
     * 获取 买方ID 字段:factor_bill.buyer_id
     *
     * @return factor_bill.buyer_id, 买方ID
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 设置 买方ID 字段:factor_bill.buyer_id
     *
     * @param buyerId the value for factor_bill.buyer_id, 买方ID
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 获取 买方名称 字段:factor_bill.buyer_name
     *
     * @return factor_bill.buyer_name, 买方名称
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 设置 买方名称 字段:factor_bill.buyer_name
     *
     * @param buyerName the value for factor_bill.buyer_name, 买方名称
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * 获取 卖方母公司ID 字段:factor_bill.seller_enterprise_id
     *
     * @return factor_bill.seller_enterprise_id, 卖方母公司ID
     */
    public Integer getSellerEnterpriseId() {
        return sellerEnterpriseId;
    }

    /**
     * 设置 卖方母公司ID 字段:factor_bill.seller_enterprise_id
     *
     * @param sellerEnterpriseId the value for factor_bill.seller_enterprise_id, 卖方母公司ID
     */
    public void setSellerEnterpriseId(Integer sellerEnterpriseId) {
        this.sellerEnterpriseId = sellerEnterpriseId;
    }

    /**
     * 获取 卖方ID 字段:factor_bill.seller_id
     *
     * @return factor_bill.seller_id, 卖方ID
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 设置 卖方ID 字段:factor_bill.seller_id
     *
     * @param sellerId the value for factor_bill.seller_id, 卖方ID
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 获取 卖方名称 字段:factor_bill.seller_name
     *
     * @return factor_bill.seller_name, 卖方名称
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * 设置 卖方名称 字段:factor_bill.seller_name
     *
     * @param sellerName the value for factor_bill.seller_name, 卖方名称
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    /**
     * 获取 计息开始日期 字段:factor_bill.interest_time
     *
     * @return factor_bill.interest_time, 计息开始日期
     */
    public Integer getInterestTime() {
        return interestTime;
    }

    /**
     * 设置 计息开始日期 字段:factor_bill.interest_time
     *
     * @param interestTime the value for factor_bill.interest_time, 计息开始日期
     */
    public void setInterestTime(Integer interestTime) {
        this.interestTime = interestTime;
    }

    /**
     * 获取 最晚还款日 字段:factor_bill.end_repayment_time
     *
     * @return factor_bill.end_repayment_time, 最晚还款日
     */
    public Integer getEndRepaymentTime() {
        return endRepaymentTime;
    }

    /**
     * 设置 最晚还款日 字段:factor_bill.end_repayment_time
     *
     * @param endRepaymentTime the value for factor_bill.end_repayment_time, 最晚还款日
     */
    public void setEndRepaymentTime(Integer endRepaymentTime) {
        this.endRepaymentTime = endRepaymentTime;
    }

    /**
     * 获取 实体卡号 字段:factor_bill.pay_bank_real_number
     *
     * @return factor_bill.pay_bank_real_number, 实体卡号
     */
    public String getPayBankRealNumber() {
        return payBankRealNumber;
    }

    /**
     * 设置 实体卡号 字段:factor_bill.pay_bank_real_number
     *
     * @param payBankRealNumber the value for factor_bill.pay_bank_real_number, 实体卡号
     */
    public void setPayBankRealNumber(String payBankRealNumber) {
        this.payBankRealNumber = payBankRealNumber == null ? null : payBankRealNumber.trim();
    }

    /**
     * 获取 实体卡城市 字段:factor_bill.payerCity
     *
     * @return factor_bill.payerCity, 实体卡城市
     */
    public String getPayercity() {
        return payercity;
    }

    /**
     * 设置 实体卡城市 字段:factor_bill.payerCity
     *
     * @param payercity the value for factor_bill.payerCity, 实体卡城市
     */
    public void setPayercity(String payercity) {
        this.payercity = payercity == null ? null : payercity.trim();
    }

    /**
     * 获取 还款开户名 字段:factor_bill.repayment_back_username
     *
     * @return factor_bill.repayment_back_username, 还款开户名
     */
    public String getRepaymentBackUsername() {
        return repaymentBackUsername;
    }

    /**
     * 设置 还款开户名 字段:factor_bill.repayment_back_username
     *
     * @param repaymentBackUsername the value for factor_bill.repayment_back_username, 还款开户名
     */
    public void setRepaymentBackUsername(String repaymentBackUsername) {
        this.repaymentBackUsername = repaymentBackUsername == null ? null : repaymentBackUsername.trim();
    }

    /**
     * 获取 还款银行账号 字段:factor_bill.repayment_bank_number
     *
     * @return factor_bill.repayment_bank_number, 还款银行账号
     */
    public String getRepaymentBankNumber() {
        return repaymentBankNumber;
    }

    /**
     * 设置 还款银行账号 字段:factor_bill.repayment_bank_number
     *
     * @param repaymentBankNumber the value for factor_bill.repayment_bank_number, 还款银行账号
     */
    public void setRepaymentBankNumber(String repaymentBankNumber) {
        this.repaymentBankNumber = repaymentBankNumber == null ? null : repaymentBankNumber.trim();
    }

    /**
     * 获取 预计应还总额 字段:factor_bill.estimate_repayment_amount
     *
     * @return factor_bill.estimate_repayment_amount, 预计应还总额
     */
    public BigDecimal getEstimateRepaymentAmount() {
        return estimateRepaymentAmount;
    }

    /**
     * 设置 预计应还总额 字段:factor_bill.estimate_repayment_amount
     *
     * @param estimateRepaymentAmount the value for factor_bill.estimate_repayment_amount, 预计应还总额
     */
    public void setEstimateRepaymentAmount(BigDecimal estimateRepaymentAmount) {
        this.estimateRepaymentAmount = estimateRepaymentAmount;
    }

    /**
     * 获取 预计应还本金 字段:factor_bill.estimate_balance
     *
     * @return factor_bill.estimate_balance, 预计应还本金
     */
    public BigDecimal getEstimateBalance() {
        return estimateBalance;
    }

    /**
     * 设置 预计应还本金 字段:factor_bill.estimate_balance
     *
     * @param estimateBalance the value for factor_bill.estimate_balance, 预计应还本金
     */
    public void setEstimateBalance(BigDecimal estimateBalance) {
        this.estimateBalance = estimateBalance;
    }

    /**
     * 获取 预计收益 字段:factor_bill.estimate_interest
     *
     * @return factor_bill.estimate_interest, 预计收益
     */
    public BigDecimal getEstimateInterest() {
        return estimateInterest;
    }

    /**
     * 设置 预计收益 字段:factor_bill.estimate_interest
     *
     * @param estimateInterest the value for factor_bill.estimate_interest, 预计收益
     */
    public void setEstimateInterest(BigDecimal estimateInterest) {
        this.estimateInterest = estimateInterest;
    }

    /**
     * 获取 实际已还本金 字段:factor_bill.reality_balance
     *
     * @return factor_bill.reality_balance, 实际已还本金
     */
    public BigDecimal getRealityBalance() {
        return realityBalance;
    }

    /**
     * 设置 实际已还本金 字段:factor_bill.reality_balance
     *
     * @param realityBalance the value for factor_bill.reality_balance, 实际已还本金
     */
    public void setRealityBalance(BigDecimal realityBalance) {
        this.realityBalance = realityBalance;
    }

    /**
     * 获取 实际已还利息 字段:factor_bill.reality_interest
     *
     * @return factor_bill.reality_interest, 实际已还利息
     */
    public BigDecimal getRealityInterest() {
        return realityInterest;
    }

    /**
     * 设置 实际已还利息 字段:factor_bill.reality_interest
     *
     * @param realityInterest the value for factor_bill.reality_interest, 实际已还利息
     */
    public void setRealityInterest(BigDecimal realityInterest) {
        this.realityInterest = realityInterest;
    }

    /**
     * 获取 实际已还正常期利息 字段:factor_bill.reality_normal_interest
     *
     * @return factor_bill.reality_normal_interest, 实际已还正常期利息
     */
    public BigDecimal getRealityNormalInterest() {
        return realityNormalInterest;
    }

    /**
     * 设置 实际已还正常期利息 字段:factor_bill.reality_normal_interest
     *
     * @param realityNormalInterest the value for factor_bill.reality_normal_interest, 实际已还正常期利息
     */
    public void setRealityNormalInterest(BigDecimal realityNormalInterest) {
        this.realityNormalInterest = realityNormalInterest;
    }

    /**
     * 获取 实际已还宽限期利息 字段:factor_bill.reality_grace_interest
     *
     * @return factor_bill.reality_grace_interest, 实际已还宽限期利息
     */
    public BigDecimal getRealityGraceInterest() {
        return realityGraceInterest;
    }

    /**
     * 设置 实际已还宽限期利息 字段:factor_bill.reality_grace_interest
     *
     * @param realityGraceInterest the value for factor_bill.reality_grace_interest, 实际已还宽限期利息
     */
    public void setRealityGraceInterest(BigDecimal realityGraceInterest) {
        this.realityGraceInterest = realityGraceInterest;
    }

    /**
     * 获取 实际已还罚息 字段:factor_bill.reality_break_interest
     *
     * @return factor_bill.reality_break_interest, 实际已还罚息
     */
    public BigDecimal getRealityBreakInterest() {
        return realityBreakInterest;
    }

    /**
     * 设置 实际已还罚息 字段:factor_bill.reality_break_interest
     *
     * @param realityBreakInterest the value for factor_bill.reality_break_interest, 实际已还罚息
     */
    public void setRealityBreakInterest(BigDecimal realityBreakInterest) {
        this.realityBreakInterest = realityBreakInterest;
    }

    /**
     * 获取 实际已还复利 字段:factor_bill.reality_compound_interest
     *
     * @return factor_bill.reality_compound_interest, 实际已还复利
     */
    public BigDecimal getRealityCompoundInterest() {
        return realityCompoundInterest;
    }

    /**
     * 设置 实际已还复利 字段:factor_bill.reality_compound_interest
     *
     * @param realityCompoundInterest the value for factor_bill.reality_compound_interest, 实际已还复利
     */
    public void setRealityCompoundInterest(BigDecimal realityCompoundInterest) {
        this.realityCompoundInterest = realityCompoundInterest;
    }

    /**
     * 获取 当前预计应还利息 字段:factor_bill.today_interest
     *
     * @return factor_bill.today_interest, 当前预计应还利息
     */
    public BigDecimal getTodayInterest() {
        return todayInterest;
    }

    /**
     * 设置 当前预计应还利息 字段:factor_bill.today_interest
     *
     * @param todayInterest the value for factor_bill.today_interest, 当前预计应还利息
     */
    public void setTodayInterest(BigDecimal todayInterest) {
        this.todayInterest = todayInterest;
    }

    /**
     * 获取 当前预计应还正常利息 字段:factor_bill.today_normal_interest
     *
     * @return factor_bill.today_normal_interest, 当前预计应还正常利息
     */
    public BigDecimal getTodayNormalInterest() {
        return todayNormalInterest;
    }

    /**
     * 设置 当前预计应还正常利息 字段:factor_bill.today_normal_interest
     *
     * @param todayNormalInterest the value for factor_bill.today_normal_interest, 当前预计应还正常利息
     */
    public void setTodayNormalInterest(BigDecimal todayNormalInterest) {
        this.todayNormalInterest = todayNormalInterest;
    }

    /**
     * 获取 当前预计应还宽限期利息 字段:factor_bill.today_grace_interest
     *
     * @return factor_bill.today_grace_interest, 当前预计应还宽限期利息
     */
    public BigDecimal getTodayGraceInterest() {
        return todayGraceInterest;
    }

    /**
     * 设置 当前预计应还宽限期利息 字段:factor_bill.today_grace_interest
     *
     * @param todayGraceInterest the value for factor_bill.today_grace_interest, 当前预计应还宽限期利息
     */
    public void setTodayGraceInterest(BigDecimal todayGraceInterest) {
        this.todayGraceInterest = todayGraceInterest;
    }

    /**
     * 获取 当前预计应还罚息 字段:factor_bill.today_break_interest
     *
     * @return factor_bill.today_break_interest, 当前预计应还罚息
     */
    public BigDecimal getTodayBreakInterest() {
        return todayBreakInterest;
    }

    /**
     * 设置 当前预计应还罚息 字段:factor_bill.today_break_interest
     *
     * @param todayBreakInterest the value for factor_bill.today_break_interest, 当前预计应还罚息
     */
    public void setTodayBreakInterest(BigDecimal todayBreakInterest) {
        this.todayBreakInterest = todayBreakInterest;
    }

    /**
     * 获取 当前预计应还复利 字段:factor_bill.today_compound_interest
     *
     * @return factor_bill.today_compound_interest, 当前预计应还复利
     */
    public BigDecimal getTodayCompoundInterest() {
        return todayCompoundInterest;
    }

    /**
     * 设置 当前预计应还复利 字段:factor_bill.today_compound_interest
     *
     * @param todayCompoundInterest the value for factor_bill.today_compound_interest, 当前预计应还复利
     */
    public void setTodayCompoundInterest(BigDecimal todayCompoundInterest) {
        this.todayCompoundInterest = todayCompoundInterest;
    }

    /**
     * 获取 剩余未还本金 字段:factor_bill.surplus_balance
     *
     * @return factor_bill.surplus_balance, 剩余未还本金
     */
    public BigDecimal getSurplusBalance() {
        return surplusBalance;
    }

    /**
     * 设置 剩余未还本金 字段:factor_bill.surplus_balance
     *
     * @param surplusBalance the value for factor_bill.surplus_balance, 剩余未还本金
     */
    public void setSurplusBalance(BigDecimal surplusBalance) {
        this.surplusBalance = surplusBalance;
    }

    /**
     * 获取 1/等待还款，2/部分还款，3/已还款 字段:factor_bill.status
     *
     * @return factor_bill.status, 1/等待还款，2/部分还款，3/已还款
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置 1/等待还款，2/部分还款，3/已还款 字段:factor_bill.status
     *
     * @param status the value for factor_bill.status, 1/等待还款，2/部分还款，3/已还款
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取 结清日期 字段:factor_bill.settle_time
     *
     * @return factor_bill.settle_time, 结清日期
     */
    public Integer getSettleTime() {
        return settleTime;
    }

    /**
     * 设置 结清日期 字段:factor_bill.settle_time
     *
     * @param settleTime the value for factor_bill.settle_time, 结清日期
     */
    public void setSettleTime(Integer settleTime) {
        this.settleTime = settleTime;
    }

    /**
     * 获取 是否已代偿 0否1是 字段:factor_bill.is_compensatory
     *
     * @return factor_bill.is_compensatory, 是否已代偿 0否1是
     */
    public Boolean getIsCompensatory() {
        return isCompensatory;
    }

    /**
     * 设置 是否已代偿 0否1是 字段:factor_bill.is_compensatory
     *
     * @param isCompensatory the value for factor_bill.is_compensatory, 是否已代偿 0否1是
     */
    public void setIsCompensatory(Boolean isCompensatory) {
        this.isCompensatory = isCompensatory;
    }

    /**
     * 获取 是否减免罚息 0否1是 字段:factor_bill.is_reduce_interest
     *
     * @return factor_bill.is_reduce_interest, 是否减免罚息 0否1是
     */
    public Boolean getIsReduceInterest() {
        return isReduceInterest;
    }

    /**
     * 设置 是否减免罚息 0否1是 字段:factor_bill.is_reduce_interest
     *
     * @param isReduceInterest the value for factor_bill.is_reduce_interest, 是否减免罚息 0否1是
     */
    public void setIsReduceInterest(Boolean isReduceInterest) {
        this.isReduceInterest = isReduceInterest;
    }

    /**
     * 获取 减免罚息金额 字段:factor_bill.reduce_interest_amount
     *
     * @return factor_bill.reduce_interest_amount, 减免罚息金额
     */
    public BigDecimal getReduceInterestAmount() {
        return reduceInterestAmount;
    }

    /**
     * 设置 减免罚息金额 字段:factor_bill.reduce_interest_amount
     *
     * @param reduceInterestAmount the value for factor_bill.reduce_interest_amount, 减免罚息金额
     */
    public void setReduceInterestAmount(BigDecimal reduceInterestAmount) {
        this.reduceInterestAmount = reduceInterestAmount;
    }

    /**
     * 获取 多买方公司ID 字段:factor_bill.buyer_company_ids
     *
     * @return factor_bill.buyer_company_ids, 多买方公司ID
     */
    public String getBuyerCompanyIds() {
        return buyerCompanyIds;
    }

    /**
     * 设置 多买方公司ID 字段:factor_bill.buyer_company_ids
     *
     * @param buyerCompanyIds the value for factor_bill.buyer_company_ids, 多买方公司ID
     */
    public void setBuyerCompanyIds(String buyerCompanyIds) {
        this.buyerCompanyIds = buyerCompanyIds == null ? null : buyerCompanyIds.trim();
    }

    /**
     * 获取 账单生成时间 字段:factor_bill.create_time
     *
     * @return factor_bill.create_time, 账单生成时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置 账单生成时间 字段:factor_bill.create_time
     *
     * @param createTime the value for factor_bill.create_time, 账单生成时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:factor_bill.update_time
     *
     * @return factor_bill.update_time, 
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置  字段:factor_bill.update_time
     *
     * @param updateTime the value for factor_bill.update_time, 
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 是否坏账   0 否 1 是 字段:factor_bill.is_bad_debt
     *
     * @return factor_bill.is_bad_debt, 是否坏账   0 否 1 是
     */
    public Boolean getIsBadDebt() {
        return isBadDebt;
    }

    /**
     * 设置 是否坏账   0 否 1 是 字段:factor_bill.is_bad_debt
     *
     * @param isBadDebt the value for factor_bill.is_bad_debt, 是否坏账   0 否 1 是
     */
    public void setIsBadDebt(Boolean isBadDebt) {
        this.isBadDebt = isBadDebt;
    }

    /**
     * 获取 已收利息转本金 字段:factor_bill.bad_reality_interest_to_balance
     *
     * @return factor_bill.bad_reality_interest_to_balance, 已收利息转本金
     */
    public BigDecimal getBadRealityInterestToBalance() {
        return badRealityInterestToBalance;
    }

    /**
     * 设置 已收利息转本金 字段:factor_bill.bad_reality_interest_to_balance
     *
     * @param badRealityInterestToBalance the value for factor_bill.bad_reality_interest_to_balance, 已收利息转本金
     */
    public void setBadRealityInterestToBalance(BigDecimal badRealityInterestToBalance) {
        this.badRealityInterestToBalance = badRealityInterestToBalance;
    }

    /**
     * 获取 冲后已还本金 字段:factor_bill.bad_strike_balance
     *
     * @return factor_bill.bad_strike_balance, 冲后已还本金
     */
    public BigDecimal getBadStrikeBalance() {
        return badStrikeBalance;
    }

    /**
     * 设置 冲后已还本金 字段:factor_bill.bad_strike_balance
     *
     * @param badStrikeBalance the value for factor_bill.bad_strike_balance, 冲后已还本金
     */
    public void setBadStrikeBalance(BigDecimal badStrikeBalance) {
        this.badStrikeBalance = badStrikeBalance;
    }

    /**
     * 获取 冲后坏账 字段:factor_bill.bad_balance
     *
     * @return factor_bill.bad_balance, 冲后坏账
     */
    public BigDecimal getBadBalance() {
        return badBalance;
    }

    /**
     * 设置 冲后坏账 字段:factor_bill.bad_balance
     *
     * @param badBalance the value for factor_bill.bad_balance, 冲后坏账
     */
    public void setBadBalance(BigDecimal badBalance) {
        this.badBalance = badBalance;
    }

    /**
     * 获取 减少已收利息 字段:factor_bill.bad_interest
     *
     * @return factor_bill.bad_interest, 减少已收利息
     */
    public BigDecimal getBadInterest() {
        return badInterest;
    }

    /**
     * 设置 减少已收利息 字段:factor_bill.bad_interest
     *
     * @param badInterest the value for factor_bill.bad_interest, 减少已收利息
     */
    public void setBadInterest(BigDecimal badInterest) {
        this.badInterest = badInterest;
    }

    /**
     * 获取 冲后已还利息 字段:factor_bill.bad_strike_interest
     *
     * @return factor_bill.bad_strike_interest, 冲后已还利息
     */
    public BigDecimal getBadStrikeInterest() {
        return badStrikeInterest;
    }

    /**
     * 设置 冲后已还利息 字段:factor_bill.bad_strike_interest
     *
     * @param badStrikeInterest the value for factor_bill.bad_strike_interest, 冲后已还利息
     */
    public void setBadStrikeInterest(BigDecimal badStrikeInterest) {
        this.badStrikeInterest = badStrikeInterest;
    }

    /**
     * 获取 是否生成已代偿计息账单 0 否 1 是 字段:factor_bill.is_compensatory_interest
     *
     * @return factor_bill.is_compensatory_interest, 是否生成已代偿计息账单 0 否 1 是
     */
    public Boolean getIsCompensatoryInterest() {
        return isCompensatoryInterest;
    }

    /**
     * 设置 是否生成已代偿计息账单 0 否 1 是 字段:factor_bill.is_compensatory_interest
     *
     * @param isCompensatoryInterest the value for factor_bill.is_compensatory_interest, 是否生成已代偿计息账单 0 否 1 是
     */
    public void setIsCompensatoryInterest(Boolean isCompensatoryInterest) {
        this.isCompensatoryInterest = isCompensatoryInterest;
    }

    /**
     * 获取 多买方公司名称 字段:factor_bill.buyer_company_names
     *
     * @return factor_bill.buyer_company_names, 多买方公司名称
     */
    public String getBuyerCompanyNames() {
        return buyerCompanyNames;
    }

    /**
     * 设置 多买方公司名称 字段:factor_bill.buyer_company_names
     *
     * @param buyerCompanyNames the value for factor_bill.buyer_company_names, 多买方公司名称
     */
    public void setBuyerCompanyNames(String buyerCompanyNames) {
        this.buyerCompanyNames = buyerCompanyNames == null ? null : buyerCompanyNames.trim();
    }
}