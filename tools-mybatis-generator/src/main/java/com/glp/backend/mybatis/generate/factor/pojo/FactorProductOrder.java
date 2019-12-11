package com.glp.backend.mybatis.generate.factor.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.List;

public class FactorProductOrder extends BaseEntity {
    /**
     * 
     * 表字段 : factor_product_order.id
     */
    private Integer id;

    /**
     * 开通的产品关联ID
     * 表字段 : factor_product_order.product_list_id
     */
    private Integer productListId;

    /**
     * 项目id
     * 表字段 : factor_product_order.project_id
     */
    private Integer projectId;

    /**
     * 授信企业id
     * 表字段 : factor_product_order.credit_company_id
     */
    private Integer creditCompanyId;

    /**
     * 订单来源/1客户经理/2客户
     * 表字段 : factor_product_order.source
     */
    private Byte source;

    /**
     * 订单号
     * 表字段 : factor_product_order.order_number
     */
    private String orderNumber;

    /**
     * 买方组织ID
     * 表字段 : factor_product_order.buyer_organization_id
     */
    private Integer buyerOrganizationId;

    /**
     * 买方企业ID
     * 表字段 : factor_product_order.buyer_company_id
     */
    private Integer buyerCompanyId;

    /**
     * 卖方组织ID
     * 表字段 : factor_product_order.seller_organization_id
     */
    private Integer sellerOrganizationId;

    /**
     * 卖方企业ID
     * 表字段 : factor_product_order.seller_company_id
     */
    private Integer sellerCompanyId;

    /**
     * 第一步确权金额
     * 表字段 : factor_product_order.buyer_apply_amount
     */
    private BigDecimal buyerApplyAmount;

    /**
     * 第二步卖方审核金额
     * 表字段 : factor_product_order.seller_apply_amount
     */
    private BigDecimal sellerApplyAmount;

    /**
     * 申请时间
     * 表字段 : factor_product_order.seller_apply_amount_time
     */
    private Integer sellerApplyAmountTime;

    /**
     * 第三方组织id
     * 表字段 : factor_product_order.third_organization_id
     */
    private Integer thirdOrganizationId;

    /**
     * 第三方公司id
     * 表字段 : factor_product_order.third_company_id
     */
    private Integer thirdCompanyId;

    /**
     * 保理金额
     * 表字段 : factor_product_order.amount
     */
    private BigDecimal amount;

    /**
     * 产品类型名
     * 表字段 : factor_product_order.product_type_name
     */
    private String productTypeName;

    /**
     * 利率
     * 表字段 : factor_product_order.rate
     */
    private BigDecimal rate;

    /**
     * 期限
     * 表字段 : factor_product_order.due_time
     */
    private Integer dueTime;

    /**
     * 0无服务费/1有服务费
     * 表字段 : factor_product_order.is_service
     */
    private Byte isService;

    /**
     * 服务费金额
     * 表字段 : factor_product_order.sevice_amount
     */
    private BigDecimal seviceAmount;

    /**
     * 服务费核销状态 0 不用核销 1 待核销  2已核销
     * 表字段 : factor_product_order.is_service_verification
     */
    private Byte isServiceVerification;

    /**
     * 手续费核销人id
     * 表字段 : factor_product_order.service_verification_user_id
     */
    private Integer serviceVerificationUserId;

    /**
     * 手续费核销时间
     * 表字段 : factor_product_order.service_verification_time
     */
    private Integer serviceVerificationTime;

    /**
     * 还款银行
     * 表字段 : factor_product_order.repayment_bank_name
     */
    private String repaymentBankName;

    /**
     * 还款开户分行
     * 表字段 : factor_product_order.repayment_back_filiale
     */
    private String repaymentBackFiliale;

    /**
     * 还款开户名
     * 表字段 : factor_product_order.repayment_back_username
     */
    private String repaymentBackUsername;

    /**
     * 还款银行账号
     * 表字段 : factor_product_order.repayment_bank_number
     */
    private String repaymentBankNumber;

    /**
     * 收款银行
     * 表字段 : factor_product_order.receipt_bank_name
     */
    private String receiptBankName;

    /**
     * 收款银行编号
     * 表字段 : factor_product_order.receipt_bank_code
     */
    private String receiptBankCode;

    /**
     * 收款开户支行
     * 表字段 : factor_product_order.receipt_bank_filiale
     */
    private String receiptBankFiliale;

    /**
     * 收款银行支行号
     * 表字段 : factor_product_order.receipt_bank_filiale_branchNo
     */
    private String receiptBankFilialeBranchno;

    /**
     * 收款银行省份
     * 表字段 : factor_product_order.receipt_bank_provName
     */
    private String receiptBankProvname;

    /**
     * 收款银行城市
     * 表字段 : factor_product_order.receipt_bank_cityName
     */
    private String receiptBankCityname;

    /**
     * 收款开户名
     * 表字段 : factor_product_order.receipt_bank_username
     */
    private String receiptBankUsername;

    /**
     * 收款银行账号
     * 表字段 : factor_product_order.receipt_bank_number
     */
    private String receiptBankNumber;

    /**
     * 1线上打款,2线下打款
     * 表字段 : factor_product_order.pay_type
     */
    private Byte payType;

    /**
     * 打款银行
     * 表字段 : factor_product_order.pay_bank_name
     */
    private String payBankName;

    /**
     * 打款银行支行
     * 表字段 : factor_product_order.pay_bank_filiale
     */
    private String payBankFiliale;

    /**
     * 银行实体账号
     * 表字段 : factor_product_order.pay_bank_real_number
     */
    private String payBankRealNumber;

    /**
     * 银行请求参数
     * 表字段 : factor_product_order.pay_bank_extension
     */
    private String payBankExtension;

    /**
     * 打款账户
     * 表字段 : factor_product_order.pay_bank_username
     */
    private String payBankUsername;

    /**
     * 打款支出协议账号
     * 表字段 : factor_product_order.pay_bank_number
     */
    private String payBankNumber;

    /**
     * 维金支付订单号
     * 表字段 : factor_product_order.pay_order_number
     */
    private String payOrderNumber;

    /**
     * 支付失败原因
     * 表字段 : factor_product_order.pay_notes
     */
    private String payNotes;

    /**
     * 0未打款/1打款中/2打款完成/3打款失败
     * 表字段 : factor_product_order.pay_status
     */
    private Byte payStatus;

    /**
     * 质押单号
     * 表字段 : factor_product_order.pledge_number
     */
    private String pledgeNumber;

    /**
     * 预计放款时间
     * 表字段 : factor_product_order.estimate_pay_time
     */
    private Integer estimatePayTime;

    /**
     * 打款成功时间
     * 表字段 : factor_product_order.pay_success_time
     */
    private Integer paySuccessTime;

    /**
     * 支付回调时间
     * 表字段 : factor_product_order.pay_notice_time
     */
    private Integer payNoticeTime;

    /**
     * 用户第三方回调地址
     * 表字段 : factor_product_order.callback_url
     */
    private String callbackUrl;

    /**
     * 账单账款明细推送地址
     * 表字段 : factor_product_order.account_bill_notice_url
     */
    private String accountBillNoticeUrl;

    /**
     * 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     * 表字段 : factor_product_order.status
     */
    private Byte status;

    /**
     * 审核状态,0默认，1通过，2不通过
     * 表字段 : factor_product_order.audit_status
     */
    private Byte auditStatus;

    /**
     * 流程是否关闭，默认0开启，1关闭
     * 表字段 : factor_product_order.is_close
     */
    private Byte isClose;

    /**
     * 
     * 表字段 : factor_product_order.create_time
     */
    private Integer createTime;

