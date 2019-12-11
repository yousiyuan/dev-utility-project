package com.glp.backend.mybatis.generate.factor.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;
import java.util.List;

public class GlpUserCompany extends BaseEntity {
    /**
     * 企业id
     * 表字段 : glp_user_company.id
     */
    private Integer id;

    /**
     * 用户ID
     * 表字段 : glp_user_company.uid
     */
    private Integer uid;

    /**
     * 企业名称
     * 表字段 : glp_user_company.name
     */
    private String name;

    /**
     * 1企业/2个人
     * 表字段 : glp_user_company.type
     */
    private Byte type;

    /**
     * 法人姓名
     * 表字段 : glp_user_company.legalrep
     */
    private String legalrep;

    /**
     * 法人身份证
     * 表字段 : glp_user_company.legalidcard
     */
    private String legalidcard;

    /**
     * 法人银行账户户名
     * 表字段 : glp_user_company.legal_bank_name
     */
    private String legalBankName;

    /**
     * 法人银行账号
     * 表字段 : glp_user_company.legal_bank_account
     */
    private String legalBankAccount;

    /**
     * 统一社会信用代码/注册号(原营业执照)
     * 表字段 : glp_user_company.uniform_social_credit_code
     */
    private String uniformSocialCreditCode;

    /**
     * 注册资本
     * 表字段 : glp_user_company.capital
     */
    private String capital;

    /**
     * 公司地址
     * 表字段 : glp_user_company.address
     */
    private String address;

    /**
     * 公司成立日期
     * 表字段 : glp_user_company.found_time
     */
    private String foundTime;

    /**
     * 营业期限起
     * 表字段 : glp_user_company.yyqxq
     */
    private String yyqxq;

    /**
     * 营业期限止
     * 表字段 : glp_user_company.yyqxz
     */
    private String yyqxz;

    /**
     * 登记机关
     * 表字段 : glp_user_company.regplace
     */
    private String regplace;

    /**
     * 公司联系人姓名
     * 表字段 : glp_user_company.company_contact_name
     */
    private String companyContactName;

    /**
     * 公司联系人手机
     * 表字段 : glp_user_company.company_contact_mobile
     */
    private String companyContactMobile;

    /**
     * 公司联系人电子邮箱
     * 表字段 : glp_user_company.company_contact_email
     */
    private String companyContactEmail;

    /**
     * 登记状态
     * 表字段 : glp_user_company.status
     */
    private String status;

    /**
     * 企业邮箱
     * 表字段 : glp_user_company.email
     */
    private String email;

    /**
     * 联系手机号 网签用
     * 表字段 : glp_user_company.mobile
     */
    private String mobile;

    /**
     * 营业执照照片
     * 表字段 : glp_user_company.yyzzimg
     */
    private String yyzzimg;

    /**
     * 组织机构代码
     * 表字段 : glp_user_company.organization_code
     */
    private String organizationCode;

    /**
     * 税务登记证
     * 表字段 : glp_user_company.tax_certificate
     */
    private String taxCertificate;

    /**
     * 发票地址以电话
     * 表字段 : glp_user_company.invoice_address_phone
     */
    private String invoiceAddressPhone;

    /**
     * 发票开户行及账号
     * 表字段 : glp_user_company.invoice_bank_account
     */
    private String invoiceBankAccount;

    /**
     * 纳税人类型
     * 表字段 : glp_user_company.tax_type
     */
    private String taxType;

    /**
     * 发票抬头
     * 表字段 : glp_user_company.invoice_header
     */
    private String invoiceHeader;

    /**
     * 联系地址
     * 表字段 : glp_user_company.contact_address
     */
    private String contactAddress;

    /**
     * 额度占用编码(设备,运力)
     * 表字段 : glp_user_company.plat_bp_code
     */
    private String platBpCode;

    /**
     * 对于项目经理编码(设备,运力)
     * 表字段 : glp_user_company.employee_id
     */
    private String employeeId;

    /**
     * 所属产品线代码
     * 表字段 : glp_user_company.division
     */
    private Integer division;

    /**
     * 商业伙伴名称
     * 表字段 : glp_user_company.vender_bp_code
     */
    private String venderBpCode;

    /**
     * 是否设备款收款方0否1是
     * 表字段 : glp_user_company.payer_flag
     */
    private Byte payerFlag;

    /**
     * 融资类型1形式回租2新品回租3平台收款,可多选
     * 表字段 : glp_user_company.finance_type
     */
    private String financeType;

