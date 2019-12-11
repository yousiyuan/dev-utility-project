package com.glp.data.warehouse.entity.glp.factor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "factor_product_order")
public class FactorProductOrder implements Serializable {
    @Id
    private Integer id;

    /**
     * 开通的产品关联ID
     */
    @Column(name = "product_list_id")
    private Integer productListId;

    /**
     * 授信企业id
     */
    @Column(name = "credit_company_id")
    private Integer creditCompanyId;

    /**
     * 订单来源/1客户经理/2客户
     */
    private Byte source;

    /**
     * 订单号
     */
    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 买方组织ID
     */
    @Column(name = "buyer_organization_id")
    private Integer buyerOrganizationId;

    /**
     * 买方企业ID
     */
    @Column(name = "buyer_company_id")
    private Integer buyerCompanyId;

    /**
     * 卖方组织ID
     */
    @Column(name = "seller_organization_id")
    private Integer sellerOrganizationId;

    /**
     * 卖方企业ID
     */
    @Column(name = "seller_company_id")
    private Integer sellerCompanyId;

    /**
     * 第一步确权金额
     */
    @Column(name = "buyer_apply_amount")
    private BigDecimal buyerApplyAmount;

    /**
     * 第二步卖方审核金额
     */
    @Column(name = "seller_apply_amount")
    private BigDecimal sellerApplyAmount;

    /**
     * 申请时间
     */
    @Column(name = "seller_apply_amount_time")
    private Integer sellerApplyAmountTime;

    /**
     * 第三方组织id
     */
    @Column(name = "third_organization_id")
    private Integer thirdOrganizationId;

    /**
     * 第三方公司id
     */
    @Column(name = "third_company_id")
    private Integer thirdCompanyId;

    /**
     * 保理金额
     */
    private BigDecimal amount;

    /**
     * 产品类型名
     */
    @Column(name = "product_type_name")
    private String productTypeName;

    /**
     * 利率
     */
    private BigDecimal rate;

    /**
     * 期限
     */
    @Column(name = "due_time")
    private Integer dueTime;

    /**
     * 0无服务费/1有服务费
     */
    @Column(name = "is_service")
    private Byte isService;

    /**
     * 服务费金额
     */
    @Column(name = "sevice_amount")
    private BigDecimal seviceAmount;

    /**
     * 服务费核销状态 0 不用核销 1 待核销  2已核销
     */
    @Column(name = "is_service_verification")
    private Byte isServiceVerification;

    /**
     * 手续费核销人id
     */
    @Column(name = "service_verification_user_id")
    private Integer serviceVerificationUserId;

    /**
     * 手续费核销时间
     */
    @Column(name = "service_verification_time")
    private Integer serviceVerificationTime;

    /**
     * 还款银行
     */
    @Column(name = "repayment_bank_name")
    private String repaymentBankName;

    /**
     * 还款开户分行
     */
    @Column(name = "repayment_back_filiale")
    private String repaymentBackFiliale;

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
     * 收款银行
     */
    @Column(name = "receipt_bank_name")
    private String receiptBankName;

    /**
     * 收款银行编号
     */
    @Column(name = "receipt_bank_code")
    private String receiptBankCode;

    /**
     * 收款开户支行
     */
    @Column(name = "receipt_bank_filiale")
    private String receiptBankFiliale;

    /**
     * 收款银行支行号
     */
    @Column(name = "receipt_bank_filiale_branchNo")
    private String receiptBankFilialeBranchno;

    /**
     * 收款银行省份
     */
    @Column(name = "receipt_bank_provName")
    private String receiptBankProvname;

    /**
     * 收款银行城市
     */
    @Column(name = "receipt_bank_cityName")
    private String receiptBankCityname;

    /**
     * 收款开户名
     */
    @Column(name = "receipt_bank_username")
    private String receiptBankUsername;

    /**
     * 收款银行账号
     */
    @Column(name = "receipt_bank_number")
    private String receiptBankNumber;

    /**
     * 1线上打款,2线下打款
     */
    @Column(name = "pay_type")
    private Byte payType;

    /**
     * 打款银行
     */
    @Column(name = "pay_bank_name")
    private String payBankName;

    /**
     * 打款银行支行
     */
    @Column(name = "pay_bank_filiale")
    private String payBankFiliale;

    /**
     * 银行实体账号
     */
    @Column(name = "pay_bank_real_number")
    private String payBankRealNumber;

    /**
     * 银行请求参数
     */
    @Column(name = "pay_bank_extension")
    private String payBankExtension;

    /**
     * 打款账户
     */
    @Column(name = "pay_bank_username")
    private String payBankUsername;

    /**
     * 打款支出协议账号
     */
    @Column(name = "pay_bank_number")
    private String payBankNumber;

    /**
     * 维金支付订单号
     */
    @Column(name = "pay_order_number")
    private String payOrderNumber;

    /**
     * 支付失败原因
     */
    @Column(name = "pay_notes")
    private String payNotes;

    /**
     * 0未打款/1打款中/2打款完成/3打款失败
     */
    @Column(name = "pay_status")
    private Byte payStatus;