    /**
     * 
     * 表字段 : factor_product_order.update_time
     */
    private Integer updateTime;

    /**
     * 违约期利率
     * 表字段 : factor_product_order.break_rate
     */
    private BigDecimal breakRate;

    /**
     * 是否有宽限期
     * 表字段 : factor_product_order.is_grace_period
     */
    private Boolean isGracePeriod;

    /**
     * 宽限期
     * 表字段 : factor_product_order.grace_period
     */
    private Integer gracePeriod;

    /**
     * 宽限期利率
     * 表字段 : factor_product_order.grace_period_rate
     */
    private BigDecimal gracePeriodRate;

    /**
     * 复利利率
     * 表字段 : factor_product_order.compound_rate
     */
    private BigDecimal compoundRate;

    /**
     * 
     * 表字段 : factor_product_order.repeat_repayment_instance_name
     */
    private String repeatRepaymentInstanceName;

    /**
     * 
     * 表字段 : factor_product_order.repeat_repayment_instance_number
     */
    private String repeatRepaymentInstanceNumber;

    /**
     * 
     * 表字段 : factor_product_order.repeat_repayment_bank_extension
     */
    private String repeatRepaymentBankExtension;

    /**
     * 
     * 表字段 : factor_product_order.repeat_repayment_bank_name
     */
    private String repeatRepaymentBankName;

    /**
     * 
     * 表字段 : factor_product_order.repeat_repayment_back_filiale
     */
    private String repeatRepaymentBackFiliale;

    /**
     * 
     * 表字段 : factor_product_order.repeat_repayment_back_username
     */
    private String repeatRepaymentBackUsername;

    /**
     * 
     * 表字段 : factor_product_order.repeat_repayment_bank_number
     */
    private String repeatRepaymentBankNumber;

    /**
     * 还款方式 1 期限还款 2日期还款
     * 表字段 : factor_product_order.payment_method
     */
    private Boolean paymentMethod;

    /**
     * 
     * 表字段 : factor_product_order.repayment_time
     */
    private Integer repaymentTime;

    /**
     * 起息日
     * 表字段 : factor_product_order.interest_time
     */
    private Integer interestTime;

    /**
     * 银企直连支付平台产生的流水号
     * 表字段 : factor_product_order.transaction_id
     */
    private String transactionId;

    /**
     * 银行记账流水号
     * 表字段 : factor_product_order.trans_seq
     */
    private String transSeq;

    /**
     * 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     * 表字段 : factor_product_order.trans_step
     */
    private String transStep;

    /**
     * 订单支付提交流水号
     * 表字段 : factor_product_order.trans_order_seq
     */
    private Integer transOrderSeq;

    /**
     * 签署人手机号码
     * 表字段 : factor_product_order.phone_number
     */
    private String phoneNumber;

    /**
     * 申请付款金额留存
     * 表字段 : factor_product_order.apply_amount
     */
    private BigDecimal applyAmount;

    /**
     * 授信额度id
     * 表字段 : factor_product_order.credit_line_id
     */
    private Integer creditLineId;

    /**
     * 最新的额度id
     * 表字段 : factor_product_order.latest_credit_line_id
     */
    private Integer latestCreditLineId;

    /**
     * 债权描述
     * 表字段 : factor_product_order.credit_description
     */
    private String creditDescription;

    /**
     * 客户方贷款申请唯一标识
     * 表字段 : factor_product_order.client_number
     */
    private String clientNumber;

    /**
     * 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     * 表字段 : factor_product_order.order_status
     */
    private Boolean orderStatus;

    /**
     * 客户卖方标识
     * 表字段 : factor_product_order.custom_seller_company_id
     */
    private String customSellerCompanyId;

    /**
     * 人工审批原因
     * 表字段 : factor_product_order.manual_audit_reason
     */
    private String manualAuditReason;

    /**
     * 多买方公司ID
     * 表字段 : factor_product_order.buyer_company_ids
     */
    private String buyerCompanyIds;

    /**
     * 
     * 表字段 : factor_product_order.contract_sign_url
     */
    private String contractSignUrl;

    /**
     * 打款银行科目编码
     * 表字段 : factor_product_order.pay_bank_ANI
     */
    private String payBankAni;

    /**
     * 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     * 表字段 : factor_product_order.fee_rollback_status
     */
    private Boolean feeRollbackStatus;

    /**
     * 手续费回滚审核时间
     * 表字段 : factor_product_order.fee_rollback_time
     */
    private Integer feeRollbackTime;

    /**
     * 多买方公司名称
     * 表字段 : factor_product_order.buyer_company_names
     */
    private String buyerCompanyNames;

    private List<FactorBill> factorBills;

    /**
     * 获取  字段:factor_product_order.id
     *
     * @return factor_product_order.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:factor_product_order.id
     *
     * @param id the value for factor_product_order.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 开通的产品关联ID 字段:factor_product_order.product_list_id
     *
     * @return factor_product_order.product_list_id, 开通的产品关联ID
     */
    public Integer getProductListId() {
        return productListId;
    }

    /**
     * 设置 开通的产品关联ID 字段:factor_product_order.product_list_id
     *
     * @param productListId the value for factor_product_order.product_list_id, 开通的产品关联ID
     */
    public void setProductListId(Integer productListId) {
        this.productListId = productListId;
    }

    /**
     * 获取 项目id 字段:factor_product_order.project_id
     *
     * @return factor_product_order.project_id, 项目id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 设置 项目id 字段:factor_product_order.project_id
     *
     * @param projectId the value for factor_product_order.project_id, 项目id
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取 授信企业id 字段:factor_product_order.credit_company_id
     *
     * @return factor_product_order.credit_company_id, 授信企业id
     */
    public Integer getCreditCompanyId() {
        return creditCompanyId;
    }

    /**
     * 设置 授信企业id 字段:factor_product_order.credit_company_id
     *
     * @param creditCompanyId the value for factor_product_order.credit_company_id, 授信企业id
     */
    public void setCreditCompanyId(Integer creditCompanyId) {
        this.creditCompanyId = creditCompanyId;
    }

    /**
     * 获取 订单来源/1客户经理/2客户 字段:factor_product_order.source
     *
     * @return factor_product_order.source, 订单来源/1客户经理/2客户
     */
    public Byte getSource() {
        return source;
    }

    /**
     * 设置 订单来源/1客户经理/2客户 字段:factor_product_order.source
     *
     * @param source the value for factor_product_order.source, 订单来源/1客户经理/2客户
     */
    public void setSource(Byte source) {
        this.source = source;
    }

    /**
     * 获取 订单号 字段:factor_product_order.order_number
     *
     * @return factor_product_order.order_number, 订单号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置 订单号 字段:factor_product_order.order_number
     *
     * @param orderNumber the value for factor_product_order.order_number, 订单号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * 获取 买方组织ID 字段:factor_product_order.buyer_organization_id
     *
     * @return factor_product_order.buyer_organization_id, 买方组织ID
     */
    public Integer getBuyerOrganizationId() {
        return buyerOrganizationId;
    }

    /**
     * 设置 买方组织ID 字段:factor_product_order.buyer_organization_id
     *
     * @param buyerOrganizationId the value for factor_product_order.buyer_organization_id, 买方组织ID
     */
    public void setBuyerOrganizationId(Integer buyerOrganizationId) {
        this.buyerOrganizationId = buyerOrganizationId;
    }

    /**
     * 获取 买方企业ID 字段:factor_product_order.buyer_company_id
     *
     * @return factor_product_order.buyer_company_id, 买方企业ID
     */
    public Integer getBuyerCompanyId() {
        return buyerCompanyId;
    }