    /**
     * 护照编号
     * 表字段 : glp_user_company.passport
     */
    private String passport;

    /**
     * 护照照片
     * 表字段 : glp_user_company.passport_img
     */
    private String passportImg;

    /**
     * 法人代表身份证号正面照片
     * 表字段 : glp_user_company.legalrep_id_card_front
     */
    private String legalrepIdCardFront;

    /**
     * 法人代表身份证号反面照片
     * 表字段 : glp_user_company.legalrep_id_card_reverse
     */
    private String legalrepIdCardReverse;

    /**
     * 税务登记证照片
     * 表字段 : glp_user_company.tax_registration_img
     */
    private String taxRegistrationImg;

    /**
     * 组织机构代码证照片
     * 表字段 : glp_user_company.organization_certificate_img
     */
    private String organizationCertificateImg;

    /**
     * 营业执照号码
     * 表字段 : glp_user_company.business_license_number
     */
    private String businessLicenseNumber;

    /**
     * 1/老三证，2/新证
     * 表字段 : glp_user_company.license_type
     */
    private Boolean licenseType;

    /**
     * 1/身份证，2/护照
     * 表字段 : glp_user_company.certificate_type
     */
    private Boolean certificateType;

    /**
     * 实际控制人
     * 表字段 : glp_user_company.actual_controller_name
     */
    private String actualControllerName;

    /**
     * 实际控制人证件类型
     * 表字段 : glp_user_company.actual_controller_id_type
     */
    private Boolean actualControllerIdType;

    /**
     * 实际控制人证件号码
     * 表字段 : glp_user_company.actual_controller_id_no
     */
    private String actualControllerIdNo;

    /**
     * 
     * 表字段 : glp_user_company.is_real_name
     */
    private Boolean isRealName;

    /**
     * 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     * 表字段 : glp_user_company.audit_status
     */
    private Boolean auditStatus;

    /**
     * 来源类型 0系统录入 1接口 2web端
     * 表字段 : glp_user_company.source_type
     */
    private Boolean sourceType;

    /**
     * 来源公司id 0 系统录入
     * 表字段 : glp_user_company.source_id
     */
    private Integer sourceId;

    /**
     * 客户系统公司编码
     * 表字段 : glp_user_company.customer_company_code
     */
    private String customerCompanyCode;

    /**
     * 
     * 表字段 : glp_user_company.code
     */
    private String code;

    /**
     * 
     * 表字段 : glp_user_company.create_time
     */
    private Integer createTime;

    /**
     * 
     * 表字段 : glp_user_company.update_time
     */
    private Integer updateTime;

    /**
     * 是否需要统一账户 1 需要同步 0 不需要同步
     * 表字段 : glp_user_company.is_unified
     */
    private Boolean isUnified;

    /**
     * 统一账户id
     * 表字段 : glp_user_company.account_id
     */
    private Integer accountId;

    /**
     * 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     * 表字段 : glp_user_company.review_status
     */
    private Boolean reviewStatus;

    /**
     * 人工审核id
     * 表字段 : glp_user_company.apply_id
     */
    private Integer applyId;

    private List<GlpCompanyBank> glpCompanyBanks;

    /**
     * 获取 企业id 字段:glp_user_company.id
     *
     * @return glp_user_company.id, 企业id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 企业id 字段:glp_user_company.id
     *
     * @param id the value for glp_user_company.id, 企业id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 用户ID 字段:glp_user_company.uid
     *
     * @return glp_user_company.uid, 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置 用户ID 字段:glp_user_company.uid
     *
     * @param uid the value for glp_user_company.uid, 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取 企业名称 字段:glp_user_company.name
     *
     * @return glp_user_company.name, 企业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 企业名称 字段:glp_user_company.name
     *
     * @param name the value for glp_user_company.name, 企业名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 1企业/2个人 字段:glp_user_company.type
     *
     * @return glp_user_company.type, 1企业/2个人
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置 1企业/2个人 字段:glp_user_company.type
     *
     * @param type the value for glp_user_company.type, 1企业/2个人
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取 法人姓名 字段:glp_user_company.legalrep
     *
     * @return glp_user_company.legalrep, 法人姓名
     */
    public String getLegalrep() {
        return legalrep;
    }

    /**
     * 设置 法人姓名 字段:glp_user_company.legalrep
     *
     * @param legalrep the value for glp_user_company.legalrep, 法人姓名
     */
    public void setLegalrep(String legalrep) {
        this.legalrep = legalrep == null ? null : legalrep.trim();
    }