    /**
     * 质押单号
     */
    @Column(name = "pledge_number")
    private String pledgeNumber;

    /**
     * 预计放款时间
     */
    @Column(name = "estimate_pay_time")
    private Integer estimatePayTime;

    /**
     * 打款成功时间
     */
    @Column(name = "pay_success_time")
    private Integer paySuccessTime;

    /**
     * 支付回调时间
     */
    @Column(name = "pay_notice_time")
    private Integer payNoticeTime;

    /**
     * 用户第三方回调地址
     */
    @Column(name = "callback_url")
    private String callbackUrl;

    /**
     * 账单账款明细推送地址
     */
    @Column(name = "account_bill_notice_url")
    private String accountBillNoticeUrl;

    /**
     * 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     */
    private Byte status;

    /**
     * 审核状态,0默认，1通过，2不通过
     */
    @Column(name = "audit_status")
    private Byte auditStatus;

    /**
     * 流程是否关闭，默认0开启，1关闭
     */
    @Column(name = "is_close")
    private Byte isClose;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 违约期利率
     */
    @Column(name = "break_rate")
    private BigDecimal breakRate;

    /**
     * 是否有宽限期
     */
    @Column(name = "is_grace_period")
    private Boolean isGracePeriod;

    /**
     * 宽限期
     */
    @Column(name = "grace_period")
    private Integer gracePeriod;

    /**
     * 宽限期利率
     */
    @Column(name = "grace_period_rate")
    private BigDecimal gracePeriodRate;

    /**
     * 复利利率
     */
    @Column(name = "compound_rate")
    private BigDecimal compoundRate;

    @Column(name = "repeat_repayment_instance_name")
    private String repeatRepaymentInstanceName;

    @Column(name = "repeat_repayment_instance_number")
    private String repeatRepaymentInstanceNumber;

    @Column(name = "repeat_repayment_bank_extension")
    private String repeatRepaymentBankExtension;

    @Column(name = "repeat_repayment_bank_name")
    private String repeatRepaymentBankName;

    @Column(name = "repeat_repayment_back_filiale")
    private String repeatRepaymentBackFiliale;

    @Column(name = "repeat_repayment_back_username")
    private String repeatRepaymentBackUsername;

    @Column(name = "repeat_repayment_bank_number")
    private String repeatRepaymentBankNumber;

    /**
     * 还款方式 1 期限还款 2日期还款
     */
    @Column(name = "payment_method")
    private Boolean paymentMethod;

    @Column(name = "repayment_time")
    private Integer repaymentTime;

    /**
     * 起息日
     */
    @Column(name = "interest_time")
    private Integer interestTime;

    /**
     * 银企直连支付平台产生的流水号
     */
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * 银行记账流水号
     */
    @Column(name = "trans_seq")
    private String transSeq;

    /**
     * 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     */
    @Column(name = "trans_step")
    private String transStep;

    /**
     * 订单支付提交流水号
     */
    @Column(name = "trans_order_seq")
    private Integer transOrderSeq;

    /**
     * 签署人手机号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 申请付款金额留存
     */
    @Column(name = "apply_amount")
    private BigDecimal applyAmount;

    /**
     * 授信额度id
     */
    @Column(name = "credit_line_id")
    private Integer creditLineId;

    /**
     * 最新的额度id
     */
    @Column(name = "latest_credit_line_id")
    private Integer latestCreditLineId;

    /**
     * 债权描述
     */
    @Column(name = "credit_description")
    private String creditDescription;

    /**
     * 客户方贷款申请唯一标识
     */
    @Column(name = "client_number")
    private String clientNumber;

    /**
     * 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     */
    @Column(name = "order_status")
    private Boolean orderStatus;

    /**
     * 客户卖方标识
     */
    @Column(name = "custom_seller_company_id")
    private String customSellerCompanyId;

    /**
     * 人工审批原因
     */
    @Column(name = "manual_audit_reason")
    private String manualAuditReason;

    /**
     * 多买方公司ID
     */
    @Column(name = "buyer_company_ids")
    private String buyerCompanyIds;

    @Column(name = "contract_sign_url")
    private String contractSignUrl;

    /**
     * 打款银行科目编码
     */
    @Column(name = "pay_bank_ANI")
    private String payBankAni;

    /**
     * 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     */
    @Column(name = "fee_rollback_status")
    private Boolean feeRollbackStatus;

    /**
     * 手续费回滚审核时间
     */
    @Column(name = "fee_rollback_time")
    private Integer feeRollbackTime;

    /**
     * 多买方公司名称
     */
    @Column(name = "buyer_company_names")
    private String buyerCompanyNames;

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
     * 获取开通的产品关联ID
     *
     * @return product_list_id - 开通的产品关联ID
     */
    public Integer getProductListId() {
        return productListId;
    }

    /**
     * 设置开通的产品关联ID
     *
     * @param productListId 开通的产品关联ID
     */
    public void setProductListId(Integer productListId) {
        this.productListId = productListId;
    }

    /**
     * 获取授信企业id
     *
     * @return credit_company_id - 授信企业id
     */
    public Integer getCreditCompanyId() {
        return creditCompanyId;
    }