    /**
     * 设置 买方企业ID 字段:factor_product_order.buyer_company_id
     *
     * @param buyerCompanyId the value for factor_product_order.buyer_company_id, 买方企业ID
     */
    public void setBuyerCompanyId(Integer buyerCompanyId) {
        this.buyerCompanyId = buyerCompanyId;
    }

    /**
     * 获取 卖方组织ID 字段:factor_product_order.seller_organization_id
     *
     * @return factor_product_order.seller_organization_id, 卖方组织ID
     */
    public Integer getSellerOrganizationId() {
        return sellerOrganizationId;
    }

    /**
     * 设置 卖方组织ID 字段:factor_product_order.seller_organization_id
     *
     * @param sellerOrganizationId the value for factor_product_order.seller_organization_id, 卖方组织ID
     */
    public void setSellerOrganizationId(Integer sellerOrganizationId) {
        this.sellerOrganizationId = sellerOrganizationId;
    }

    /**
     * 获取 卖方企业ID 字段:factor_product_order.seller_company_id
     *
     * @return factor_product_order.seller_company_id, 卖方企业ID
     */
    public Integer getSellerCompanyId() {
        return sellerCompanyId;
    }

    /**
     * 设置 卖方企业ID 字段:factor_product_order.seller_company_id
     *
     * @param sellerCompanyId the value for factor_product_order.seller_company_id, 卖方企业ID
     */
    public void setSellerCompanyId(Integer sellerCompanyId) {
        this.sellerCompanyId = sellerCompanyId;
    }

    /**
     * 获取 第一步确权金额 字段:factor_product_order.buyer_apply_amount
     *
     * @return factor_product_order.buyer_apply_amount, 第一步确权金额
     */
    public BigDecimal getBuyerApplyAmount() {
        return buyerApplyAmount;
    }

    /**
     * 设置 第一步确权金额 字段:factor_product_order.buyer_apply_amount
     *
     * @param buyerApplyAmount the value for factor_product_order.buyer_apply_amount, 第一步确权金额
     */
    public void setBuyerApplyAmount(BigDecimal buyerApplyAmount) {
        this.buyerApplyAmount = buyerApplyAmount;
    }

    /**
     * 获取 第二步卖方审核金额 字段:factor_product_order.seller_apply_amount
     *
     * @return factor_product_order.seller_apply_amount, 第二步卖方审核金额
     */
    public BigDecimal getSellerApplyAmount() {
        return sellerApplyAmount;
    }

    /**
     * 设置 第二步卖方审核金额 字段:factor_product_order.seller_apply_amount
     *
     * @param sellerApplyAmount the value for factor_product_order.seller_apply_amount, 第二步卖方审核金额
     */
    public void setSellerApplyAmount(BigDecimal sellerApplyAmount) {
        this.sellerApplyAmount = sellerApplyAmount;
    }

    /**
     * 获取 申请时间 字段:factor_product_order.seller_apply_amount_time
     *
     * @return factor_product_order.seller_apply_amount_time, 申请时间
     */
    public Integer getSellerApplyAmountTime() {
        return sellerApplyAmountTime;
    }

    /**
     * 设置 申请时间 字段:factor_product_order.seller_apply_amount_time
     *
     * @param sellerApplyAmountTime the value for factor_product_order.seller_apply_amount_time, 申请时间
     */
    public void setSellerApplyAmountTime(Integer sellerApplyAmountTime) {
        this.sellerApplyAmountTime = sellerApplyAmountTime;
    }

    /**
     * 获取 第三方组织id 字段:factor_product_order.third_organization_id
     *
     * @return factor_product_order.third_organization_id, 第三方组织id
     */
    public Integer getThirdOrganizationId() {
        return thirdOrganizationId;
    }

    /**
     * 设置 第三方组织id 字段:factor_product_order.third_organization_id
     *
     * @param thirdOrganizationId the value for factor_product_order.third_organization_id, 第三方组织id
     */
    public void setThirdOrganizationId(Integer thirdOrganizationId) {
        this.thirdOrganizationId = thirdOrganizationId;
    }

    /**
     * 获取 第三方公司id 字段:factor_product_order.third_company_id
     *
     * @return factor_product_order.third_company_id, 第三方公司id
     */
    public Integer getThirdCompanyId() {
        return thirdCompanyId;
    }

    /**
     * 设置 第三方公司id 字段:factor_product_order.third_company_id
     *
     * @param thirdCompanyId the value for factor_product_order.third_company_id, 第三方公司id
     */
    public void setThirdCompanyId(Integer thirdCompanyId) {
        this.thirdCompanyId = thirdCompanyId;
    }

    /**
     * 获取 保理金额 字段:factor_product_order.amount
     *
     * @return factor_product_order.amount, 保理金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置 保理金额 字段:factor_product_order.amount
     *
     * @param amount the value for factor_product_order.amount, 保理金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取 产品类型名 字段:factor_product_order.product_type_name
     *
     * @return factor_product_order.product_type_name, 产品类型名
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * 设置 产品类型名 字段:factor_product_order.product_type_name
     *
     * @param productTypeName the value for factor_product_order.product_type_name, 产品类型名
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
    }

    /**
     * 获取 利率 字段:factor_product_order.rate
     *
     * @return factor_product_order.rate, 利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置 利率 字段:factor_product_order.rate
     *
     * @param rate the value for factor_product_order.rate, 利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取 期限 字段:factor_product_order.due_time
     *
     * @return factor_product_order.due_time, 期限
     */
    public Integer getDueTime() {
        return dueTime;
    }

    /**
     * 设置 期限 字段:factor_product_order.due_time
     *
     * @param dueTime the value for factor_product_order.due_time, 期限
     */
    public void setDueTime(Integer dueTime) {
        this.dueTime = dueTime;
    }

    /**
     * 获取 0无服务费/1有服务费 字段:factor_product_order.is_service
     *
     * @return factor_product_order.is_service, 0无服务费/1有服务费
     */
    public Byte getIsService() {
        return isService;
    }

    /**
     * 设置 0无服务费/1有服务费 字段:factor_product_order.is_service
     *
     * @param isService the value for factor_product_order.is_service, 0无服务费/1有服务费
     */
    public void setIsService(Byte isService) {
        this.isService = isService;
    }

    /**
     * 获取 服务费金额 字段:factor_product_order.sevice_amount
     *
     * @return factor_product_order.sevice_amount, 服务费金额
     */
    public BigDecimal getSeviceAmount() {
        return seviceAmount;
    }

    /**
     * 设置 服务费金额 字段:factor_product_order.sevice_amount
     *
     * @param seviceAmount the value for factor_product_order.sevice_amount, 服务费金额
     */
    public void setSeviceAmount(BigDecimal seviceAmount) {
        this.seviceAmount = seviceAmount;
    }

    /**
     * 获取 服务费核销状态 0 不用核销 1 待核销  2已核销 字段:factor_product_order.is_service_verification
     *
     * @return factor_product_order.is_service_verification, 服务费核销状态 0 不用核销 1 待核销  2已核销
     */
    public Byte getIsServiceVerification() {
        return isServiceVerification;
    }

    /**
     * 设置 服务费核销状态 0 不用核销 1 待核销  2已核销 字段:factor_product_order.is_service_verification
     *
     * @param isServiceVerification the value for factor_product_order.is_service_verification, 服务费核销状态 0 不用核销 1 待核销  2已核销
     */
    public void setIsServiceVerification(Byte isServiceVerification) {
        this.isServiceVerification = isServiceVerification;
    }

