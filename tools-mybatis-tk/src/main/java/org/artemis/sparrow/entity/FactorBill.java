package org.artemis.sparrow.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "factor_bill")
public class FactorBill extends FactorBillKey {
    /**
     * 订单来源1默认/2代表1.2版本的订单
     */
    @Column(name = "order_type")
    private Byte orderType;

    /**
     * 申请单关联ID
     */
    @Column(name = "factor_requisition_id")
    private Integer factorRequisitionId;

    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 账单号
     */
    private String number;

    /**
     * 保理金额
     */
    private BigDecimal amount;

    /**
     * 最长期限
     */
    @Column(name = "time_limit")
    private Integer timeLimit;

    /**
     * 利率
     */
    private BigDecimal rate;

    /**
     * 买方母公司ID
     */
    @Column(name = "buyer_enterprise_id")
    private Integer buyerEnterpriseId;

    /**
     * 买方ID
     */
    @Column(name = "buyer_id")
    private Integer buyerId;

    /**
     * 买方名称
     */
    @Column(name = "buyer_name")
    private String buyerName;

    /**
     * 卖方母公司ID
     */
    @Column(name = "seller_enterprise_id")
    private Integer sellerEnterpriseId;

    /**
     * 卖方ID
     */
    @Column(name = "seller_id")
    private Integer sellerId;

    /**
     * 卖方名称
     */
    @Column(name = "seller_name")
    private String sellerName;

    /**
     * 计息开始日期
     */
    @Column(name = "interest_time")
    private Integer interestTime;

    /**
     * 最晚还款日
     */
    @Column(name = "end_repayment_time")
    private Integer endRepaymentTime;

    /**
     * 实体卡号
     */
    @Column(name = "pay_bank_real_number")
    private String payBankRealNumber;

    /**
     * 实体卡城市
     */
    @Column(name = "payerCity")
    private String payercity;

    /**
     * 还款开户名
     */
    @Column(name = "repayment_back_username")
    private String repaymentBackUsername;

    /**
     * 还款银行账号
     */
    @Column(name = "repayment_bank_number")
    private String repaymentBankNumber;

    /**
     * 预计应还总额
     */
    @Column(name = "estimate_repayment_amount")
    private BigDecimal estimateRepaymentAmount;

    /**
     * 预计应还本金
     */
    @Column(name = "estimate_balance")
    private BigDecimal estimateBalance;

    /**
     * 预计收益
     */
    @Column(name = "estimate_interest")
    private BigDecimal estimateInterest;

    /**
     * 实际已还本金
     */
    @Column(name = "reality_balance")
    private BigDecimal realityBalance;

    /**
     * 实际已还利息
     */
    @Column(name = "reality_interest")
    private BigDecimal realityInterest;

    /**
     * 实际已还正常期利息
     */
    @Column(name = "reality_normal_interest")
    private BigDecimal realityNormalInterest;

    /**
     * 实际已还宽限期利息
     */
    @Column(name = "reality_grace_interest")
    private BigDecimal realityGraceInterest;

    /**
     * 实际已还罚息
     */
    @Column(name = "reality_break_interest")
    private BigDecimal realityBreakInterest;

    /**
     * 实际已还复利
     */
    @Column(name = "reality_compound_interest")
    private BigDecimal realityCompoundInterest;

    /**
     * 当前预计应还利息
     */
    @Column(name = "today_interest")
    private BigDecimal todayInterest;

    /**
     * 当前预计应还正常利息
     */
    @Column(name = "today_normal_interest")
    private BigDecimal todayNormalInterest;

    /**
     * 当前预计应还宽限期利息
     */
    @Column(name = "today_grace_interest")
    private BigDecimal todayGraceInterest;

    /**
     * 当前预计应还罚息
     */
    @Column(name = "today_break_interest")
    private BigDecimal todayBreakInterest;

    /**
     * 当前预计应还复利
     */
    @Column(name = "today_compound_interest")
    private BigDecimal todayCompoundInterest;

    /**
     * 剩余未还本金
     */
    @Column(name = "surplus_balance")
    private BigDecimal surplusBalance;