    /**
     * 设置授信企业id
     *
     * @param creditCompanyId 授信企业id
     */
    public void setCreditCompanyId(Integer creditCompanyId) {
        this.creditCompanyId = creditCompanyId;
    }

    /**
     * 获取订单来源/1客户经理/2客户
     *
     * @return source - 订单来源/1客户经理/2客户
     */
    public Byte getSource() {
        return source;
    }

    /**
     * 设置订单来源/1客户经理/2客户
     *
     * @param source 订单来源/1客户经理/2客户
     */
    public void setSource(Byte source) {
        this.source = source;
    }

    /**
     * 获取订单号
     *
     * @return order_number - 订单号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置订单号
     *
     * @param orderNumber 订单号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * 获取买方组织ID
     *
     * @return buyer_organization_id - 买方组织ID
     */
    public Integer getBuyerOrganizationId() {
        return buyerOrganizationId;
    }

    /**
     * 设置买方组织ID
     *
     * @param buyerOrganizationId 买方组织ID
     */
    public void setBuyerOrganizationId(Integer buyerOrganizationId) {
        this.buyerOrganizationId = buyerOrganizationId;
    }

    /**
     * 获取买方企业ID
     *
     * @return buyer_company_id - 买方企业ID
     */
    public Integer getBuyerCompanyId() {
        return buyerCompanyId;
    }

    /**
     * 设置买方企业ID
     *
     * @param buyerCompanyId 买方企业ID
     */
    public void setBuyerCompanyId(Integer buyerCompanyId) {
        this.buyerCompanyId = buyerCompanyId;
    }

    /**
     * 获取卖方组织ID
     *
     * @return seller_organization_id - 卖方组织ID
     */
    public Integer getSellerOrganizationId() {
        return sellerOrganizationId;
    }

    /**
     * 设置卖方组织ID
     *
     * @param sellerOrganizationId 卖方组织ID
     */
    public void setSellerOrganizationId(Integer sellerOrganizationId) {
        this.sellerOrganizationId = sellerOrganizationId;
    }

    /**
     * 获取卖方企业ID
     *
     * @return seller_company_id - 卖方企业ID
     */
    public Integer getSellerCompanyId() {
        return sellerCompanyId;
    }

    /**
     * 设置卖方企业ID
     *
     * @param sellerCompanyId 卖方企业ID
     */
    public void setSellerCompanyId(Integer sellerCompanyId) {
        this.sellerCompanyId = sellerCompanyId;
    }

    /**
     * 获取第一步确权金额
     *
     * @return buyer_apply_amount - 第一步确权金额
     */
    public BigDecimal getBuyerApplyAmount() {
        return buyerApplyAmount;
    }

    /**
     * 设置第一步确权金额
     *
     * @param buyerApplyAmount 第一步确权金额
     */
    public void setBuyerApplyAmount(BigDecimal buyerApplyAmount) {
        this.buyerApplyAmount = buyerApplyAmount;
    }

    /**
     * 获取第二步卖方审核金额
     *
     * @return seller_apply_amount - 第二步卖方审核金额
     */
    public BigDecimal getSellerApplyAmount() {
        return sellerApplyAmount;
    }

    /**
     * 设置第二步卖方审核金额
     *
     * @param sellerApplyAmount 第二步卖方审核金额
     */
    public void setSellerApplyAmount(BigDecimal sellerApplyAmount) {
        this.sellerApplyAmount = sellerApplyAmount;
    }

    /**
     * 获取申请时间
     *
     * @return seller_apply_amount_time - 申请时间
     */
    public Integer getSellerApplyAmountTime() {
        return sellerApplyAmountTime;
    }

    /**
     * 设置申请时间
     *
     * @param sellerApplyAmountTime 申请时间
     */
    public void setSellerApplyAmountTime(Integer sellerApplyAmountTime) {
        this.sellerApplyAmountTime = sellerApplyAmountTime;
    }

    /**
     * 获取第三方组织id
     *
     * @return third_organization_id - 第三方组织id
     */
    public Integer getThirdOrganizationId() {
        return thirdOrganizationId;
    }

    /**
     * 设置第三方组织id
     *
     * @param thirdOrganizationId 第三方组织id
     */
    public void setThirdOrganizationId(Integer thirdOrganizationId) {
        this.thirdOrganizationId = thirdOrganizationId;
    }

    /**
     * 获取第三方公司id
     *
     * @return third_company_id - 第三方公司id
     */
    public Integer getThirdCompanyId() {
        return thirdCompanyId;
    }