    /**
     * 获取 手续费核销人id 字段:factor_product_order.service_verification_user_id
     *
     * @return factor_product_order.service_verification_user_id, 手续费核销人id
     */
    public Integer getServiceVerificationUserId() {
        return serviceVerificationUserId;
    }

    /**
     * 设置 手续费核销人id 字段:factor_product_order.service_verification_user_id
     *
     * @param serviceVerificationUserId the value for factor_product_order.service_verification_user_id, 手续费核销人id
     */
    public void setServiceVerificationUserId(Integer serviceVerificationUserId) {
        this.serviceVerificationUserId = serviceVerificationUserId;
    }

    /**
     * 获取 手续费核销时间 字段:factor_product_order.service_verification_time
     *
     * @return factor_product_order.service_verification_time, 手续费核销时间
     */
    public Integer getServiceVerificationTime() {
        return serviceVerificationTime;
    }

    /**
     * 设置 手续费核销时间 字段:factor_product_order.service_verification_time
     *
     * @param serviceVerificationTime the value for factor_product_order.service_verification_time, 手续费核销时间
     */
    public void setServiceVerificationTime(Integer serviceVerificationTime) {
        this.serviceVerificationTime = serviceVerificationTime;
    }

    /**
     * 获取 还款银行 字段:factor_product_order.repayment_bank_name
     *
     * @return factor_product_order.repayment_bank_name, 还款银行
     */
    public String getRepaymentBankName() {
        return repaymentBankName;
    }

    /**
     * 设置 还款银行 字段:factor_product_order.repayment_bank_name
     *
     * @param repaymentBankName the value for factor_product_order.repayment_bank_name, 还款银行
     */
    public void setRepaymentBankName(String repaymentBankName) {
        this.repaymentBankName = repaymentBankName == null ? null : repaymentBankName.trim();
    }

    /**
     * 获取 还款开户分行 字段:factor_product_order.repayment_back_filiale
     *
     * @return factor_product_order.repayment_back_filiale, 还款开户分行
     */
    public String getRepaymentBackFiliale() {
        return repaymentBackFiliale;
    }

    /**
     * 设置 还款开户分行 字段:factor_product_order.repayment_back_filiale
     *
     * @param repaymentBackFiliale the value for factor_product_order.repayment_back_filiale, 还款开户分行
     */
    public void setRepaymentBackFiliale(String repaymentBackFiliale) {
        this.repaymentBackFiliale = repaymentBackFiliale == null ? null : repaymentBackFiliale.trim();
    }

    /**
     * 获取 还款开户名 字段:factor_product_order.repayment_back_username
     *
     * @return factor_product_order.repayment_back_username, 还款开户名
     */
    public String getRepaymentBackUsername() {
        return repaymentBackUsername;
    }

    /**
     * 设置 还款开户名 字段:factor_product_order.repayment_back_username
     *
     * @param repaymentBackUsername the value for factor_product_order.repayment_back_username, 还款开户名
     */
    public void setRepaymentBackUsername(String repaymentBackUsername) {
        this.repaymentBackUsername = repaymentBackUsername == null ? null : repaymentBackUsername.trim();
    }

    /**
     * 获取 还款银行账号 字段:factor_product_order.repayment_bank_number
     *
     * @return factor_product_order.repayment_bank_number, 还款银行账号
     */
    public String getRepaymentBankNumber() {
        return repaymentBankNumber;
    }

    /**
     * 设置 还款银行账号 字段:factor_product_order.repayment_bank_number
     *
     * @param repaymentBankNumber the value for factor_product_order.repayment_bank_number, 还款银行账号
     */
    public void setRepaymentBankNumber(String repaymentBankNumber) {
        this.repaymentBankNumber = repaymentBankNumber == null ? null : repaymentBankNumber.trim();
    }

    /**
     * 获取 收款银行 字段:factor_product_order.receipt_bank_name
     *
     * @return factor_product_order.receipt_bank_name, 收款银行
     */
    public String getReceiptBankName() {
        return receiptBankName;
    }

    /**
     * 设置 收款银行 字段:factor_product_order.receipt_bank_name
     *
     * @param receiptBankName the value for factor_product_order.receipt_bank_name, 收款银行
     */
    public void setReceiptBankName(String receiptBankName) {
        this.receiptBankName = receiptBankName == null ? null : receiptBankName.trim();
    }

    /**
     * 获取 收款银行编号 字段:factor_product_order.receipt_bank_code
     *
     * @return factor_product_order.receipt_bank_code, 收款银行编号
     */
    public String getReceiptBankCode() {
        return receiptBankCode;
    }

    /**
     * 设置 收款银行编号 字段:factor_product_order.receipt_bank_code
     *
     * @param receiptBankCode the value for factor_product_order.receipt_bank_code, 收款银行编号
     */
    public void setReceiptBankCode(String receiptBankCode) {
        this.receiptBankCode = receiptBankCode == null ? null : receiptBankCode.trim();
    }

    /**
     * 获取 收款开户支行 字段:factor_product_order.receipt_bank_filiale
     *
     * @return factor_product_order.receipt_bank_filiale, 收款开户支行
     */
    public String getReceiptBankFiliale() {
        return receiptBankFiliale;
    }

    /**
     * 设置 收款开户支行 字段:factor_product_order.receipt_bank_filiale
     *
     * @param receiptBankFiliale the value for factor_product_order.receipt_bank_filiale, 收款开户支行
     */
    public void setReceiptBankFiliale(String receiptBankFiliale) {
        this.receiptBankFiliale = receiptBankFiliale == null ? null : receiptBankFiliale.trim();
    }

    /**
     * 获取 收款银行支行号 字段:factor_product_order.receipt_bank_filiale_branchNo
     *
     * @return factor_product_order.receipt_bank_filiale_branchNo, 收款银行支行号
     */
    public String getReceiptBankFilialeBranchno() {
        return receiptBankFilialeBranchno;
    }

    /**
     * 设置 收款银行支行号 字段:factor_product_order.receipt_bank_filiale_branchNo
     *
     * @param receiptBankFilialeBranchno the value for factor_product_order.receipt_bank_filiale_branchNo, 收款银行支行号
     */
    public void setReceiptBankFilialeBranchno(String receiptBankFilialeBranchno) {
        this.receiptBankFilialeBranchno = receiptBankFilialeBranchno == null ? null : receiptBankFilialeBranchno.trim();
    }

    /**
     * 获取 收款银行省份 字段:factor_product_order.receipt_bank_provName
     *
     * @return factor_product_order.receipt_bank_provName, 收款银行省份
     */
    public String getReceiptBankProvname() {
        return receiptBankProvname;
    }

    /**
     * 设置 收款银行省份 字段:factor_product_order.receipt_bank_provName
     *
     * @param receiptBankProvname the value for factor_product_order.receipt_bank_provName, 收款银行省份
     */
    public void setReceiptBankProvname(String receiptBankProvname) {
        this.receiptBankProvname = receiptBankProvname == null ? null : receiptBankProvname.trim();
    }

    /**
     * 获取 收款银行城市 字段:factor_product_order.receipt_bank_cityName
     *
     * @return factor_product_order.receipt_bank_cityName, 收款银行城市
     */
    public String getReceiptBankCityname() {
        return receiptBankCityname;
    }

    /**
     * 设置 收款银行城市 字段:factor_product_order.receipt_bank_cityName
     *
     * @param receiptBankCityname the value for factor_product_order.receipt_bank_cityName, 收款银行城市
     */
    public void setReceiptBankCityname(String receiptBankCityname) {
        this.receiptBankCityname = receiptBankCityname == null ? null : receiptBankCityname.trim();
    }