    /**
     * 1/等待还款，2/部分还款，3/已还款
     */
    private Byte status;

    /**
     * 结清日期
     */
    @Column(name = "settle_time")
    private Integer settleTime;

    /**
     * 是否已代偿 0否1是
     */
    @Column(name = "is_compensatory")
    private Boolean isCompensatory;

    /**
     * 是否减免罚息 0否1是
     */
    @Column(name = "is_reduce_interest")
    private Boolean isReduceInterest;

    /**
     * 减免罚息金额
     */
    @Column(name = "reduce_interest_amount")
    private BigDecimal reduceInterestAmount;

    /**
     * 多买方公司ID
     */
    @Column(name = "buyer_company_ids")
    private String buyerCompanyIds;

    /**
     * 账单生成时间
     */
    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 是否坏账   0 否 1 是
     */
    @Column(name = "is_bad_debt")
    private Boolean isBadDebt;

    /**
     * 已收利息转本金
     */
    @Column(name = "bad_reality_interest_to_balance")
    private BigDecimal badRealityInterestToBalance;

    /**
     * 冲后已还本金
     */
    @Column(name = "bad_strike_balance")
    private BigDecimal badStrikeBalance;

    /**
     * 冲后坏账
     */
    @Column(name = "bad_balance")
    private BigDecimal badBalance;

    /**
     * 减少已收利息
     */
    @Column(name = "bad_interest")
    private BigDecimal badInterest;

    /**
     * 冲后已还利息
     */
    @Column(name = "bad_strike_interest")
    private BigDecimal badStrikeInterest;

    /**
     * 是否生成已代偿计息账单 0 否 1 是
     */
    @Column(name = "is_compensatory_interest")
    private Boolean isCompensatoryInterest;

    /**
     * 多买方公司名称
     */
    @Column(name = "buyer_company_names")
    private String buyerCompanyNames;

    /**
     * 获取订单来源1默认/2代表1.2版本的订单
     *
     * @return order_type - 订单来源1默认/2代表1.2版本的订单
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * 设置订单来源1默认/2代表1.2版本的订单
     *
     * @param orderType 订单来源1默认/2代表1.2版本的订单
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取申请单关联ID
     *
     * @return factor_requisition_id - 申请单关联ID
     */
    public Integer getFactorRequisitionId() {
        return factorRequisitionId;
    }

    /**
     * 设置申请单关联ID
     *
     * @param factorRequisitionId 申请单关联ID
     */
    public void setFactorRequisitionId(Integer factorRequisitionId) {
        this.factorRequisitionId = factorRequisitionId;
    }

    /**
     * @return order_number
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * 获取账单号
     *
     * @return number - 账单号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置账单号
     *
     * @param number 账单号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 获取保理金额
     *
     * @return amount - 保理金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置保理金额
     *
     * @param amount 保理金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取最长期限
     *
     * @return time_limit - 最长期限
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置最长期限
     *
     * @param timeLimit 最长期限
     */
    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * 获取利率
     *
     * @return rate - 利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置利率
     *
     * @param rate 利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取买方母公司ID
     *
     * @return buyer_enterprise_id - 买方母公司ID
     */
    public Integer getBuyerEnterpriseId() {
        return buyerEnterpriseId;
    }

    /**
     * 设置买方母公司ID
     *
     * @param buyerEnterpriseId 买方母公司ID
     */
    public void setBuyerEnterpriseId(Integer buyerEnterpriseId) {
        this.buyerEnterpriseId = buyerEnterpriseId;
    }

    /**
     * 获取买方ID
     *
     * @return buyer_id - 买方ID
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 设置买方ID
     *
     * @param buyerId 买方ID
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 获取买方名称
     *
     * @return buyer_name - 买方名称
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 设置买方名称
     *
     * @param buyerName 买方名称
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * 获取卖方母公司ID
     *
     * @return seller_enterprise_id - 卖方母公司ID
     */
    public Integer getSellerEnterpriseId() {
        return sellerEnterpriseId;
    }