    /**
     * 设置第三方公司id
     *
     * @param thirdCompanyId 第三方公司id
     */
    public void setThirdCompanyId(Integer thirdCompanyId) {
        this.thirdCompanyId = thirdCompanyId;
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
     * 获取产品类型名
     *
     * @return product_type_name - 产品类型名
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * 设置产品类型名
     *
     * @param productTypeName 产品类型名
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
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
     * 获取期限
     *
     * @return due_time - 期限
     */
    public Integer getDueTime() {
        return dueTime;
    }

    /**
     * 设置期限
     *
     * @param dueTime 期限
     */
    public void setDueTime(Integer dueTime) {
        this.dueTime = dueTime;
    }

    /**
     * 获取0无服务费/1有服务费
     *
     * @return is_service - 0无服务费/1有服务费
     */
    public Byte getIsService() {
        return isService;
    }

    /**
     * 设置0无服务费/1有服务费
     *
     * @param isService 0无服务费/1有服务费
     */
    public void setIsService(Byte isService) {
        this.isService = isService;
    }

    /**
     * 获取服务费金额
     *
     * @return sevice_amount - 服务费金额
     */
    public BigDecimal getSeviceAmount() {
        return seviceAmount;
    }

    /**
     * 设置服务费金额
     *
     * @param seviceAmount 服务费金额
     */
    public void setSeviceAmount(BigDecimal seviceAmount) {
        this.seviceAmount = seviceAmount;
    }

    /**
     * 获取服务费核销状态 0 不用核销 1 待核销  2已核销
     *
     * @return is_service_verification - 服务费核销状态 0 不用核销 1 待核销  2已核销
     */
    public Byte getIsServiceVerification() {
        return isServiceVerification;
    }

    /**
     * 设置服务费核销状态 0 不用核销 1 待核销  2已核销
     *
     * @param isServiceVerification 服务费核销状态 0 不用核销 1 待核销  2已核销
     */
    public void setIsServiceVerification(Byte isServiceVerification) {
        this.isServiceVerification = isServiceVerification;
    }

    /**
     * 获取手续费核销人id
     *
     * @return service_verification_user_id - 手续费核销人id
     */
    public Integer getServiceVerificationUserId() {
        return serviceVerificationUserId;
    }

    /**
     * 设置手续费核销人id
     *
     * @param serviceVerificationUserId 手续费核销人id
     */
    public void setServiceVerificationUserId(Integer serviceVerificationUserId) {
        this.serviceVerificationUserId = serviceVerificationUserId;
    }

    /**
     * 获取手续费核销时间
     *
     * @return service_verification_time - 手续费核销时间
     */
    public Integer getServiceVerificationTime() {
        return serviceVerificationTime;
    }

    /**
     * 设置手续费核销时间
     *
     * @param serviceVerificationTime 手续费核销时间
     */
    public void setServiceVerificationTime(Integer serviceVerificationTime) {
        this.serviceVerificationTime = serviceVerificationTime;
    }

    /**
     * 获取还款银行
     *
     * @return repayment_bank_name - 还款银行
     */
    public String getRepaymentBankName() {
        return repaymentBankName;
    }

    /**
     * 设置还款银行
     *
     * @param repaymentBankName 还款银行
     */
    public void setRepaymentBankName(String repaymentBankName) {
        this.repaymentBankName = repaymentBankName == null ? null : repaymentBankName.trim();
    }

    /**
     * 获取还款开户分行
     *
     * @return repayment_back_filiale - 还款开户分行
     */
    public String getRepaymentBackFiliale() {
        return repaymentBackFiliale;
    }

    /**
     * 设置还款开户分行
     *
     * @param repaymentBackFiliale 还款开户分行
     */
    public void setRepaymentBackFiliale(String repaymentBackFiliale) {
        this.repaymentBackFiliale = repaymentBackFiliale == null ? null : repaymentBackFiliale.trim();
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
     * 获取收款银行
     *
     * @return receipt_bank_name - 收款银行
     */
    public String getReceiptBankName() {
        return receiptBankName;
    }

    /**
     * 设置收款银行
     *
     * @param receiptBankName 收款银行
     */
    public void setReceiptBankName(String receiptBankName) {
        this.receiptBankName = receiptBankName == null ? null : receiptBankName.trim();
    }

    /**
     * 获取收款银行编号
     *
     * @return receipt_bank_code - 收款银行编号
     */
    public String getReceiptBankCode() {
        return receiptBankCode;
    }

    /**
     * 设置收款银行编号
     *
     * @param receiptBankCode 收款银行编号
     */
    public void setReceiptBankCode(String receiptBankCode) {
        this.receiptBankCode = receiptBankCode == null ? null : receiptBankCode.trim();
    }

    /**
     * 获取收款开户支行
     *
     * @return receipt_bank_filiale - 收款开户支行
     */
    public String getReceiptBankFiliale() {
        return receiptBankFiliale;
    }

    /**
     * 设置收款开户支行
     *
     * @param receiptBankFiliale 收款开户支行
     */
    public void setReceiptBankFiliale(String receiptBankFiliale) {
        this.receiptBankFiliale = receiptBankFiliale == null ? null : receiptBankFiliale.trim();
    }

    /**
     * 获取收款银行支行号
     *
     * @return receipt_bank_filiale_branchNo - 收款银行支行号
     */
    public String getReceiptBankFilialeBranchno() {
        return receiptBankFilialeBranchno;
    }

    /**
     * 设置收款银行支行号
     *
     * @param receiptBankFilialeBranchno 收款银行支行号
     */
    public void setReceiptBankFilialeBranchno(String receiptBankFilialeBranchno) {
        this.receiptBankFilialeBranchno = receiptBankFilialeBranchno == null ? null : receiptBankFilialeBranchno.trim();
    }

    /**
     * 获取收款银行省份
     *
     * @return receipt_bank_provName - 收款银行省份
     */
    public String getReceiptBankProvname() {
        return receiptBankProvname;
    }

    /**
     * 设置收款银行省份
     *
     * @param receiptBankProvname 收款银行省份
     */
    public void setReceiptBankProvname(String receiptBankProvname) {
        this.receiptBankProvname = receiptBankProvname == null ? null : receiptBankProvname.trim();
    }

    /**
     * 获取收款银行城市
     *
     * @return receipt_bank_cityName - 收款银行城市
     */
    public String getReceiptBankCityname() {
        return receiptBankCityname;
    }

    /**
     * 设置收款银行城市
     *
     * @param receiptBankCityname 收款银行城市
     */
    public void setReceiptBankCityname(String receiptBankCityname) {
        this.receiptBankCityname = receiptBankCityname == null ? null : receiptBankCityname.trim();
    }

    /**
     * 获取收款开户名
     *
     * @return receipt_bank_username - 收款开户名
     */
    public String getReceiptBankUsername() {
        return receiptBankUsername;
    }

    /**
     * 设置收款开户名
     *
     * @param receiptBankUsername 收款开户名
     */
    public void setReceiptBankUsername(String receiptBankUsername) {
        this.receiptBankUsername = receiptBankUsername == null ? null : receiptBankUsername.trim();
    }

    /**
     * 获取收款银行账号
     *
     * @return receipt_bank_number - 收款银行账号
     */
    public String getReceiptBankNumber() {
        return receiptBankNumber;
    }

    /**
     * 设置收款银行账号
     *
     * @param receiptBankNumber 收款银行账号
     */
    public void setReceiptBankNumber(String receiptBankNumber) {
        this.receiptBankNumber = receiptBankNumber == null ? null : receiptBankNumber.trim();
    }

    /**
     * 获取1线上打款,2线下打款
     *
     * @return pay_type - 1线上打款,2线下打款
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * 设置1线上打款,2线下打款
     *
     * @param payType 1线上打款,2线下打款
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * 获取打款银行
     *
     * @return pay_bank_name - 打款银行
     */
    public String getPayBankName() {
        return payBankName;
    }

    /**
     * 设置打款银行
     *
     * @param payBankName 打款银行
     */
    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName == null ? null : payBankName.trim();
    }

    /**
     * 获取打款银行支行
     *
     * @return pay_bank_filiale - 打款银行支行
     */
    public String getPayBankFiliale() {
        return payBankFiliale;
    }

    /**
     * 设置打款银行支行
     *
     * @param payBankFiliale 打款银行支行
     */
    public void setPayBankFiliale(String payBankFiliale) {
        this.payBankFiliale = payBankFiliale == null ? null : payBankFiliale.trim();
    }

    /**
     * 获取银行实体账号
     *
     * @return pay_bank_real_number - 银行实体账号
     */
    public String getPayBankRealNumber() {
        return payBankRealNumber;
    }

    /**
     * 设置银行实体账号
     *
     * @param payBankRealNumber 银行实体账号
     */
    public void setPayBankRealNumber(String payBankRealNumber) {
        this.payBankRealNumber = payBankRealNumber == null ? null : payBankRealNumber.trim();
    }

    /**
     * 获取银行请求参数
     *
     * @return pay_bank_extension - 银行请求参数
     */
    public String getPayBankExtension() {
        return payBankExtension;
    }

    /**
     * 设置银行请求参数
     *
     * @param payBankExtension 银行请求参数
     */
    public void setPayBankExtension(String payBankExtension) {
        this.payBankExtension = payBankExtension == null ? null : payBankExtension.trim();
    }

    /**
     * 获取打款账户
     *
     * @return pay_bank_username - 打款账户
     */
    public String getPayBankUsername() {
        return payBankUsername;
    }

    /**
     * 设置打款账户
     *
     * @param payBankUsername 打款账户
     */
    public void setPayBankUsername(String payBankUsername) {
        this.payBankUsername = payBankUsername == null ? null : payBankUsername.trim();
    }

    /**
     * 获取打款支出协议账号
     *
     * @return pay_bank_number - 打款支出协议账号
     */
    public String getPayBankNumber() {
        return payBankNumber;
    }

    /**
     * 设置打款支出协议账号
     *
     * @param payBankNumber 打款支出协议账号
     */
    public void setPayBankNumber(String payBankNumber) {
        this.payBankNumber = payBankNumber == null ? null : payBankNumber.trim();
    }

    /**
     * 获取维金支付订单号
     *
     * @return pay_order_number - 维金支付订单号
     */
    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    /**
     * 设置维金支付订单号
     *
     * @param payOrderNumber 维金支付订单号
     */
    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber == null ? null : payOrderNumber.trim();
    }