    /**
     * 获取 收款开户名 字段:factor_product_order.receipt_bank_username
     *
     * @return factor_product_order.receipt_bank_username, 收款开户名
     */
    public String getReceiptBankUsername() {
        return receiptBankUsername;
    }

    /**
     * 设置 收款开户名 字段:factor_product_order.receipt_bank_username
     *
     * @param receiptBankUsername the value for factor_product_order.receipt_bank_username, 收款开户名
     */
    public void setReceiptBankUsername(String receiptBankUsername) {
        this.receiptBankUsername = receiptBankUsername == null ? null : receiptBankUsername.trim();
    }

    /**
     * 获取 收款银行账号 字段:factor_product_order.receipt_bank_number
     *
     * @return factor_product_order.receipt_bank_number, 收款银行账号
     */
    public String getReceiptBankNumber() {
        return receiptBankNumber;
    }

    /**
     * 设置 收款银行账号 字段:factor_product_order.receipt_bank_number
     *
     * @param receiptBankNumber the value for factor_product_order.receipt_bank_number, 收款银行账号
     */
    public void setReceiptBankNumber(String receiptBankNumber) {
        this.receiptBankNumber = receiptBankNumber == null ? null : receiptBankNumber.trim();
    }

    /**
     * 获取 1线上打款,2线下打款 字段:factor_product_order.pay_type
     *
     * @return factor_product_order.pay_type, 1线上打款,2线下打款
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * 设置 1线上打款,2线下打款 字段:factor_product_order.pay_type
     *
     * @param payType the value for factor_product_order.pay_type, 1线上打款,2线下打款
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * 获取 打款银行 字段:factor_product_order.pay_bank_name
     *
     * @return factor_product_order.pay_bank_name, 打款银行
     */
    public String getPayBankName() {
        return payBankName;
    }