    /**
     * 设置卖方母公司ID
     *
     * @param sellerEnterpriseId 卖方母公司ID
     */
    public void setSellerEnterpriseId(Integer sellerEnterpriseId) {
        this.sellerEnterpriseId = sellerEnterpriseId;
    }

    /**
     * 获取卖方ID
     *
     * @return seller_id - 卖方ID
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 设置卖方ID
     *
     * @param sellerId 卖方ID
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 获取卖方名称
     *
     * @return seller_name - 卖方名称
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * 设置卖方名称
     *
     * @param sellerName 卖方名称
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    /**
     * 获取计息开始日期
     *
     * @return interest_time - 计息开始日期
     */
    public Integer getInterestTime() {
        return interestTime;
    }

    /**
     * 设置计息开始日期
     *
     * @param interestTime 计息开始日期
     */
    public void setInterestTime(Integer interestTime) {
        this.interestTime = interestTime;
    }

    /**
     * 获取最晚还款日
     *
     * @return end_repayment_time - 最晚还款日
     */
    public Integer getEndRepaymentTime() {
        return endRepaymentTime;
    }

    /**
     * 设置最晚还款日
     *
     * @param endRepaymentTime 最晚还款日
     */
    public void setEndRepaymentTime(Integer endRepaymentTime) {
        this.endRepaymentTime = endRepaymentTime;
    }

    /**
     * 获取实体卡号
     *
     * @return pay_bank_real_number - 实体卡号
     */
    public String getPayBankRealNumber() {
        return payBankRealNumber;
    }

    /**
     * 设置实体卡号
     *
     * @param payBankRealNumber 实体卡号
     */
    public void setPayBankRealNumber(String payBankRealNumber) {
        this.payBankRealNumber = payBankRealNumber == null ? null : payBankRealNumber.trim();
    }

    /**
     * 获取实体卡城市
     *
     * @return payerCity - 实体卡城市
     */
    public String getPayercity() {
        return payercity;
    }

    /**
     * 设置实体卡城市
     *
     * @param payercity 实体卡城市
     */
    public void setPayercity(String payercity) {
        this.payercity = payercity == null ? null : payercity.trim();
    }

    /**
     * 获取还款开户名
     *
     * @return repayment_back_username - 还款开户名
     */
    public String getRepaymentBackUsername() {
        return repaymentBackUsername;
    }

    /**
     * 设置还款开户名
     *
     * @param repaymentBackUsername 还款开户名
     */
    public void setRepaymentBackUsername(String repaymentBackUsername) {
        this.repaymentBackUsername = repaymentBackUsername == null ? null : repaymentBackUsername.trim();
    }

    /**
     * 获取还款银行账号
     *
     * @return repayment_bank_number - 还款银行账号
     */
    public String getRepaymentBankNumber() {
        return repaymentBankNumber;
    }

    /**
     * 设置还款银行账号
     *
     * @param repaymentBankNumber 还款银行账号
     */
    public void setRepaymentBankNumber(String repaymentBankNumber) {
        this.repaymentBankNumber = repaymentBankNumber == null ? null : repaymentBankNumber.trim();
    }

    /**
     * 获取预计应还总额
     *
     * @return estimate_repayment_amount - 预计应还总额
     */
    public BigDecimal getEstimateRepaymentAmount() {
        return estimateRepaymentAmount;
    }

    /**
     * 设置预计应还总额
     *
     * @param estimateRepaymentAmount 预计应还总额
     */
    public void setEstimateRepaymentAmount(BigDecimal estimateRepaymentAmount) {
        this.estimateRepaymentAmount = estimateRepaymentAmount;
    }

    /**
     * 获取预计应还本金
     *
     * @return estimate_balance - 预计应还本金
     */
    public BigDecimal getEstimateBalance() {
        return estimateBalance;
    }

    /**
     * 设置预计应还本金
     *
     * @param estimateBalance 预计应还本金
     */
    public void setEstimateBalance(BigDecimal estimateBalance) {
        this.estimateBalance = estimateBalance;
    }