    /**
     * 获取支付失败原因
     *
     * @return pay_notes - 支付失败原因
     */
    public String getPayNotes() {
        return payNotes;
    }

    /**
     * 设置支付失败原因
     *
     * @param payNotes 支付失败原因
     */
    public void setPayNotes(String payNotes) {
        this.payNotes = payNotes == null ? null : payNotes.trim();
    }

    /**
     * 获取0未打款/1打款中/2打款完成/3打款失败
     *
     * @return pay_status - 0未打款/1打款中/2打款完成/3打款失败
     */
    public Byte getPayStatus() {
        return payStatus;
    }

    /**
     * 设置0未打款/1打款中/2打款完成/3打款失败
     *
     * @param payStatus 0未打款/1打款中/2打款完成/3打款失败
     */
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取质押单号
     *
     * @return pledge_number - 质押单号
     */
    public String getPledgeNumber() {
        return pledgeNumber;
    }

    /**
     * 设置质押单号
     *
     * @param pledgeNumber 质押单号
     */
    public void setPledgeNumber(String pledgeNumber) {
        this.pledgeNumber = pledgeNumber == null ? null : pledgeNumber.trim();
    }

    /**
     * 获取预计放款时间
     *
     * @return estimate_pay_time - 预计放款时间
     */
    public Integer getEstimatePayTime() {
        return estimatePayTime;
    }