    /**
     * 设置 打款银行 字段:factor_product_order.pay_bank_name
     *
     * @param payBankName the value for factor_product_order.pay_bank_name, 打款银行
     */
    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName == null ? null : payBankName.trim();
    }

    /**
     * 获取 打款银行支行 字段:factor_product_order.pay_bank_filiale
     *
     * @return factor_product_order.pay_bank_filiale, 打款银行支行
     */
    public String getPayBankFiliale() {
        return payBankFiliale;
    }

    /**
     * 设置 打款银行支行 字段:factor_product_order.pay_bank_filiale
     *
     * @param payBankFiliale the value for factor_product_order.pay_bank_filiale, 打款银行支行
     */
    public void setPayBankFiliale(String payBankFiliale) {
        this.payBankFiliale = payBankFiliale == null ? null : payBankFiliale.trim();
    }

    /**
     * 获取 银行实体账号 字段:factor_product_order.pay_bank_real_number
     *
     * @return factor_product_order.pay_bank_real_number, 银行实体账号
     */
    public String getPayBankRealNumber() {
        return payBankRealNumber;
    }

    /**
     * 设置 银行实体账号 字段:factor_product_order.pay_bank_real_number
     *
     * @param payBankRealNumber the value for factor_product_order.pay_bank_real_number, 银行实体账号
     */
    public void setPayBankRealNumber(String payBankRealNumber) {
        this.payBankRealNumber = payBankRealNumber == null ? null : payBankRealNumber.trim();
    }

    /**
     * 获取 银行请求参数 字段:factor_product_order.pay_bank_extension
     *
     * @return factor_product_order.pay_bank_extension, 银行请求参数
     */
    public String getPayBankExtension() {
        return payBankExtension;
    }

    /**
     * 设置 银行请求参数 字段:factor_product_order.pay_bank_extension
     *
     * @param payBankExtension the value for factor_product_order.pay_bank_extension, 银行请求参数
     */
    public void setPayBankExtension(String payBankExtension) {
        this.payBankExtension = payBankExtension == null ? null : payBankExtension.trim();
    }

    /**
     * 获取 打款账户 字段:factor_product_order.pay_bank_username
     *
     * @return factor_product_order.pay_bank_username, 打款账户
     */
    public String getPayBankUsername() {
        return payBankUsername;
    }

    /**
     * 设置 打款账户 字段:factor_product_order.pay_bank_username
     *
     * @param payBankUsername the value for factor_product_order.pay_bank_username, 打款账户
     */
    public void setPayBankUsername(String payBankUsername) {
        this.payBankUsername = payBankUsername == null ? null : payBankUsername.trim();
    }

    /**
     * 获取 打款支出协议账号 字段:factor_product_order.pay_bank_number
     *
     * @return factor_product_order.pay_bank_number, 打款支出协议账号
     */
    public String getPayBankNumber() {
        return payBankNumber;
    }

    /**
     * 设置 打款支出协议账号 字段:factor_product_order.pay_bank_number
     *
     * @param payBankNumber the value for factor_product_order.pay_bank_number, 打款支出协议账号
     */
    public void setPayBankNumber(String payBankNumber) {
        this.payBankNumber = payBankNumber == null ? null : payBankNumber.trim();
    }

    /**
     * 获取 维金支付订单号 字段:factor_product_order.pay_order_number
     *
     * @return factor_product_order.pay_order_number, 维金支付订单号
     */
    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    /**
     * 设置 维金支付订单号 字段:factor_product_order.pay_order_number
     *
     * @param payOrderNumber the value for factor_product_order.pay_order_number, 维金支付订单号
     */
    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber == null ? null : payOrderNumber.trim();
    }

    /**
     * 获取 支付失败原因 字段:factor_product_order.pay_notes
     *
     * @return factor_product_order.pay_notes, 支付失败原因
     */
    public String getPayNotes() {
        return payNotes;
    }

    /**
     * 设置 支付失败原因 字段:factor_product_order.pay_notes
     *
     * @param payNotes the value for factor_product_order.pay_notes, 支付失败原因
     */
    public void setPayNotes(String payNotes) {
        this.payNotes = payNotes == null ? null : payNotes.trim();
    }

    /**
     * 获取 0未打款/1打款中/2打款完成/3打款失败 字段:factor_product_order.pay_status
     *
     * @return factor_product_order.pay_status, 0未打款/1打款中/2打款完成/3打款失败
     */
    public Byte getPayStatus() {
        return payStatus;
    }

    /**
     * 设置 0未打款/1打款中/2打款完成/3打款失败 字段:factor_product_order.pay_status
     *
     * @param payStatus the value for factor_product_order.pay_status, 0未打款/1打款中/2打款完成/3打款失败
     */
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取 质押单号 字段:factor_product_order.pledge_number
     *
     * @return factor_product_order.pledge_number, 质押单号
     */
    public String getPledgeNumber() {
        return pledgeNumber;
    }

    /**
     * 设置 质押单号 字段:factor_product_order.pledge_number
     *
     * @param pledgeNumber the value for factor_product_order.pledge_number, 质押单号
     */
    public void setPledgeNumber(String pledgeNumber) {
        this.pledgeNumber = pledgeNumber == null ? null : pledgeNumber.trim();
    }

    /**
     * 获取 预计放款时间 字段:factor_product_order.estimate_pay_time
     *
     * @return factor_product_order.estimate_pay_time, 预计放款时间
     */
    public Integer getEstimatePayTime() {
        return estimatePayTime;
    }

    /**
     * 设置 预计放款时间 字段:factor_product_order.estimate_pay_time
     *
     * @param estimatePayTime the value for factor_product_order.estimate_pay_time, 预计放款时间
     */
    public void setEstimatePayTime(Integer estimatePayTime) {
        this.estimatePayTime = estimatePayTime;
    }

    /**
     * 获取 打款成功时间 字段:factor_product_order.pay_success_time
     *
     * @return factor_product_order.pay_success_time, 打款成功时间
     */
    public Integer getPaySuccessTime() {
        return paySuccessTime;
    }

    /**
     * 设置 打款成功时间 字段:factor_product_order.pay_success_time
     *
     * @param paySuccessTime the value for factor_product_order.pay_success_time, 打款成功时间
     */
    public void setPaySuccessTime(Integer paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    /**
     * 获取 支付回调时间 字段:factor_product_order.pay_notice_time
     *
     * @return factor_product_order.pay_notice_time, 支付回调时间
     */
    public Integer getPayNoticeTime() {
        return payNoticeTime;
    }

    /**
     * 设置 支付回调时间 字段:factor_product_order.pay_notice_time
     *
     * @param payNoticeTime the value for factor_product_order.pay_notice_time, 支付回调时间
     */
    public void setPayNoticeTime(Integer payNoticeTime) {
        this.payNoticeTime = payNoticeTime;
    }

    /**
     * 获取 用户第三方回调地址 字段:factor_product_order.callback_url
     *
     * @return factor_product_order.callback_url, 用户第三方回调地址
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * 设置 用户第三方回调地址 字段:factor_product_order.callback_url
     *
     * @param callbackUrl the value for factor_product_order.callback_url, 用户第三方回调地址
     */
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
    }

    /**
     * 获取 账单账款明细推送地址 字段:factor_product_order.account_bill_notice_url
     *
     * @return factor_product_order.account_bill_notice_url, 账单账款明细推送地址
     */
    public String getAccountBillNoticeUrl() {
        return accountBillNoticeUrl;
    }

    /**
     * 设置 账单账款明细推送地址 字段:factor_product_order.account_bill_notice_url
     *
     * @param accountBillNoticeUrl the value for factor_product_order.account_bill_notice_url, 账单账款明细推送地址
     */
    public void setAccountBillNoticeUrl(String accountBillNoticeUrl) {
        this.accountBillNoticeUrl = accountBillNoticeUrl == null ? null : accountBillNoticeUrl.trim();
    }

    /**
     * 获取 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成 字段:factor_product_order.status
     *
     * @return factor_product_order.status, 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成 字段:factor_product_order.status
     *
     * @param status the value for factor_product_order.status, 状态,1保理确权 2保理申请 3商务审核 4运营审核 5财务制单 6财务记账 7财务审批 8财务打款 9部分还款 10还款完成
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取 审核状态,0默认，1通过，2不通过 字段:factor_product_order.audit_status
     *
     * @return factor_product_order.audit_status, 审核状态,0默认，1通过，2不通过
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置 审核状态,0默认，1通过，2不通过 字段:factor_product_order.audit_status
     *
     * @param auditStatus the value for factor_product_order.audit_status, 审核状态,0默认，1通过，2不通过
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取 流程是否关闭，默认0开启，1关闭 字段:factor_product_order.is_close
     *
     * @return factor_product_order.is_close, 流程是否关闭，默认0开启，1关闭
     */
    public Byte getIsClose() {
        return isClose;
    }

    /**
     * 设置 流程是否关闭，默认0开启，1关闭 字段:factor_product_order.is_close
     *
     * @param isClose the value for factor_product_order.is_close, 流程是否关闭，默认0开启，1关闭
     */
    public void setIsClose(Byte isClose) {
        this.isClose = isClose;
    }

    /**
     * 获取  字段:factor_product_order.create_time
     *
     * @return factor_product_order.create_time, 
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置  字段:factor_product_order.create_time
     *
     * @param createTime the value for factor_product_order.create_time, 
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:factor_product_order.update_time
     *
     * @return factor_product_order.update_time, 
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置  字段:factor_product_order.update_time
     *
     * @param updateTime the value for factor_product_order.update_time, 
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 违约期利率 字段:factor_product_order.break_rate
     *
     * @return factor_product_order.break_rate, 违约期利率
     */
    public BigDecimal getBreakRate() {
        return breakRate;
    }

    /**
     * 设置 违约期利率 字段:factor_product_order.break_rate
     *
     * @param breakRate the value for factor_product_order.break_rate, 违约期利率
     */
    public void setBreakRate(BigDecimal breakRate) {
        this.breakRate = breakRate;
    }

    /**
     * 获取 是否有宽限期 字段:factor_product_order.is_grace_period
     *
     * @return factor_product_order.is_grace_period, 是否有宽限期
     */
    public Boolean getIsGracePeriod() {
        return isGracePeriod;
    }

    /**
     * 设置 是否有宽限期 字段:factor_product_order.is_grace_period
     *
     * @param isGracePeriod the value for factor_product_order.is_grace_period, 是否有宽限期
     */
    public void setIsGracePeriod(Boolean isGracePeriod) {
        this.isGracePeriod = isGracePeriod;
    }

    /**
     * 获取 宽限期 字段:factor_product_order.grace_period
     *
     * @return factor_product_order.grace_period, 宽限期
     */
    public Integer getGracePeriod() {
        return gracePeriod;
    }

    /**
     * 设置 宽限期 字段:factor_product_order.grace_period
     *
     * @param gracePeriod the value for factor_product_order.grace_period, 宽限期
     */
    public void setGracePeriod(Integer gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    /**
     * 获取 宽限期利率 字段:factor_product_order.grace_period_rate
     *
     * @return factor_product_order.grace_period_rate, 宽限期利率
     */
    public BigDecimal getGracePeriodRate() {
        return gracePeriodRate;
    }

    /**
     * 设置 宽限期利率 字段:factor_product_order.grace_period_rate
     *
     * @param gracePeriodRate the value for factor_product_order.grace_period_rate, 宽限期利率
     */
    public void setGracePeriodRate(BigDecimal gracePeriodRate) {
        this.gracePeriodRate = gracePeriodRate;
    }

    /**
     * 获取 复利利率 字段:factor_product_order.compound_rate
     *
     * @return factor_product_order.compound_rate, 复利利率
     */
    public BigDecimal getCompoundRate() {
        return compoundRate;
    }

    /**
     * 设置 复利利率 字段:factor_product_order.compound_rate
     *
     * @param compoundRate the value for factor_product_order.compound_rate, 复利利率
     */
    public void setCompoundRate(BigDecimal compoundRate) {
        this.compoundRate = compoundRate;
    }

    /**
     * 获取  字段:factor_product_order.repeat_repayment_instance_name
     *
     * @return factor_product_order.repeat_repayment_instance_name, 
     */
    public String getRepeatRepaymentInstanceName() {
        return repeatRepaymentInstanceName;
    }

    /**
     * 设置  字段:factor_product_order.repeat_repayment_instance_name
     *
     * @param repeatRepaymentInstanceName the value for factor_product_order.repeat_repayment_instance_name, 
     */
    public void setRepeatRepaymentInstanceName(String repeatRepaymentInstanceName) {
        this.repeatRepaymentInstanceName = repeatRepaymentInstanceName == null ? null : repeatRepaymentInstanceName.trim();
    }

    /**
     * 获取  字段:factor_product_order.repeat_repayment_instance_number
     *
     * @return factor_product_order.repeat_repayment_instance_number, 
     */
    public String getRepeatRepaymentInstanceNumber() {
        return repeatRepaymentInstanceNumber;
    }

    /**
     * 设置  字段:factor_product_order.repeat_repayment_instance_number
     *
     * @param repeatRepaymentInstanceNumber the value for factor_product_order.repeat_repayment_instance_number, 
     */
    public void setRepeatRepaymentInstanceNumber(String repeatRepaymentInstanceNumber) {
        this.repeatRepaymentInstanceNumber = repeatRepaymentInstanceNumber == null ? null : repeatRepaymentInstanceNumber.trim();
    }

    /**
     * 获取  字段:factor_product_order.repeat_repayment_bank_extension
     *
     * @return factor_product_order.repeat_repayment_bank_extension, 
     */
    public String getRepeatRepaymentBankExtension() {
        return repeatRepaymentBankExtension;
    }

    /**
     * 设置  字段:factor_product_order.repeat_repayment_bank_extension
     *
     * @param repeatRepaymentBankExtension the value for factor_product_order.repeat_repayment_bank_extension, 
     */
    public void setRepeatRepaymentBankExtension(String repeatRepaymentBankExtension) {
        this.repeatRepaymentBankExtension = repeatRepaymentBankExtension == null ? null : repeatRepaymentBankExtension.trim();
    }

    /**
     * 获取  字段:factor_product_order.repeat_repayment_bank_name
     *
     * @return factor_product_order.repeat_repayment_bank_name, 
     */
    public String getRepeatRepaymentBankName() {
        return repeatRepaymentBankName;
    }

    /**
     * 设置  字段:factor_product_order.repeat_repayment_bank_name
     *
     * @param repeatRepaymentBankName the value for factor_product_order.repeat_repayment_bank_name, 
     */
    public void setRepeatRepaymentBankName(String repeatRepaymentBankName) {
        this.repeatRepaymentBankName = repeatRepaymentBankName == null ? null : repeatRepaymentBankName.trim();
    }

    /**
     * 获取  字段:factor_product_order.repeat_repayment_back_filiale
     *
     * @return factor_product_order.repeat_repayment_back_filiale, 
     */
    public String getRepeatRepaymentBackFiliale() {
        return repeatRepaymentBackFiliale;
    }

    /**
     * 设置  字段:factor_product_order.repeat_repayment_back_filiale
     *
     * @param repeatRepaymentBackFiliale the value for factor_product_order.repeat_repayment_back_filiale, 
     */
    public void setRepeatRepaymentBackFiliale(String repeatRepaymentBackFiliale) {
        this.repeatRepaymentBackFiliale = repeatRepaymentBackFiliale == null ? null : repeatRepaymentBackFiliale.trim();
    }

    /**
     * 获取  字段:factor_product_order.repeat_repayment_back_username
     *
     * @return factor_product_order.repeat_repayment_back_username, 
     */
    public String getRepeatRepaymentBackUsername() {
        return repeatRepaymentBackUsername;
    }

    /**
     * 设置  字段:factor_product_order.repeat_repayment_back_username
     *
     * @param repeatRepaymentBackUsername the value for factor_product_order.repeat_repayment_back_username, 
     */
    public void setRepeatRepaymentBackUsername(String repeatRepaymentBackUsername) {
        this.repeatRepaymentBackUsername = repeatRepaymentBackUsername == null ? null : repeatRepaymentBackUsername.trim();
    }

    /**
     * 获取  字段:factor_product_order.repeat_repayment_bank_number
     *
     * @return factor_product_order.repeat_repayment_bank_number, 
     */
    public String getRepeatRepaymentBankNumber() {
        return repeatRepaymentBankNumber;
    }

    /**
     * 设置  字段:factor_product_order.repeat_repayment_bank_number
     *
     * @param repeatRepaymentBankNumber the value for factor_product_order.repeat_repayment_bank_number, 
     */
    public void setRepeatRepaymentBankNumber(String repeatRepaymentBankNumber) {
        this.repeatRepaymentBankNumber = repeatRepaymentBankNumber == null ? null : repeatRepaymentBankNumber.trim();
    }

    /**
     * 获取 还款方式 1 期限还款 2日期还款 字段:factor_product_order.payment_method
     *
     * @return factor_product_order.payment_method, 还款方式 1 期限还款 2日期还款
     */
    public Boolean getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置 还款方式 1 期限还款 2日期还款 字段:factor_product_order.payment_method
     *
     * @param paymentMethod the value for factor_product_order.payment_method, 还款方式 1 期限还款 2日期还款
     */
    public void setPaymentMethod(Boolean paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取  字段:factor_product_order.repayment_time
     *
     * @return factor_product_order.repayment_time, 
     */
    public Integer getRepaymentTime() {
        return repaymentTime;
    }

    /**
     * 设置  字段:factor_product_order.repayment_time
     *
     * @param repaymentTime the value for factor_product_order.repayment_time, 
     */
    public void setRepaymentTime(Integer repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    /**
     * 获取 起息日 字段:factor_product_order.interest_time
     *
     * @return factor_product_order.interest_time, 起息日
     */
    public Integer getInterestTime() {
        return interestTime;
    }

    /**
     * 设置 起息日 字段:factor_product_order.interest_time
     *
     * @param interestTime the value for factor_product_order.interest_time, 起息日
     */
    public void setInterestTime(Integer interestTime) {
        this.interestTime = interestTime;
    }

    /**
     * 获取 银企直连支付平台产生的流水号 字段:factor_product_order.transaction_id
     *
     * @return factor_product_order.transaction_id, 银企直连支付平台产生的流水号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置 银企直连支付平台产生的流水号 字段:factor_product_order.transaction_id
     *
     * @param transactionId the value for factor_product_order.transaction_id, 银企直连支付平台产生的流水号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取 银行记账流水号 字段:factor_product_order.trans_seq
     *
     * @return factor_product_order.trans_seq, 银行记账流水号
     */
    public String getTransSeq() {
        return transSeq;
    }

    /**
     * 设置 银行记账流水号 字段:factor_product_order.trans_seq
     *
     * @param transSeq the value for factor_product_order.trans_seq, 银行记账流水号
     */
    public void setTransSeq(String transSeq) {
        this.transSeq = transSeq == null ? null : transSeq.trim();
    }

    /**
     * 获取 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功 字段:factor_product_order.trans_step
     *
     * @return factor_product_order.trans_step, 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     */
    public String getTransStep() {
        return transStep;
    }

    /**
     * 设置 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功 字段:factor_product_order.trans_step
     *
     * @param transStep the value for factor_product_order.trans_step, 银企直连支付阶段:0交易中/1虚转账失败/2虚转账成功/3实交易中/4实失败/5实成功
     */
    public void setTransStep(String transStep) {
        this.transStep = transStep == null ? null : transStep.trim();
    }

    /**
     * 获取 订单支付提交流水号 字段:factor_product_order.trans_order_seq
     *
     * @return factor_product_order.trans_order_seq, 订单支付提交流水号
     */
    public Integer getTransOrderSeq() {
        return transOrderSeq;
    }

    /**
     * 设置 订单支付提交流水号 字段:factor_product_order.trans_order_seq
     *
     * @param transOrderSeq the value for factor_product_order.trans_order_seq, 订单支付提交流水号
     */
    public void setTransOrderSeq(Integer transOrderSeq) {
        this.transOrderSeq = transOrderSeq;
    }

    /**
     * 获取 签署人手机号码 字段:factor_product_order.phone_number
     *
     * @return factor_product_order.phone_number, 签署人手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置 签署人手机号码 字段:factor_product_order.phone_number
     *
     * @param phoneNumber the value for factor_product_order.phone_number, 签署人手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取 申请付款金额留存 字段:factor_product_order.apply_amount
     *
     * @return factor_product_order.apply_amount, 申请付款金额留存
     */
    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    /**
     * 设置 申请付款金额留存 字段:factor_product_order.apply_amount
     *
     * @param applyAmount the value for factor_product_order.apply_amount, 申请付款金额留存
     */
    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * 获取 授信额度id 字段:factor_product_order.credit_line_id
     *
     * @return factor_product_order.credit_line_id, 授信额度id
     */
    public Integer getCreditLineId() {
        return creditLineId;
    }

    /**
     * 设置 授信额度id 字段:factor_product_order.credit_line_id
     *
     * @param creditLineId the value for factor_product_order.credit_line_id, 授信额度id
     */
    public void setCreditLineId(Integer creditLineId) {
        this.creditLineId = creditLineId;
    }

    /**
     * 获取 最新的额度id 字段:factor_product_order.latest_credit_line_id
     *
     * @return factor_product_order.latest_credit_line_id, 最新的额度id
     */
    public Integer getLatestCreditLineId() {
        return latestCreditLineId;
    }

    /**
     * 设置 最新的额度id 字段:factor_product_order.latest_credit_line_id
     *
     * @param latestCreditLineId the value for factor_product_order.latest_credit_line_id, 最新的额度id
     */
    public void setLatestCreditLineId(Integer latestCreditLineId) {
        this.latestCreditLineId = latestCreditLineId;
    }

    /**
     * 获取 债权描述 字段:factor_product_order.credit_description
     *
     * @return factor_product_order.credit_description, 债权描述
     */
    public String getCreditDescription() {
        return creditDescription;
    }

    /**
     * 设置 债权描述 字段:factor_product_order.credit_description
     *
     * @param creditDescription the value for factor_product_order.credit_description, 债权描述
     */
    public void setCreditDescription(String creditDescription) {
        this.creditDescription = creditDescription == null ? null : creditDescription.trim();
    }

    /**
     * 获取 客户方贷款申请唯一标识 字段:factor_product_order.client_number
     *
     * @return factor_product_order.client_number, 客户方贷款申请唯一标识
     */
    public String getClientNumber() {
        return clientNumber;
    }

    /**
     * 设置 客户方贷款申请唯一标识 字段:factor_product_order.client_number
     *
     * @param clientNumber the value for factor_product_order.client_number, 客户方贷款申请唯一标识
     */
    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber == null ? null : clientNumber.trim();
    }

    /**
     * 获取 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起)  字段:factor_product_order.order_status
     *
     * @return factor_product_order.order_status, 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     */
    public Boolean getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起)  字段:factor_product_order.order_status
     *
     * @param orderStatus the value for factor_product_order.order_status, 订单审核状态  0 初试状态 1 审核中 2 2.审核成功（放款成功） 33.审核失败(订单失效，需重新发起) 
     */
    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取 客户卖方标识 字段:factor_product_order.custom_seller_company_id
     *
     * @return factor_product_order.custom_seller_company_id, 客户卖方标识
     */
    public String getCustomSellerCompanyId() {
        return customSellerCompanyId;
    }

    /**
     * 设置 客户卖方标识 字段:factor_product_order.custom_seller_company_id
     *
     * @param customSellerCompanyId the value for factor_product_order.custom_seller_company_id, 客户卖方标识
     */
    public void setCustomSellerCompanyId(String customSellerCompanyId) {
        this.customSellerCompanyId = customSellerCompanyId == null ? null : customSellerCompanyId.trim();
    }

    /**
     * 获取 人工审批原因 字段:factor_product_order.manual_audit_reason
     *
     * @return factor_product_order.manual_audit_reason, 人工审批原因
     */
    public String getManualAuditReason() {
        return manualAuditReason;
    }

    /**
     * 设置 人工审批原因 字段:factor_product_order.manual_audit_reason
     *
     * @param manualAuditReason the value for factor_product_order.manual_audit_reason, 人工审批原因
     */
    public void setManualAuditReason(String manualAuditReason) {
        this.manualAuditReason = manualAuditReason == null ? null : manualAuditReason.trim();
    }

    /**
     * 获取 多买方公司ID 字段:factor_product_order.buyer_company_ids
     *
     * @return factor_product_order.buyer_company_ids, 多买方公司ID
     */
    public String getBuyerCompanyIds() {
        return buyerCompanyIds;
    }

    /**
     * 设置 多买方公司ID 字段:factor_product_order.buyer_company_ids
     *
     * @param buyerCompanyIds the value for factor_product_order.buyer_company_ids, 多买方公司ID
     */
    public void setBuyerCompanyIds(String buyerCompanyIds) {
        this.buyerCompanyIds = buyerCompanyIds == null ? null : buyerCompanyIds.trim();
    }

    /**
     * 获取  字段:factor_product_order.contract_sign_url
     *
     * @return factor_product_order.contract_sign_url, 
     */
    public String getContractSignUrl() {
        return contractSignUrl;
    }

    /**
     * 设置  字段:factor_product_order.contract_sign_url
     *
     * @param contractSignUrl the value for factor_product_order.contract_sign_url, 
     */
    public void setContractSignUrl(String contractSignUrl) {
        this.contractSignUrl = contractSignUrl == null ? null : contractSignUrl.trim();
    }

    /**
     * 获取 打款银行科目编码 字段:factor_product_order.pay_bank_ANI
     *
     * @return factor_product_order.pay_bank_ANI, 打款银行科目编码
     */
    public String getPayBankAni() {
        return payBankAni;
    }

    /**
     * 设置 打款银行科目编码 字段:factor_product_order.pay_bank_ANI
     *
     * @param payBankAni the value for factor_product_order.pay_bank_ANI, 打款银行科目编码
     */
    public void setPayBankAni(String payBankAni) {
        this.payBankAni = payBankAni == null ? null : payBankAni.trim();
    }

    /**
     * 获取 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。 字段:factor_product_order.fee_rollback_status
     *
     * @return factor_product_order.fee_rollback_status, 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     */
    public Boolean getFeeRollbackStatus() {
        return feeRollbackStatus;
    }

    /**
     * 设置 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。 字段:factor_product_order.fee_rollback_status
     *
     * @param feeRollbackStatus the value for factor_product_order.fee_rollback_status, 手续费回滚状态 ，0默认;1已申请回滚审核中;2审核通过;3审核驳回。
     */
    public void setFeeRollbackStatus(Boolean feeRollbackStatus) {
        this.feeRollbackStatus = feeRollbackStatus;
    }

    /**
     * 获取 手续费回滚审核时间 字段:factor_product_order.fee_rollback_time
     *
     * @return factor_product_order.fee_rollback_time, 手续费回滚审核时间
     */
    public Integer getFeeRollbackTime() {
        return feeRollbackTime;
    }

    /**
     * 设置 手续费回滚审核时间 字段:factor_product_order.fee_rollback_time
     *
     * @param feeRollbackTime the value for factor_product_order.fee_rollback_time, 手续费回滚审核时间
     */
    public void setFeeRollbackTime(Integer feeRollbackTime) {
        this.feeRollbackTime = feeRollbackTime;
    }

    /**
     * 获取 多买方公司名称 字段:factor_product_order.buyer_company_names
     *
     * @return factor_product_order.buyer_company_names, 多买方公司名称
     */
    public String getBuyerCompanyNames() {
        return buyerCompanyNames;
    }

    /**
     * 设置 多买方公司名称 字段:factor_product_order.buyer_company_names
     *
     * @param buyerCompanyNames the value for factor_product_order.buyer_company_names, 多买方公司名称
     */
    public void setBuyerCompanyNames(String buyerCompanyNames) {
        this.buyerCompanyNames = buyerCompanyNames == null ? null : buyerCompanyNames.trim();
    }

    public List<FactorBill> getFactorBills() {
        return factorBills;
    }

    public void setFactorBills(List<FactorBill> factorBills) {
        this.factorBills=factorBills;
    }
}