    /**
     * 获取预计收益
     *
     * @return estimate_interest - 预计收益
     */
    public BigDecimal getEstimateInterest() {
        return estimateInterest;
    }

    /**
     * 设置预计收益
     *
     * @param estimateInterest 预计收益
     */
    public void setEstimateInterest(BigDecimal estimateInterest) {
        this.estimateInterest = estimateInterest;
    }

    /**
     * 获取实际已还本金
     *
     * @return reality_balance - 实际已还本金
     */
    public BigDecimal getRealityBalance() {
        return realityBalance;
    }

    /**
     * 设置实际已还本金
     *
     * @param realityBalance 实际已还本金
     */
    public void setRealityBalance(BigDecimal realityBalance) {
        this.realityBalance = realityBalance;
    }

    /**
     * 获取实际已还利息
     *
     * @return reality_interest - 实际已还利息
     */
    public BigDecimal getRealityInterest() {
        return realityInterest;
    }

    /**
     * 设置实际已还利息
     *
     * @param realityInterest 实际已还利息
     */
    public void setRealityInterest(BigDecimal realityInterest) {
        this.realityInterest = realityInterest;
    }

    /**
     * 获取实际已还正常期利息
     *
     * @return reality_normal_interest - 实际已还正常期利息
     */
    public BigDecimal getRealityNormalInterest() {
        return realityNormalInterest;
    }

    /**
     * 设置实际已还正常期利息
     *
     * @param realityNormalInterest 实际已还正常期利息
     */
    public void setRealityNormalInterest(BigDecimal realityNormalInterest) {
        this.realityNormalInterest = realityNormalInterest;
    }

    /**
     * 获取实际已还宽限期利息
     *
     * @return reality_grace_interest - 实际已还宽限期利息
     */
    public BigDecimal getRealityGraceInterest() {
        return realityGraceInterest;
    }

    /**
     * 设置实际已还宽限期利息
     *
     * @param realityGraceInterest 实际已还宽限期利息
     */
    public void setRealityGraceInterest(BigDecimal realityGraceInterest) {
        this.realityGraceInterest = realityGraceInterest;
    }

    /**
     * 获取实际已还罚息
     *
     * @return reality_break_interest - 实际已还罚息
     */
    public BigDecimal getRealityBreakInterest() {
        return realityBreakInterest;
    }

    /**
     * 设置实际已还罚息
     *
     * @param realityBreakInterest 实际已还罚息
     */
    public void setRealityBreakInterest(BigDecimal realityBreakInterest) {
        this.realityBreakInterest = realityBreakInterest;
    }

    /**
     * 获取实际已还复利
     *
     * @return reality_compound_interest - 实际已还复利
     */
    public BigDecimal getRealityCompoundInterest() {
        return realityCompoundInterest;
    }

    /**
     * 设置实际已还复利
     *
     * @param realityCompoundInterest 实际已还复利
     */
    public void setRealityCompoundInterest(BigDecimal realityCompoundInterest) {
        this.realityCompoundInterest = realityCompoundInterest;
    }

    /**
     * 获取当前预计应还利息
     *
     * @return today_interest - 当前预计应还利息
     */
    public BigDecimal getTodayInterest() {
        return todayInterest;
    }

    /**
     * 设置当前预计应还利息
     *
     * @param todayInterest 当前预计应还利息
     */
    public void setTodayInterest(BigDecimal todayInterest) {
        this.todayInterest = todayInterest;
    }

    /**
     * 获取当前预计应还正常利息
     *
     * @return today_normal_interest - 当前预计应还正常利息
     */
    public BigDecimal getTodayNormalInterest() {
        return todayNormalInterest;
    }

    /**
     * 设置当前预计应还正常利息
     *
     * @param todayNormalInterest 当前预计应还正常利息
     */
    public void setTodayNormalInterest(BigDecimal todayNormalInterest) {
        this.todayNormalInterest = todayNormalInterest;
    }

    /**
     * 获取当前预计应还宽限期利息
     *
     * @return today_grace_interest - 当前预计应还宽限期利息
     */
    public BigDecimal getTodayGraceInterest() {
        return todayGraceInterest;
    }