    /**
     * 设置预计放款时间
     *
     * @param estimatePayTime 预计放款时间
     */
    public void setEstimatePayTime(Integer estimatePayTime) {
        this.estimatePayTime = estimatePayTime;
    }

    /**
     * 获取打款成功时间
     *
     * @return pay_success_time - 打款成功时间
     */
    public Integer getPaySuccessTime() {
        return paySuccessTime;
    }

    /**
     * 设置打款成功时间
     *
     * @param paySuccessTime 打款成功时间
     */
    public void setPaySuccessTime(Integer paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    /**
     * 获取支付回调时间
     *
     * @return pay_notice_time - 支付回调时间
     */
    public Integer getPayNoticeTime() {
        return payNoticeTime;
    }

    /**
     * 设置支付回调时间
     *
     * @param payNoticeTime 支付回调时间
     */
    public void setPayNoticeTime(Integer payNoticeTime) {
        this.payNoticeTime = payNoticeTime;
    }

    /**
     * 获取用户第三方回调地址
     *
     * @return callback_url - 用户第三方回调地址
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * 设置用户第三方回调地址
     *
     * @param callbackUrl 用户第三方回调地址
     */
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
    }

    /**
     * 获取账单账款明细推送地址
     *
     * @return account_bill_notice_url - 账单账款明细推送地址
     */
    public String getAccountBillNoticeUrl() {
        return accountBillNoticeUrl;
    }

    /**
     * 设置账单账款明细推送地址
     *
     * @param accountBillNoticeUrl 账单账款明细推送地址
     */
    public void setAccountBillNoticeUrl(String accountBillNoticeUrl) {
        this.accountBillNoticeUrl = accountBillNoticeUrl == null ? null : accountBillNoticeUrl.trim();
    }

    /**
     * 获取状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     *
     * @return status - 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     *
     * @param status 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取审核状态,0默认，1通过，2不通过
     *
     * @return audit_status - 审核状态,0默认，1通过，2不通过
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态,0默认，1通过，2不通过
     *
     * @param auditStatus 审核状态,0默认，1通过，2不通过
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取流程是否关闭，默认0开启，1关闭
     *
     * @return is_close - 流程是否关闭，默认0开启，1关闭
     */
    public Byte getIsClose() {
        return isClose;
    }