    /**
     * 获取 法人身份证 字段:glp_user_company.legalidcard
     *
     * @return glp_user_company.legalidcard, 法人身份证
     */
    public String getLegalidcard() {
        return legalidcard;
    }

    /**
     * 设置 法人身份证 字段:glp_user_company.legalidcard
     *
     * @param legalidcard the value for glp_user_company.legalidcard, 法人身份证
     */
    public void setLegalidcard(String legalidcard) {
        this.legalidcard = legalidcard == null ? null : legalidcard.trim();
    }

    /**
     * 获取 法人银行账户户名 字段:glp_user_company.legal_bank_name
     *
     * @return glp_user_company.legal_bank_name, 法人银行账户户名
     */
    public String getLegalBankName() {
        return legalBankName;
    }

    /**
     * 设置 法人银行账户户名 字段:glp_user_company.legal_bank_name
     *
     * @param legalBankName the value for glp_user_company.legal_bank_name, 法人银行账户户名
     */
    public void setLegalBankName(String legalBankName) {
        this.legalBankName = legalBankName == null ? null : legalBankName.trim();
    }

    /**
     * 获取 法人银行账号 字段:glp_user_company.legal_bank_account
     *
     * @return glp_user_company.legal_bank_account, 法人银行账号
     */
    public String getLegalBankAccount() {
        return legalBankAccount;
    }

    /**
     * 设置 法人银行账号 字段:glp_user_company.legal_bank_account
     *
     * @param legalBankAccount the value for glp_user_company.legal_bank_account, 法人银行账号
     */
    public void setLegalBankAccount(String legalBankAccount) {
        this.legalBankAccount = legalBankAccount == null ? null : legalBankAccount.trim();
    }

    /**
     * 获取 统一社会信用代码/注册号(原营业执照) 字段:glp_user_company.uniform_social_credit_code
     *
     * @return glp_user_company.uniform_social_credit_code, 统一社会信用代码/注册号(原营业执照)
     */
    public String getUniformSocialCreditCode() {
        return uniformSocialCreditCode;
    }