    /**
     * 设置当前预计应还宽限期利息
     *
     * @param todayGraceInterest 当前预计应还宽限期利息
     */
    public void setTodayGraceInterest(BigDecimal todayGraceInterest) {
        this.todayGraceInterest = todayGraceInterest;
    }

    /**
     * 获取当前预计应还罚息
     *
     * @return today_break_interest - 当前预计应还罚息
     */
    public BigDecimal getTodayBreakInterest() {
        return todayBreakInterest;
    }

    /**
     * 设置当前预计应还罚息
     *
     * @param todayBreakInterest 当前预计应还罚息
     */
    public void setTodayBreakInterest(BigDecimal todayBreakInterest) {
        this.todayBreakInterest = todayBreakInterest;
    }

    /**
     * 获取当前预计应还复利
     *
     * @return today_compound_interest - 当前预计应还复利
     */
    public BigDecimal getTodayCompoundInterest() {
        return todayCompoundInterest;
    }

    /**
     * 设置当前预计应还复利
     *
     * @param todayCompoundInterest 当前预计应还复利
     */
    public void setTodayCompoundInterest(BigDecimal todayCompoundInterest) {
        this.todayCompoundInterest = todayCompoundInterest;
    }

    /**
     * 获取剩余未还本金
     *
     * @return surplus_balance - 剩余未还本金
     */
    public BigDecimal getSurplusBalance() {
        return surplusBalance;
    }

    /**
     * 设置剩余未还本金
     *
     * @param surplusBalance 剩余未还本金
     */
    public void setSurplusBalance(BigDecimal surplusBalance) {
        this.surplusBalance = surplusBalance;
    }

    /**
     * 获取1/等待还款，2/部分还款，3/已还款
     *
     * @return status - 1/等待还款，2/部分还款，3/已还款
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1/等待还款，2/部分还款，3/已还款
     *
     * @param status 1/等待还款，2/部分还款，3/已还款
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取结清日期
     *
     * @return settle_time - 结清日期
     */
    public Integer getSettleTime() {
        return settleTime;
    }

    /**
     * 设置结清日期
     *
     * @param settleTime 结清日期
     */
    public void setSettleTime(Integer settleTime) {
        this.settleTime = settleTime;
    }

    /**
     * 获取是否已代偿 0否1是
     *
     * @return is_compensatory - 是否已代偿 0否1是
     */
    public Boolean getIsCompensatory() {
        return isCompensatory;
    }

    /**
     * 设置是否已代偿 0否1是
     *
     * @param isCompensatory 是否已代偿 0否1是
     */
    public void setIsCompensatory(Boolean isCompensatory) {
        this.isCompensatory = isCompensatory;
    }

    /**
     * 获取是否减免罚息 0否1是
     *
     * @return is_reduce_interest - 是否减免罚息 0否1是
     */
    public Boolean getIsReduceInterest() {
        return isReduceInterest;
    }

    /**
     * 设置是否减免罚息 0否1是
     *
     * @param isReduceInterest 是否减免罚息 0否1是
     */
    public void setIsReduceInterest(Boolean isReduceInterest) {
        this.isReduceInterest = isReduceInterest;
    }

    /**
     * 获取减免罚息金额
     *
     * @return reduce_interest_amount - 减免罚息金额
     */
    public BigDecimal getReduceInterestAmount() {
        return reduceInterestAmount;
    }

    /**
     * 设置减免罚息金额
     *
     * @param reduceInterestAmount 减免罚息金额
     */
    public void setReduceInterestAmount(BigDecimal reduceInterestAmount) {
        this.reduceInterestAmount = reduceInterestAmount;
    }

    /**
     * 获取多买方公司ID
     *
     * @return buyer_company_ids - 多买方公司ID
     */
    public String getBuyerCompanyIds() {
        return buyerCompanyIds;
    }