    /**
     * 设置流程是否关闭，默认0开启，1关闭
     *
     * @param isClose 流程是否关闭，默认0开启，1关闭
     */
    public void setIsClose(Byte isClose) {
        this.isClose = isClose;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
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
     * 获取违约期利率
     *
     * @return break_rate - 违约期利率
     */
    public BigDecimal getBreakRate() {
        return breakRate;
    }

    /**
     * 设置违约期利率
     *
     * @param breakRate 违约期利率
     */
    public void setBreakRate(BigDecimal breakRate) {
        this.breakRate = breakRate;
    }

    /**
     * 获取是否有宽限期
     *
     * @return is_grace_period - 是否有宽限期
     */
    public Boolean getIsGracePeriod() {
        return isGracePeriod;
    }

    /**
     * 设置是否有宽限期
     *
     * @param isGracePeriod 是否有宽限期
     */
    public void setIsGracePeriod(Boolean isGracePeriod) {
        this.isGracePeriod = isGracePeriod;
    }

    /**
     * 获取宽限期
     *
     * @return grace_period - 宽限期
     */
    public Integer getGracePeriod() {
        return gracePeriod;
    }

    /**
     * 设置宽限期
     *
     * @param gracePeriod 宽限期
     */
    public void setGracePeriod(Integer gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    /**
     * 获取宽限期利率
     *
     * @return grace_period_rate - 宽限期利率
     */
    public BigDecimal getGracePeriodRate() {
        return gracePeriodRate;
    }

    /**
     * 设置宽限期利率
     *
     * @param gracePeriodRate 宽限期利率
     */
    public void setGracePeriodRate(BigDecimal gracePeriodRate) {
        this.gracePeriodRate = gracePeriodRate;
    }

    /**
     * 获取复利利率
     *
     * @return compound_rate - 复利利率
     */
    public BigDecimal getCompoundRate() {
        return compoundRate;
    }

    /**
     * 设置复利利率
     *
     * @param compoundRate 复利利率
     */
    public void setCompoundRate(BigDecimal compoundRate) {
        this.compoundRate = compoundRate;
    }

    /**
     * @return repeat_repayment_instance_name
     */
    public String getRepeatRepaymentInstanceName() {
        return repeatRepaymentInstanceName;
    }

    /**
     * @param repeatRepaymentInstanceName
     */
    public void setRepeatRepaymentInstanceName(String repeatRepaymentInstanceName) {
        this.repeatRepaymentInstanceName = repeatRepaymentInstanceName == null ? null : repeatRepaymentInstanceName.trim();
    }

    /**
     * @return repeat_repayment_instance_number
     */
    public String getRepeatRepaymentInstanceNumber() {
        return repeatRepaymentInstanceNumber;
    }

    /**
     * @param repeatRepaymentInstanceNumber
     */
    public void setRepeatRepaymentInstanceNumber(String repeatRepaymentInstanceNumber) {
        this.repeatRepaymentInstanceNumber = repeatRepaymentInstanceNumber == null ? null : repeatRepaymentInstanceNumber.trim();
    }

    /**
     * @return repeat_repayment_bank_extension
     */
    public String getRepeatRepaymentBankExtension() {
        return repeatRepaymentBankExtension;
    }

    /**
     * @param repeatRepaymentBankExtension
     */
    public void setRepeatRepaymentBankExtension(String repeatRepaymentBankExtension) {
        this.repeatRepaymentBankExtension = repeatRepaymentBankExtension == null ? null : repeatRepaymentBankExtension.trim();
    }

    /**
     * @return repeat_repayment_bank_name
     */
    public String getRepeatRepaymentBankName() {
        return repeatRepaymentBankName;
    }

    /**
     * @param repeatRepaymentBankName
     */
    public void setRepeatRepaymentBankName(String repeatRepaymentBankName) {
        this.repeatRepaymentBankName = repeatRepaymentBankName == null ? null : repeatRepaymentBankName.trim();
    }

    /**
     * @return repeat_repayment_back_filiale
     */
    public String getRepeatRepaymentBackFiliale() {
        return repeatRepaymentBackFiliale;
    }

    /**
     * @param repeatRepaymentBackFiliale
     */
    public void setRepeatRepaymentBackFiliale(String repeatRepaymentBackFiliale) {
        this.repeatRepaymentBackFiliale = repeatRepaymentBackFiliale == null ? null : repeatRepaymentBackFiliale.trim();
    }

    /**
     * @return repeat_repayment_back_username
     */
    public String getRepeatRepaymentBackUsername() {
        return repeatRepaymentBackUsername;
    }

    /**
     * @param repeatRepaymentBackUsername
     */
    public void setRepeatRepaymentBackUsername(String repeatRepaymentBackUsername) {
        this.repeatRepaymentBackUsername = repeatRepaymentBackUsername == null ? null : repeatRepaymentBackUsername.trim();
    }

    /**
     * @return repeat_repayment_bank_number
     */
    public String getRepeatRepaymentBankNumber() {
        return repeatRepaymentBankNumber;
    }

    /**
     * @param repeatRepaymentBankNumber
     */
    public void setRepeatRepaymentBankNumber(String repeatRepaymentBankNumber) {
        this.repeatRepaymentBankNumber = repeatRepaymentBankNumber == null ? null : repeatRepaymentBankNumber.trim();
    }

    /**
     * 获取还款方式 1 期限还款 2日期还款
     *
     * @return payment_method - 还款方式 1 期限还款 2日期还款
     */
    public Boolean getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置还款方式 1 期限还款 2日期还款
     *
     * @param paymentMethod 还款方式 1 期限还款 2日期还款
     */
    public void setPaymentMethod(Boolean paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return repayment_time
     */
    public Integer getRepaymentTime() {
        return repaymentTime;
    }

    /**
     * @param repaymentTime
     */
    public void setRepaymentTime(Integer repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    /**
     * 获取起息日
     *
     * @return interest_time - 起息日
     */
    public Integer getInterestTime() {
        return interestTime;
    }

    /**
     * 设置起息日
     *
     * @param interestTime 起息日
     */
    public void setInterestTime(Integer interestTime) {
        this.interestTime = interestTime;
    }

    /**
     * 获取银企直连支付平台产生的流水号
     *
     * @return transaction_id - 银企直连支付平台产生的流水号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置银企直连支付平台产生的流水号
     *
     * @param transactionId 银企直连支付平台产生的流水号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取银行记账流水号
     *
     * @return trans_seq - 银行记账流水号
     */
    public String getTransSeq() {
        return transSeq;
    }

    /**
     * 设置银行记账流水号
     *
     * @param transSeq 银行记账流水号
     */
    public void setTransSeq(String transSeq) {
        this.transSeq = transSeq == null ? null : transSeq.trim();
    }

    /**
     * 获取银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     *
     * @return trans_step - 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     */
    public String getTransStep() {
        return transStep;
    }

    /**
     * 设置银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     *
     * @param transStep 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     */
    public void setTransStep(String transStep) {
        this.transStep = transStep == null ? null : transStep.trim();
    }

    /**
     * 获取订单支付提交流水号
     *
     * @return trans_order_seq - 订单支付提交流水号
     */
    public Integer getTransOrderSeq() {
        return transOrderSeq;
    }

    /**
     * 设置订单支付提交流水号
     *
     * @param transOrderSeq 订单支付提交流水号
     */
    public void setTransOrderSeq(Integer transOrderSeq) {
        this.transOrderSeq = transOrderSeq;
    }

    /**
     * 获取签署人手机号码
     *
     * @return phone_number - 签署人手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置签署人手机号码
     *
     * @param phoneNumber 签署人手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取申请付款金额留存
     *
     * @return apply_amount - 申请付款金额留存
     */
    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    /**
     * 设置申请付款金额留存
     *
     * @param applyAmount 申请付款金额留存
     */
    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * 获取授信额度id
     *
     * @return credit_line_id - 授信额度id
     */
    public Integer getCreditLineId() {
        return creditLineId;
    }

    /**
     * 设置授信额度id
     *
     * @param creditLineId 授信额度id
     */
    public void setCreditLineId(Integer creditLineId) {
        this.creditLineId = creditLineId;
    }

    /**
     * 获取最新的额度id
     *
     * @return latest_credit_line_id - 最新的额度id
     */
    public Integer getLatestCreditLineId() {
        return latestCreditLineId;
    }

    /**
     * 设置最新的额度id
     *
     * @param latestCreditLineId 最新的额度id
     */
    public void setLatestCreditLineId(Integer latestCreditLineId) {
        this.latestCreditLineId = latestCreditLineId;
    }

    /**
     * 获取债权描述
     *
     * @return credit_description - 债权描述
     */
    public String getCreditDescription() {
        return creditDescription;
    }

    /**
     * 设置债权描述
     *
     * @param creditDescription 债权描述
     */
    public void setCreditDescription(String creditDescription) {
        this.creditDescription = creditDescription == null ? null : creditDescription.trim();
    }

    /**
     * 获取客户方贷款申请唯一标识
     *
     * @return client_number - 客户方贷款申请唯一标识
     */
    public String getClientNumber() {
        return clientNumber;
    }

    /**
     * 设置客户方贷款申请唯一标识
     *
     * @param clientNumber 客户方贷款申请唯一标识
     */
    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber == null ? null : clientNumber.trim();
    }

    /**
     * 获取订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     *
     * @return order_status - 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     */
    public Boolean getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     *
     * @param orderStatus 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     */
    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取客户卖方标识
     *
     * @return custom_seller_company_id - 客户卖方标识
     */
    public String getCustomSellerCompanyId() {
        return customSellerCompanyId;
    }

    /**
     * 设置客户卖方标识
     *
     * @param customSellerCompanyId 客户卖方标识
     */
    public void setCustomSellerCompanyId(String customSellerCompanyId) {
        this.customSellerCompanyId = customSellerCompanyId == null ? null : customSellerCompanyId.trim();
    }

    /**
     * 获取人工审批原因
     *
     * @return manual_audit_reason - 人工审批原因
     */
    public String getManualAuditReason() {
        return manualAuditReason;
    }

    /**
     * 设置人工审批原因
     *
     * @param manualAuditReason 人工审批原因
     */
    public void setManualAuditReason(String manualAuditReason) {
        this.manualAuditReason = manualAuditReason == null ? null : manualAuditReason.trim();
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
     * @return contract_sign_url
     */
    public String getContractSignUrl() {
        return contractSignUrl;
    }

    /**
     * @param contractSignUrl
     */
    public void setContractSignUrl(String contractSignUrl) {
        this.contractSignUrl = contractSignUrl == null ? null : contractSignUrl.trim();
    }

    /**
     * 获取打款银行科目编码
     *
     * @return pay_bank_ANI - 打款银行科目编码
     */
    public String getPayBankAni() {
        return payBankAni;
    }

    /**
     * 设置打款银行科目编码
     *
     * @param payBankAni 打款银行科目编码
     */
    public void setPayBankAni(String payBankAni) {
        this.payBankAni = payBankAni == null ? null : payBankAni.trim();
    }

    /**
     * 获取手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     *
     * @return fee_rollback_status - 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     */
    public Boolean getFeeRollbackStatus() {
        return feeRollbackStatus;
    }

    /**
     * 设置手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     *
     * @param feeRollbackStatus 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     */
    public void setFeeRollbackStatus(Boolean feeRollbackStatus) {
        this.feeRollbackStatus = feeRollbackStatus;
    }

    /**
     * 获取手续费回滚审核时间
     *
     * @return fee_rollback_time - 手续费回滚审核时间
     */
    public Integer getFeeRollbackTime() {
        return feeRollbackTime;
    }

    /**
     * 设置手续费回滚审核时间
     *
     * @param feeRollbackTime 手续费回滚审核时间
     */
    public void setFeeRollbackTime(Integer feeRollbackTime) {
        this.feeRollbackTime = feeRollbackTime;
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