    /**
     * 设置 统一社会信用代码/注册号(原营业执照) 字段:glp_user_company.uniform_social_credit_code
     *
     * @param uniformSocialCreditCode the value for glp_user_company.uniform_social_credit_code, 统一社会信用代码/注册号(原营业执照)
     */
    public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
        this.uniformSocialCreditCode = uniformSocialCreditCode == null ? null : uniformSocialCreditCode.trim();
    }

    /**
     * 获取 注册资本 字段:glp_user_company.capital
     *
     * @return glp_user_company.capital, 注册资本
     */
    public String getCapital() {
        return capital;
    }

    /**
     * 设置 注册资本 字段:glp_user_company.capital
     *
     * @param capital the value for glp_user_company.capital, 注册资本
     */
    public void setCapital(String capital) {
        this.capital = capital == null ? null : capital.trim();
    }

    /**
     * 获取 公司地址 字段:glp_user_company.address
     *
     * @return glp_user_company.address, 公司地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置 公司地址 字段:glp_user_company.address
     *
     * @param address the value for glp_user_company.address, 公司地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取 公司成立日期 字段:glp_user_company.found_time
     *
     * @return glp_user_company.found_time, 公司成立日期
     */
    public String getFoundTime() {
        return foundTime;
    }

    /**
     * 设置 公司成立日期 字段:glp_user_company.found_time
     *
     * @param foundTime the value for glp_user_company.found_time, 公司成立日期
     */
    public void setFoundTime(String foundTime) {
        this.foundTime = foundTime == null ? null : foundTime.trim();
    }

    /**
     * 获取 营业期限起 字段:glp_user_company.yyqxq
     *
     * @return glp_user_company.yyqxq, 营业期限起
     */
    public String getYyqxq() {
        return yyqxq;
    }

    /**
     * 设置 营业期限起 字段:glp_user_company.yyqxq
     *
     * @param yyqxq the value for glp_user_company.yyqxq, 营业期限起
     */
    public void setYyqxq(String yyqxq) {
        this.yyqxq = yyqxq == null ? null : yyqxq.trim();
    }

    /**
     * 获取 营业期限止 字段:glp_user_company.yyqxz
     *
     * @return glp_user_company.yyqxz, 营业期限止
     */
    public String getYyqxz() {
        return yyqxz;
    }

    /**
     * 设置 营业期限止 字段:glp_user_company.yyqxz
     *
     * @param yyqxz the value for glp_user_company.yyqxz, 营业期限止
     */
    public void setYyqxz(String yyqxz) {
        this.yyqxz = yyqxz == null ? null : yyqxz.trim();
    }

    /**
     * 获取 登记机关 字段:glp_user_company.regplace
     *
     * @return glp_user_company.regplace, 登记机关
     */
    public String getRegplace() {
        return regplace;
    }

    /**
     * 设置 登记机关 字段:glp_user_company.regplace
     *
     * @param regplace the value for glp_user_company.regplace, 登记机关
     */
    public void setRegplace(String regplace) {
        this.regplace = regplace == null ? null : regplace.trim();
    }

    /**
     * 获取 公司联系人姓名 字段:glp_user_company.company_contact_name
     *
     * @return glp_user_company.company_contact_name, 公司联系人姓名
     */
    public String getCompanyContactName() {
        return companyContactName;
    }

    /**
     * 设置 公司联系人姓名 字段:glp_user_company.company_contact_name
     *
     * @param companyContactName the value for glp_user_company.company_contact_name, 公司联系人姓名
     */
    public void setCompanyContactName(String companyContactName) {
        this.companyContactName = companyContactName == null ? null : companyContactName.trim();
    }

    /**
     * 获取 公司联系人手机 字段:glp_user_company.company_contact_mobile
     *
     * @return glp_user_company.company_contact_mobile, 公司联系人手机
     */
    public String getCompanyContactMobile() {
        return companyContactMobile;
    }

    /**
     * 设置 公司联系人手机 字段:glp_user_company.company_contact_mobile
     *
     * @param companyContactMobile the value for glp_user_company.company_contact_mobile, 公司联系人手机
     */
    public void setCompanyContactMobile(String companyContactMobile) {
        this.companyContactMobile = companyContactMobile == null ? null : companyContactMobile.trim();
    }

    /**
     * 获取 公司联系人电子邮箱 字段:glp_user_company.company_contact_email
     *
     * @return glp_user_company.company_contact_email, 公司联系人电子邮箱
     */
    public String getCompanyContactEmail() {
        return companyContactEmail;
    }

    /**
     * 设置 公司联系人电子邮箱 字段:glp_user_company.company_contact_email
     *
     * @param companyContactEmail the value for glp_user_company.company_contact_email, 公司联系人电子邮箱
     */
    public void setCompanyContactEmail(String companyContactEmail) {
        this.companyContactEmail = companyContactEmail == null ? null : companyContactEmail.trim();
    }

    /**
     * 获取 登记状态 字段:glp_user_company.status
     *
     * @return glp_user_company.status, 登记状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 登记状态 字段:glp_user_company.status
     *
     * @param status the value for glp_user_company.status, 登记状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取 企业邮箱 字段:glp_user_company.email
     *
     * @return glp_user_company.email, 企业邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 企业邮箱 字段:glp_user_company.email
     *
     * @param email the value for glp_user_company.email, 企业邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取 联系手机号 网签用 字段:glp_user_company.mobile
     *
     * @return glp_user_company.mobile, 联系手机号 网签用
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置 联系手机号 网签用 字段:glp_user_company.mobile
     *
     * @param mobile the value for glp_user_company.mobile, 联系手机号 网签用
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取 营业执照照片 字段:glp_user_company.yyzzimg
     *
     * @return glp_user_company.yyzzimg, 营业执照照片
     */
    public String getYyzzimg() {
        return yyzzimg;
    }

    /**
     * 设置 营业执照照片 字段:glp_user_company.yyzzimg
     *
     * @param yyzzimg the value for glp_user_company.yyzzimg, 营业执照照片
     */
    public void setYyzzimg(String yyzzimg) {
        this.yyzzimg = yyzzimg == null ? null : yyzzimg.trim();
    }

    /**
     * 获取 组织机构代码 字段:glp_user_company.organization_code
     *
     * @return glp_user_company.organization_code, 组织机构代码
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * 设置 组织机构代码 字段:glp_user_company.organization_code
     *
     * @param organizationCode the value for glp_user_company.organization_code, 组织机构代码
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    /**
     * 获取 税务登记证 字段:glp_user_company.tax_certificate
     *
     * @return glp_user_company.tax_certificate, 税务登记证
     */
    public String getTaxCertificate() {
        return taxCertificate;
    }

    /**
     * 设置 税务登记证 字段:glp_user_company.tax_certificate
     *
     * @param taxCertificate the value for glp_user_company.tax_certificate, 税务登记证
     */
    public void setTaxCertificate(String taxCertificate) {
        this.taxCertificate = taxCertificate == null ? null : taxCertificate.trim();
    }

    /**
     * 获取 发票地址以电话 字段:glp_user_company.invoice_address_phone
     *
     * @return glp_user_company.invoice_address_phone, 发票地址以电话
     */
    public String getInvoiceAddressPhone() {
        return invoiceAddressPhone;
    }

    /**
     * 设置 发票地址以电话 字段:glp_user_company.invoice_address_phone
     *
     * @param invoiceAddressPhone the value for glp_user_company.invoice_address_phone, 发票地址以电话
     */
    public void setInvoiceAddressPhone(String invoiceAddressPhone) {
        this.invoiceAddressPhone = invoiceAddressPhone == null ? null : invoiceAddressPhone.trim();
    }

    /**
     * 获取 发票开户行及账号 字段:glp_user_company.invoice_bank_account
     *
     * @return glp_user_company.invoice_bank_account, 发票开户行及账号
     */
    public String getInvoiceBankAccount() {
        return invoiceBankAccount;
    }

    /**
     * 设置 发票开户行及账号 字段:glp_user_company.invoice_bank_account
     *
     * @param invoiceBankAccount the value for glp_user_company.invoice_bank_account, 发票开户行及账号
     */
    public void setInvoiceBankAccount(String invoiceBankAccount) {
        this.invoiceBankAccount = invoiceBankAccount == null ? null : invoiceBankAccount.trim();
    }

    /**
     * 获取 纳税人类型 字段:glp_user_company.tax_type
     *
     * @return glp_user_company.tax_type, 纳税人类型
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * 设置 纳税人类型 字段:glp_user_company.tax_type
     *
     * @param taxType the value for glp_user_company.tax_type, 纳税人类型
     */
    public void setTaxType(String taxType) {
        this.taxType = taxType == null ? null : taxType.trim();
    }

    /**
     * 获取 发票抬头 字段:glp_user_company.invoice_header
     *
     * @return glp_user_company.invoice_header, 发票抬头
     */
    public String getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * 设置 发票抬头 字段:glp_user_company.invoice_header
     *
     * @param invoiceHeader the value for glp_user_company.invoice_header, 发票抬头
     */
    public void setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader == null ? null : invoiceHeader.trim();
    }

    /**
     * 获取 联系地址 字段:glp_user_company.contact_address
     *
     * @return glp_user_company.contact_address, 联系地址
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 设置 联系地址 字段:glp_user_company.contact_address
     *
     * @param contactAddress the value for glp_user_company.contact_address, 联系地址
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * 获取 额度占用编码(设备,运力) 字段:glp_user_company.plat_bp_code
     *
     * @return glp_user_company.plat_bp_code, 额度占用编码(设备,运力)
     */
    public String getPlatBpCode() {
        return platBpCode;
    }

    /**
     * 设置 额度占用编码(设备,运力) 字段:glp_user_company.plat_bp_code
     *
     * @param platBpCode the value for glp_user_company.plat_bp_code, 额度占用编码(设备,运力)
     */
    public void setPlatBpCode(String platBpCode) {
        this.platBpCode = platBpCode == null ? null : platBpCode.trim();
    }

    /**
     * 获取 对于项目经理编码(设备,运力) 字段:glp_user_company.employee_id
     *
     * @return glp_user_company.employee_id, 对于项目经理编码(设备,运力)
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置 对于项目经理编码(设备,运力) 字段:glp_user_company.employee_id
     *
     * @param employeeId the value for glp_user_company.employee_id, 对于项目经理编码(设备,运力)
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 获取 所属产品线代码 字段:glp_user_company.division
     *
     * @return glp_user_company.division, 所属产品线代码
     */
    public Integer getDivision() {
        return division;
    }

    /**
     * 设置 所属产品线代码 字段:glp_user_company.division
     *
     * @param division the value for glp_user_company.division, 所属产品线代码
     */
    public void setDivision(Integer division) {
        this.division = division;
    }

    /**
     * 获取 商业伙伴名称 字段:glp_user_company.vender_bp_code
     *
     * @return glp_user_company.vender_bp_code, 商业伙伴名称
     */
    public String getVenderBpCode() {
        return venderBpCode;
    }

    /**
     * 设置 商业伙伴名称 字段:glp_user_company.vender_bp_code
     *
     * @param venderBpCode the value for glp_user_company.vender_bp_code, 商业伙伴名称
     */
    public void setVenderBpCode(String venderBpCode) {
        this.venderBpCode = venderBpCode == null ? null : venderBpCode.trim();
    }

    /**
     * 获取 是否设备款收款方0否1是 字段:glp_user_company.payer_flag
     *
     * @return glp_user_company.payer_flag, 是否设备款收款方0否1是
     */
    public Byte getPayerFlag() {
        return payerFlag;
    }

    /**
     * 设置 是否设备款收款方0否1是 字段:glp_user_company.payer_flag
     *
     * @param payerFlag the value for glp_user_company.payer_flag, 是否设备款收款方0否1是
     */
    public void setPayerFlag(Byte payerFlag) {
        this.payerFlag = payerFlag;
    }

    /**
     * 获取 融资类型1形式回租2新品回租3平台收款,可多选 字段:glp_user_company.finance_type
     *
     * @return glp_user_company.finance_type, 融资类型1形式回租2新品回租3平台收款,可多选
     */
    public String getFinanceType() {
        return financeType;
    }

    /**
     * 设置 融资类型1形式回租2新品回租3平台收款,可多选 字段:glp_user_company.finance_type
     *
     * @param financeType the value for glp_user_company.finance_type, 融资类型1形式回租2新品回租3平台收款,可多选
     */
    public void setFinanceType(String financeType) {
        this.financeType = financeType == null ? null : financeType.trim();
    }

    /**
     * 获取 护照编号 字段:glp_user_company.passport
     *
     * @return glp_user_company.passport, 护照编号
     */
    public String getPassport() {
        return passport;
    }

    /**
     * 设置 护照编号 字段:glp_user_company.passport
     *
     * @param passport the value for glp_user_company.passport, 护照编号
     */
    public void setPassport(String passport) {
        this.passport = passport == null ? null : passport.trim();
    }

    /**
     * 获取 护照照片 字段:glp_user_company.passport_img
     *
     * @return glp_user_company.passport_img, 护照照片
     */
    public String getPassportImg() {
        return passportImg;
    }

    /**
     * 设置 护照照片 字段:glp_user_company.passport_img
     *
     * @param passportImg the value for glp_user_company.passport_img, 护照照片
     */
    public void setPassportImg(String passportImg) {
        this.passportImg = passportImg == null ? null : passportImg.trim();
    }

    /**
     * 获取 法人代表身份证号正面照片 字段:glp_user_company.legalrep_id_card_front
     *
     * @return glp_user_company.legalrep_id_card_front, 法人代表身份证号正面照片
     */
    public String getLegalrepIdCardFront() {
        return legalrepIdCardFront;
    }

    /**
     * 设置 法人代表身份证号正面照片 字段:glp_user_company.legalrep_id_card_front
     *
     * @param legalrepIdCardFront the value for glp_user_company.legalrep_id_card_front, 法人代表身份证号正面照片
     */
    public void setLegalrepIdCardFront(String legalrepIdCardFront) {
        this.legalrepIdCardFront = legalrepIdCardFront == null ? null : legalrepIdCardFront.trim();
    }

    /**
     * 获取 法人代表身份证号反面照片 字段:glp_user_company.legalrep_id_card_reverse
     *
     * @return glp_user_company.legalrep_id_card_reverse, 法人代表身份证号反面照片
     */
    public String getLegalrepIdCardReverse() {
        return legalrepIdCardReverse;
    }

    /**
     * 设置 法人代表身份证号反面照片 字段:glp_user_company.legalrep_id_card_reverse
     *
     * @param legalrepIdCardReverse the value for glp_user_company.legalrep_id_card_reverse, 法人代表身份证号反面照片
     */
    public void setLegalrepIdCardReverse(String legalrepIdCardReverse) {
        this.legalrepIdCardReverse = legalrepIdCardReverse == null ? null : legalrepIdCardReverse.trim();
    }

    /**
     * 获取 税务登记证照片 字段:glp_user_company.tax_registration_img
     *
     * @return glp_user_company.tax_registration_img, 税务登记证照片
     */
    public String getTaxRegistrationImg() {
        return taxRegistrationImg;
    }

    /**
     * 设置 税务登记证照片 字段:glp_user_company.tax_registration_img
     *
     * @param taxRegistrationImg the value for glp_user_company.tax_registration_img, 税务登记证照片
     */
    public void setTaxRegistrationImg(String taxRegistrationImg) {
        this.taxRegistrationImg = taxRegistrationImg == null ? null : taxRegistrationImg.trim();
    }

    /**
     * 获取 组织机构代码证照片 字段:glp_user_company.organization_certificate_img
     *
     * @return glp_user_company.organization_certificate_img, 组织机构代码证照片
     */
    public String getOrganizationCertificateImg() {
        return organizationCertificateImg;
    }

    /**
     * 设置 组织机构代码证照片 字段:glp_user_company.organization_certificate_img
     *
     * @param organizationCertificateImg the value for glp_user_company.organization_certificate_img, 组织机构代码证照片
     */
    public void setOrganizationCertificateImg(String organizationCertificateImg) {
        this.organizationCertificateImg = organizationCertificateImg == null ? null : organizationCertificateImg.trim();
    }

    /**
     * 获取 营业执照号码 字段:glp_user_company.business_license_number
     *
     * @return glp_user_company.business_license_number, 营业执照号码
     */
    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    /**
     * 设置 营业执照号码 字段:glp_user_company.business_license_number
     *
     * @param businessLicenseNumber the value for glp_user_company.business_license_number, 营业执照号码
     */
    public void setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber == null ? null : businessLicenseNumber.trim();
    }

    /**
     * 获取 1/老三证，2/新证 字段:glp_user_company.license_type
     *
     * @return glp_user_company.license_type, 1/老三证，2/新证
     */
    public Boolean getLicenseType() {
        return licenseType;
    }

    /**
     * 设置 1/老三证，2/新证 字段:glp_user_company.license_type
     *
     * @param licenseType the value for glp_user_company.license_type, 1/老三证，2/新证
     */
    public void setLicenseType(Boolean licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * 获取 1/身份证，2/护照 字段:glp_user_company.certificate_type
     *
     * @return glp_user_company.certificate_type, 1/身份证，2/护照
     */
    public Boolean getCertificateType() {
        return certificateType;
    }

    /**
     * 设置 1/身份证，2/护照 字段:glp_user_company.certificate_type
     *
     * @param certificateType the value for glp_user_company.certificate_type, 1/身份证，2/护照
     */
    public void setCertificateType(Boolean certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * 获取 实际控制人 字段:glp_user_company.actual_controller_name
     *
     * @return glp_user_company.actual_controller_name, 实际控制人
     */
    public String getActualControllerName() {
        return actualControllerName;
    }

    /**
     * 设置 实际控制人 字段:glp_user_company.actual_controller_name
     *
     * @param actualControllerName the value for glp_user_company.actual_controller_name, 实际控制人
     */
    public void setActualControllerName(String actualControllerName) {
        this.actualControllerName = actualControllerName == null ? null : actualControllerName.trim();
    }

    /**
     * 获取 实际控制人证件类型 字段:glp_user_company.actual_controller_id_type
     *
     * @return glp_user_company.actual_controller_id_type, 实际控制人证件类型
     */
    public Boolean getActualControllerIdType() {
        return actualControllerIdType;
    }

    /**
     * 设置 实际控制人证件类型 字段:glp_user_company.actual_controller_id_type
     *
     * @param actualControllerIdType the value for glp_user_company.actual_controller_id_type, 实际控制人证件类型
     */
    public void setActualControllerIdType(Boolean actualControllerIdType) {
        this.actualControllerIdType = actualControllerIdType;
    }

    /**
     * 获取 实际控制人证件号码 字段:glp_user_company.actual_controller_id_no
     *
     * @return glp_user_company.actual_controller_id_no, 实际控制人证件号码
     */
    public String getActualControllerIdNo() {
        return actualControllerIdNo;
    }

    /**
     * 设置 实际控制人证件号码 字段:glp_user_company.actual_controller_id_no
     *
     * @param actualControllerIdNo the value for glp_user_company.actual_controller_id_no, 实际控制人证件号码
     */
    public void setActualControllerIdNo(String actualControllerIdNo) {
        this.actualControllerIdNo = actualControllerIdNo == null ? null : actualControllerIdNo.trim();
    }

    /**
     * 获取  字段:glp_user_company.is_real_name
     *
     * @return glp_user_company.is_real_name, 
     */
    public Boolean getIsRealName() {
        return isRealName;
    }

    /**
     * 设置  字段:glp_user_company.is_real_name
     *
     * @param isRealName the value for glp_user_company.is_real_name, 
     */
    public void setIsRealName(Boolean isRealName) {
        this.isRealName = isRealName;
    }

    /**
     * 获取 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回 字段:glp_user_company.audit_status
     *
     * @return glp_user_company.audit_status, 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    public Boolean getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回 字段:glp_user_company.audit_status
     *
     * @param auditStatus the value for glp_user_company.audit_status, 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    public void setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取 来源类型 0系统录入 1接口 2web端 字段:glp_user_company.source_type
     *
     * @return glp_user_company.source_type, 来源类型 0系统录入 1接口 2web端
     */
    public Boolean getSourceType() {
        return sourceType;
    }

    /**
     * 设置 来源类型 0系统录入 1接口 2web端 字段:glp_user_company.source_type
     *
     * @param sourceType the value for glp_user_company.source_type, 来源类型 0系统录入 1接口 2web端
     */
    public void setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取 来源公司id 0 系统录入 字段:glp_user_company.source_id
     *
     * @return glp_user_company.source_id, 来源公司id 0 系统录入
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * 设置 来源公司id 0 系统录入 字段:glp_user_company.source_id
     *
     * @param sourceId the value for glp_user_company.source_id, 来源公司id 0 系统录入
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取 客户系统公司编码 字段:glp_user_company.customer_company_code
     *
     * @return glp_user_company.customer_company_code, 客户系统公司编码
     */
    public String getCustomerCompanyCode() {
        return customerCompanyCode;
    }

    /**
     * 设置 客户系统公司编码 字段:glp_user_company.customer_company_code
     *
     * @param customerCompanyCode the value for glp_user_company.customer_company_code, 客户系统公司编码
     */
    public void setCustomerCompanyCode(String customerCompanyCode) {
        this.customerCompanyCode = customerCompanyCode == null ? null : customerCompanyCode.trim();
    }

    /**
     * 获取  字段:glp_user_company.code
     *
     * @return glp_user_company.code, 
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置  字段:glp_user_company.code
     *
     * @param code the value for glp_user_company.code, 
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取  字段:glp_user_company.create_time
     *
     * @return glp_user_company.create_time, 
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置  字段:glp_user_company.create_time
     *
     * @param createTime the value for glp_user_company.create_time, 
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:glp_user_company.update_time
     *
     * @return glp_user_company.update_time, 
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置  字段:glp_user_company.update_time
     *
     * @param updateTime the value for glp_user_company.update_time, 
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 是否需要统一账户 1 需要同步 0 不需要同步 字段:glp_user_company.is_unified
     *
     * @return glp_user_company.is_unified, 是否需要统一账户 1 需要同步 0 不需要同步
     */
    public Boolean getIsUnified() {
        return isUnified;
    }

    /**
     * 设置 是否需要统一账户 1 需要同步 0 不需要同步 字段:glp_user_company.is_unified
     *
     * @param isUnified the value for glp_user_company.is_unified, 是否需要统一账户 1 需要同步 0 不需要同步
     */
    public void setIsUnified(Boolean isUnified) {
        this.isUnified = isUnified;
    }

    /**
     * 获取 统一账户id 字段:glp_user_company.account_id
     *
     * @return glp_user_company.account_id, 统一账户id
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 设置 统一账户id 字段:glp_user_company.account_id
     *
     * @param accountId the value for glp_user_company.account_id, 统一账户id
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝 字段:glp_user_company.review_status
     *
     * @return glp_user_company.review_status, 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     */
    public Boolean getReviewStatus() {
        return reviewStatus;
    }

    /**
     * 设置 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝 字段:glp_user_company.review_status
     *
     * @param reviewStatus the value for glp_user_company.review_status, 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     */
    public void setReviewStatus(Boolean reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * 获取 人工审核id 字段:glp_user_company.apply_id
     *
     * @return glp_user_company.apply_id, 人工审核id
     */
    public Integer getApplyId() {
        return applyId;
    }

    /**
     * 设置 人工审核id 字段:glp_user_company.apply_id
     *
     * @param applyId the value for glp_user_company.apply_id, 人工审核id
     */
    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public List<GlpCompanyBank> getGlpCompanyBanks() {
        return glpCompanyBanks;
    }

    public void setGlpCompanyBanks(List<GlpCompanyBank> glpCompanyBanks) {
        this.glpCompanyBanks=glpCompanyBanks;
    }
}