    /**
     * 设置多买方公司ID
     *
     * @param buyerCompanyIds 多买方公司ID
     */
    public void setBuyerCompanyIds(String buyerCompanyIds) {
        this.buyerCompanyIds = buyerCompanyIds == null ? null : buyerCompanyIds.trim();
    }

    /**
     * 获取账单生成时间
     *
     * @return create_time - 账单生成时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置账单生成时间
     *
     * @param createTime 账单生成时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否坏账   0 否 1 是
     *
     * @return is_bad_debt - 是否坏账   0 否 1 是
     */
    public Boolean getIsBadDebt() {
        return isBadDebt;
    }

    /**
     * 设置是否坏账   0 否 1 是
     *
     * @param isBadDebt 是否坏账   0 否 1 是
     */
    public void setIsBadDebt(Boolean isBadDebt) {
        this.isBadDebt = isBadDebt;
    }

    /**
     * 获取已收利息转本金
     *
     * @return bad_reality_interest_to_balance - 已收利息转本金
     */
    public BigDecimal getBadRealityInterestToBalance() {
        return badRealityInterestToBalance;
    }

    /**
     * 设置已收利息转本金
     *
     * @param badRealityInterestToBalance 已收利息转本金
     */
    public void setBadRealityInterestToBalance(BigDecimal badRealityInterestToBalance) {
        this.badRealityInterestToBalance = badRealityInterestToBalance;
    }

    /**
     * 获取冲后已还本金
     *
     * @return bad_strike_balance - 冲后已还本金
     */
    public BigDecimal getBadStrikeBalance() {
        return badStrikeBalance;
    }

    /**
     * 设置冲后已还本金
     *
     * @param badStrikeBalance 冲后已还本金
     */
    public void setBadStrikeBalance(BigDecimal badStrikeBalance) {
        this.badStrikeBalance = badStrikeBalance;
    }

    /**
     * 获取冲后坏账
     *
     * @return bad_balance - 冲后坏账
     */
    public BigDecimal getBadBalance() {
        return badBalance;
    }

    /**
     * 设置冲后坏账
     *
     * @param badBalance 冲后坏账
     */
    public void setBadBalance(BigDecimal badBalance) {
        this.badBalance = badBalance;
    }

    /**
     * 获取减少已收利息
     *
     * @return bad_interest - 减少已收利息
     */
    public BigDecimal getBadInterest() {
        return badInterest;
    }

    /**
     * 设置减少已收利息
     *
     * @param badInterest 减少已收利息
     */
    public void setBadInterest(BigDecimal badInterest) {
        this.badInterest = badInterest;
    }

    /**
     * 获取冲后已还利息
     *
     * @return bad_strike_interest - 冲后已还利息
     */
    public BigDecimal getBadStrikeInterest() {
        return badStrikeInterest;
    }

    /**
     * 设置冲后已还利息
     *
     * @param badStrikeInterest 冲后已还利息
     */
    public void setBadStrikeInterest(BigDecimal badStrikeInterest) {
        this.badStrikeInterest = badStrikeInterest;
    }

    /**
     * 获取是否生成已代偿计息账单 0 否 1 是
     *
     * @return is_compensatory_interest - 是否生成已代偿计息账单 0 否 1 是
     */
    public Boolean getIsCompensatoryInterest() {
        return isCompensatoryInterest;
    }

    /**
     * 设置是否生成已代偿计息账单 0 否 1 是
     *
     * @param isCompensatoryInterest 是否生成已代偿计息账单 0 否 1 是
     */
    public void setIsCompensatoryInterest(Boolean isCompensatoryInterest) {
        this.isCompensatoryInterest = isCompensatoryInterest;
    }

    /**
     * 获取多买方公司名称
     *
     * @return buyer_company_names - 多买方公司名称
     */
    public String getBuyerCompanyNames() {
        return buyerCompanyNames;
    }

    /**
     * 设置多买方公司名称
     *
     * @param buyerCompanyNames 多买方公司名称
     */
    public void setBuyerCompanyNames(String buyerCompanyNames) {
        this.buyerCompanyNames = buyerCompanyNames == null ? null : buyerCompanyNames.trim();
    }
}