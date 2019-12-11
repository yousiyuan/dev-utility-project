package org.artemis.sparrow.entity;

import javax.persistence.*;

@Table(name = "glp_user_company")
public class GlpUserCompany {
    /**
     * 企业id
     */
    @Id
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 企业名称
     */
    private String name;

    /**
     * 1企业/2个人
     */
    private Byte type;

    /**
     * 法人姓名
     */
    private String legalrep;

    /**
     * 法人身份证
     */
    private String legalidcard;

    /**
     * 法人银行账户户名
     */
    @Column(name = "legal_bank_name")
    private String legalBankName;

    /**
     * 法人银行账号
     */
    @Column(name = "legal_bank_account")
    private String legalBankAccount;

    /**
     * 统一社会信用代码/注册号(原营业执照)
     */
    @Column(name = "uniform_social_credit_code")
    private String uniformSocialCreditCode;

    /**
     * 注册资本
     */
    private String capital;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 公司成立日期
     */
    @Column(name = "found_time")
    private String foundTime;

    /**
     * 营业期限起
     */
    private String yyqxq;

    /**
     * 营业期限止
     */
    private String yyqxz;

    /**
     * 登记机关
     */
    private String regplace;

    /**
     * 公司联系人姓名
     */
    @Column(name = "company_contact_name")
    private String companyContactName;

    /**
     * 公司联系人手机
     */
    @Column(name = "company_contact_mobile")
    private String companyContactMobile;

    /**
     * 公司联系人电子邮箱
     */
    @Column(name = "company_contact_email")
    private String companyContactEmail;

    /**
     * 登记状态
     */
    private String status;

    /**
     * 企业邮箱
     */
    private String email;

    /**
     * 联系手机号 网签用
     */
    private String mobile;

    /**
     * 营业执照照片
     */
    private String yyzzimg;

    /**
     * 组织机构代码
     */
    @Column(name = "organization_code")
    private String organizationCode;

    /**
     * 税务登记证
     */
    @Column(name = "tax_certificate")
    private String taxCertificate;

    /**
     * 发票地址以电话
     */
    @Column(name = "invoice_address_phone")
    private String invoiceAddressPhone;

    /**
     * 发票开户行及账号
     */
    @Column(name = "invoice_bank_account")
    private String invoiceBankAccount;

    /**
     * 纳税人类型
     */
    @Column(name = "tax_type")
    private String taxType;

    /**
     * 发票抬头
     */
    @Column(name = "invoice_header")
    private String invoiceHeader;

    /**
     * 联系地址
     */
    @Column(name = "contact_address")
    private String contactAddress;

    /**
     * 额度占用编码(设备,运力)
     */
    @Column(name = "plat_bp_code")
    private String platBpCode;

    /**
     * 对于项目经理编码(设备,运力)
     */
    @Column(name = "employee_id")
    private String employeeId;

    /**
     * 所属产品线代码
     */
    private Integer division;

    /**
     * 商业伙伴名称
     */
    @Column(name = "vender_bp_code")
    private String venderBpCode;

    /**
     * 是否设备款收款方0否1是
     */
    @Column(name = "payer_flag")
    private Byte payerFlag;

    /**
     * 融资类型1形式回租2新品回租3平台收款,可多选
     */
    @Column(name = "finance_type")
    private String financeType;

    /**
     * 护照编号
     */
    private String passport;

    /**
     * 护照照片
     */
    @Column(name = "passport_img")
    private String passportImg;

    /**
     * 法人代表身份证号正面照片
     */
    @Column(name = "legalrep_id_card_front")
    private String legalrepIdCardFront;

    /**
     * 法人代表身份证号反面照片
     */
    @Column(name = "legalrep_id_card_reverse")
    private String legalrepIdCardReverse;

    /**
     * 税务登记证照片
     */
    @Column(name = "tax_registration_img")
    private String taxRegistrationImg;

    /**
     * 组织机构代码证照片
     */
    @Column(name = "organization_certificate_img")
    private String organizationCertificateImg;

    /**
     * 营业执照号码
     */
    @Column(name = "business_license_number")
    private String businessLicenseNumber;

    /**
     * 1/老三证，2/新证
     */
    @Column(name = "license_type")
    private Boolean licenseType;

    /**
     * 1/身份证，2/护照
     */
    @Column(name = "certificate_type")
    private Boolean certificateType;

    /**
     * 实际控制人
     */
    @Column(name = "actual_controller_name")
    private String actualControllerName;

    /**
     * 实际控制人证件类型
     */
    @Column(name = "actual_controller_id_type")
    private Boolean actualControllerIdType;

    /**
     * 实际控制人证件号码
     */
    @Column(name = "actual_controller_id_no")
    private String actualControllerIdNo;

    @Column(name = "is_real_name")
    private Boolean isRealName;

    /**
     * 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    @Column(name = "audit_status")
    private Boolean auditStatus;

    /**
     * 来源类型 0系统录入 1接口 2web端
     */
    @Column(name = "source_type")
    private Boolean sourceType;

    /**
     * 来源公司id 0 系统录入
     */
    @Column(name = "source_id")
    private Integer sourceId;

    /**
     * 客户系统公司编码
     */
    @Column(name = "customer_company_code")
    private String customerCompanyCode;

    private String code;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 是否需要统一账户 1 需要同步 0 不需要同步
     */
    @Column(name = "is_unified")
    private Boolean isUnified;

    /**
     * 统一账户id
     */
    @Column(name = "account_id")
    private Integer accountId;

    /**
     * 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     */
    @Column(name = "review_status")
    private Boolean reviewStatus;

    /**
     * 人工审核id
     */
    @Column(name = "apply_id")
    private Integer applyId;

    /**
     * 获取企业id
     *
     * @return id - 企业id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置企业id
     *
     * @param id 企业id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取企业名称
     *
     * @return name - 企业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置企业名称
     *
     * @param name 企业名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取1企业/2个人
     *
     * @return type - 1企业/2个人
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1企业/2个人
     *
     * @param type 1企业/2个人
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取法人姓名
     *
     * @return legalrep - 法人姓名
     */
    public String getLegalrep() {
        return legalrep;
    }

    /**
     * 设置法人姓名
     *
     * @param legalrep 法人姓名
     */
    public void setLegalrep(String legalrep) {
        this.legalrep = legalrep == null ? null : legalrep.trim();
    }

    /**
     * 获取法人身份证
     *
     * @return legalidcard - 法人身份证
     */
    public String getLegalidcard() {
        return legalidcard;
    }

    /**
     * 设置法人身份证
     *
     * @param legalidcard 法人身份证
     */
    public void setLegalidcard(String legalidcard) {
        this.legalidcard = legalidcard == null ? null : legalidcard.trim();
    }

    /**
     * 获取法人银行账户户名
     *
     * @return legal_bank_name - 法人银行账户户名
     */
    public String getLegalBankName() {
        return legalBankName;
    }

    /**
     * 设置法人银行账户户名
     *
     * @param legalBankName 法人银行账户户名
     */
    public void setLegalBankName(String legalBankName) {
        this.legalBankName = legalBankName == null ? null : legalBankName.trim();
    }

    /**
     * 获取法人银行账号
     *
     * @return legal_bank_account - 法人银行账号
     */
    public String getLegalBankAccount() {
        return legalBankAccount;
    }

    /**
     * 设置法人银行账号
     *
     * @param legalBankAccount 法人银行账号
     */
    public void setLegalBankAccount(String legalBankAccount) {
        this.legalBankAccount = legalBankAccount == null ? null : legalBankAccount.trim();
    }

    /**
     * 获取统一社会信用代码/注册号(原营业执照)
     *
     * @return uniform_social_credit_code - 统一社会信用代码/注册号(原营业执照)
     */
    public String getUniformSocialCreditCode() {
        return uniformSocialCreditCode;
    }

    /**
     * 设置统一社会信用代码/注册号(原营业执照)
     *
     * @param uniformSocialCreditCode 统一社会信用代码/注册号(原营业执照)
     */
    public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
        this.uniformSocialCreditCode = uniformSocialCreditCode == null ? null : uniformSocialCreditCode.trim();
    }

    /**
     * 获取注册资本
     *
     * @return capital - 注册资本
     */
    public String getCapital() {
        return capital;
    }

    /**
     * 设置注册资本
     *
     * @param capital 注册资本
     */
    public void setCapital(String capital) {
        this.capital = capital == null ? null : capital.trim();
    }

    /**
     * 获取公司地址
     *
     * @return address - 公司地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置公司地址
     *
     * @param address 公司地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取公司成立日期
     *
     * @return found_time - 公司成立日期
     */
    public String getFoundTime() {
        return foundTime;
    }

    /**
     * 设置公司成立日期
     *
     * @param foundTime 公司成立日期
     */
    public void setFoundTime(String foundTime) {
        this.foundTime = foundTime == null ? null : foundTime.trim();
    }

    /**
     * 获取营业期限起
     *
     * @return yyqxq - 营业期限起
     */
    public String getYyqxq() {
        return yyqxq;
    }

    /**
     * 设置营业期限起
     *
     * @param yyqxq 营业期限起
     */
    public void setYyqxq(String yyqxq) {
        this.yyqxq = yyqxq == null ? null : yyqxq.trim();
    }

    /**
     * 获取营业期限止
     *
     * @return yyqxz - 营业期限止
     */
    public String getYyqxz() {
        return yyqxz;
    }

    /**
     * 设置营业期限止
     *
     * @param yyqxz 营业期限止
     */
    public void setYyqxz(String yyqxz) {
        this.yyqxz = yyqxz == null ? null : yyqxz.trim();
    }

    /**
     * 获取登记机关
     *
     * @return regplace - 登记机关
     */
    public String getRegplace() {
        return regplace;
    }

    /**
     * 设置登记机关
     *
     * @param regplace 登记机关
     */
    public void setRegplace(String regplace) {
        this.regplace = regplace == null ? null : regplace.trim();
    }

    /**
     * 获取公司联系人姓名
     *
     * @return company_contact_name - 公司联系人姓名
     */
    public String getCompanyContactName() {
        return companyContactName;
    }

    /**
     * 设置公司联系人姓名
     *
     * @param companyContactName 公司联系人姓名
     */
    public void setCompanyContactName(String companyContactName) {
        this.companyContactName = companyContactName == null ? null : companyContactName.trim();
    }

    /**
     * 获取公司联系人手机
     *
     * @return company_contact_mobile - 公司联系人手机
     */
    public String getCompanyContactMobile() {
        return companyContactMobile;
    }

    /**
     * 设置公司联系人手机
     *
     * @param companyContactMobile 公司联系人手机
     */
    public void setCompanyContactMobile(String companyContactMobile) {
        this.companyContactMobile = companyContactMobile == null ? null : companyContactMobile.trim();
    }

    /**
     * 获取公司联系人电子邮箱
     *
     * @return company_contact_email - 公司联系人电子邮箱
     */
    public String getCompanyContactEmail() {
        return companyContactEmail;
    }

    /**
     * 设置公司联系人电子邮箱
     *
     * @param companyContactEmail 公司联系人电子邮箱
     */
    public void setCompanyContactEmail(String companyContactEmail) {
        this.companyContactEmail = companyContactEmail == null ? null : companyContactEmail.trim();
    }

    /**
     * 获取登记状态
     *
     * @return status - 登记状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置登记状态
     *
     * @param status 登记状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取企业邮箱
     *
     * @return email - 企业邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置企业邮箱
     *
     * @param email 企业邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取联系手机号 网签用
     *
     * @return mobile - 联系手机号 网签用
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系手机号 网签用
     *
     * @param mobile 联系手机号 网签用
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取营业执照照片
     *
     * @return yyzzimg - 营业执照照片
     */
    public String getYyzzimg() {
        return yyzzimg;
    }

    /**
     * 设置营业执照照片
     *
     * @param yyzzimg 营业执照照片
     */
    public void setYyzzimg(String yyzzimg) {
        this.yyzzimg = yyzzimg == null ? null : yyzzimg.trim();
    }

    /**
     * 获取组织机构代码
     *
     * @return organization_code - 组织机构代码
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * 设置组织机构代码
     *
     * @param organizationCode 组织机构代码
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    /**
     * 获取税务登记证
     *
     * @return tax_certificate - 税务登记证
     */
    public String getTaxCertificate() {
        return taxCertificate;
    }

    /**
     * 设置税务登记证
     *
     * @param taxCertificate 税务登记证
     */
    public void setTaxCertificate(String taxCertificate) {
        this.taxCertificate = taxCertificate == null ? null : taxCertificate.trim();
    }

    /**
     * 获取发票地址以电话
     *
     * @return invoice_address_phone - 发票地址以电话
     */
    public String getInvoiceAddressPhone() {
        return invoiceAddressPhone;
    }

    /**
     * 设置发票地址以电话
     *
     * @param invoiceAddressPhone 发票地址以电话
     */
    public void setInvoiceAddressPhone(String invoiceAddressPhone) {
        this.invoiceAddressPhone = invoiceAddressPhone == null ? null : invoiceAddressPhone.trim();
    }

    /**
     * 获取发票开户行及账号
     *
     * @return invoice_bank_account - 发票开户行及账号
     */
    public String getInvoiceBankAccount() {
        return invoiceBankAccount;
    }

    /**
     * 设置发票开户行及账号
     *
     * @param invoiceBankAccount 发票开户行及账号
     */
    public void setInvoiceBankAccount(String invoiceBankAccount) {
        this.invoiceBankAccount = invoiceBankAccount == null ? null : invoiceBankAccount.trim();
    }

    /**
     * 获取纳税人类型
     *
     * @return tax_type - 纳税人类型
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * 设置纳税人类型
     *
     * @param taxType 纳税人类型
     */
    public void setTaxType(String taxType) {
        this.taxType = taxType == null ? null : taxType.trim();
    }

    /**
     * 获取发票抬头
     *
     * @return invoice_header - 发票抬头
     */
    public String getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * 设置发票抬头
     *
     * @param invoiceHeader 发票抬头
     */
    public void setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader == null ? null : invoiceHeader.trim();
    }

    /**
     * 获取联系地址
     *
     * @return contact_address - 联系地址
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 设置联系地址
     *
     * @param contactAddress 联系地址
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * 获取额度占用编码(设备,运力)
     *
     * @return plat_bp_code - 额度占用编码(设备,运力)
     */
    public String getPlatBpCode() {
        return platBpCode;
    }

    /**
     * 设置额度占用编码(设备,运力)
     *
     * @param platBpCode 额度占用编码(设备,运力)
     */
    public void setPlatBpCode(String platBpCode) {
        this.platBpCode = platBpCode == null ? null : platBpCode.trim();
    }

    /**
     * 获取对于项目经理编码(设备,运力)
     *
     * @return employee_id - 对于项目经理编码(设备,运力)
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置对于项目经理编码(设备,运力)
     *
     * @param employeeId 对于项目经理编码(设备,运力)
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 获取所属产品线代码
     *
     * @return division - 所属产品线代码
     */
    public Integer getDivision() {
        return division;
    }

    /**
     * 设置所属产品线代码
     *
     * @param division 所属产品线代码
     */
    public void setDivision(Integer division) {
        this.division = division;
    }

    /**
     * 获取商业伙伴名称
     *
     * @return vender_bp_code - 商业伙伴名称
     */
    public String getVenderBpCode() {
        return venderBpCode;
    }

    /**
     * 设置商业伙伴名称
     *
     * @param venderBpCode 商业伙伴名称
     */
    public void setVenderBpCode(String venderBpCode) {
        this.venderBpCode = venderBpCode == null ? null : venderBpCode.trim();
    }

    /**
     * 获取是否设备款收款方0否1是
     *
     * @return payer_flag - 是否设备款收款方0否1是
     */
    public Byte getPayerFlag() {
        return payerFlag;
    }

    /**
     * 设置是否设备款收款方0否1是
     *
     * @param payerFlag 是否设备款收款方0否1是
     */
    public void setPayerFlag(Byte payerFlag) {
        this.payerFlag = payerFlag;
    }

    /**
     * 获取融资类型1形式回租2新品回租3平台收款,可多选
     *
     * @return finance_type - 融资类型1形式回租2新品回租3平台收款,可多选
     */
    public String getFinanceType() {
        return financeType;
    }

    /**
     * 设置融资类型1形式回租2新品回租3平台收款,可多选
     *
     * @param financeType 融资类型1形式回租2新品回租3平台收款,可多选
     */
    public void setFinanceType(String financeType) {
        this.financeType = financeType == null ? null : financeType.trim();
    }

    /**
     * 获取护照编号
     *
     * @return passport - 护照编号
     */
    public String getPassport() {
        return passport;
    }

    /**
     * 设置护照编号
     *
     * @param passport 护照编号
     */
    public void setPassport(String passport) {
        this.passport = passport == null ? null : passport.trim();
    }

    /**
     * 获取护照照片
     *
     * @return passport_img - 护照照片
     */
    public String getPassportImg() {
        return passportImg;
    }

    /**
     * 设置护照照片
     *
     * @param passportImg 护照照片
     */
    public void setPassportImg(String passportImg) {
        this.passportImg = passportImg == null ? null : passportImg.trim();
    }

    /**
     * 获取法人代表身份证号正面照片
     *
     * @return legalrep_id_card_front - 法人代表身份证号正面照片
     */
    public String getLegalrepIdCardFront() {
        return legalrepIdCardFront;
    }

    /**
     * 设置法人代表身份证号正面照片
     *
     * @param legalrepIdCardFront 法人代表身份证号正面照片
     */
    public void setLegalrepIdCardFront(String legalrepIdCardFront) {
        this.legalrepIdCardFront = legalrepIdCardFront == null ? null : legalrepIdCardFront.trim();
    }

    /**
     * 获取法人代表身份证号反面照片
     *
     * @return legalrep_id_card_reverse - 法人代表身份证号反面照片
     */
    public String getLegalrepIdCardReverse() {
        return legalrepIdCardReverse;
    }

    /**
     * 设置法人代表身份证号反面照片
     *
     * @param legalrepIdCardReverse 法人代表身份证号反面照片
     */
    public void setLegalrepIdCardReverse(String legalrepIdCardReverse) {
        this.legalrepIdCardReverse = legalrepIdCardReverse == null ? null : legalrepIdCardReverse.trim();
    }

    /**
     * 获取税务登记证照片
     *
     * @return tax_registration_img - 税务登记证照片
     */
    public String getTaxRegistrationImg() {
        return taxRegistrationImg;
    }

    /**
     * 设置税务登记证照片
     *
     * @param taxRegistrationImg 税务登记证照片
     */
    public void setTaxRegistrationImg(String taxRegistrationImg) {
        this.taxRegistrationImg = taxRegistrationImg == null ? null : taxRegistrationImg.trim();
    }

    /**
     * 获取组织机构代码证照片
     *
     * @return organization_certificate_img - 组织机构代码证照片
     */
    public String getOrganizationCertificateImg() {
        return organizationCertificateImg;
    }

    /**
     * 设置组织机构代码证照片
     *
     * @param organizationCertificateImg 组织机构代码证照片
     */
    public void setOrganizationCertificateImg(String organizationCertificateImg) {
        this.organizationCertificateImg = organizationCertificateImg == null ? null : organizationCertificateImg.trim();
    }

    /**
     * 获取营业执照号码
     *
     * @return business_license_number - 营业执照号码
     */
    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    /**
     * 设置营业执照号码
     *
     * @param businessLicenseNumber 营业执照号码
     */
    public void setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber == null ? null : businessLicenseNumber.trim();
    }

    /**
     * 获取1/老三证，2/新证
     *
     * @return license_type - 1/老三证，2/新证
     */
    public Boolean getLicenseType() {
        return licenseType;
    }

    /**
     * 设置1/老三证，2/新证
     *
     * @param licenseType 1/老三证，2/新证
     */
    public void setLicenseType(Boolean licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * 获取1/身份证，2/护照
     *
     * @return certificate_type - 1/身份证，2/护照
     */
    public Boolean getCertificateType() {
        return certificateType;
    }

    /**
     * 设置1/身份证，2/护照
     *
     * @param certificateType 1/身份证，2/护照
     */
    public void setCertificateType(Boolean certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * 获取实际控制人
     *
     * @return actual_controller_name - 实际控制人
     */
    public String getActualControllerName() {
        return actualControllerName;
    }

    /**
     * 设置实际控制人
     *
     * @param actualControllerName 实际控制人
     */
    public void setActualControllerName(String actualControllerName) {
        this.actualControllerName = actualControllerName == null ? null : actualControllerName.trim();
    }

    /**
     * 获取实际控制人证件类型
     *
     * @return actual_controller_id_type - 实际控制人证件类型
     */
    public Boolean getActualControllerIdType() {
        return actualControllerIdType;
    }

    /**
     * 设置实际控制人证件类型
     *
     * @param actualControllerIdType 实际控制人证件类型
     */
    public void setActualControllerIdType(Boolean actualControllerIdType) {
        this.actualControllerIdType = actualControllerIdType;
    }

    /**
     * 获取实际控制人证件号码
     *
     * @return actual_controller_id_no - 实际控制人证件号码
     */
    public String getActualControllerIdNo() {
        return actualControllerIdNo;
    }

    /**
     * 设置实际控制人证件号码
     *
     * @param actualControllerIdNo 实际控制人证件号码
     */
    public void setActualControllerIdNo(String actualControllerIdNo) {
        this.actualControllerIdNo = actualControllerIdNo == null ? null : actualControllerIdNo.trim();
    }

    /**
     * @return is_real_name
     */
    public Boolean getIsRealName() {
        return isRealName;
    }

    /**
     * @param isRealName
     */
    public void setIsRealName(Boolean isRealName) {
        this.isRealName = isRealName;
    }

    /**
     * 获取审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     *
     * @return audit_status - 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    public Boolean getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     *
     * @param auditStatus 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    public void setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取来源类型 0系统录入 1接口 2web端
     *
     * @return source_type - 来源类型 0系统录入 1接口 2web端
     */
    public Boolean getSourceType() {
        return sourceType;
    }

    /**
     * 设置来源类型 0系统录入 1接口 2web端
     *
     * @param sourceType 来源类型 0系统录入 1接口 2web端
     */
    public void setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取来源公司id 0 系统录入
     *
     * @return source_id - 来源公司id 0 系统录入
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * 设置来源公司id 0 系统录入
     *
     * @param sourceId 来源公司id 0 系统录入
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取客户系统公司编码
     *
     * @return customer_company_code - 客户系统公司编码
     */
    public String getCustomerCompanyCode() {
        return customerCompanyCode;
    }

    /**
     * 设置客户系统公司编码
     *
     * @param customerCompanyCode 客户系统公司编码
     */
    public void setCustomerCompanyCode(String customerCompanyCode) {
        this.customerCompanyCode = customerCompanyCode == null ? null : customerCompanyCode.trim();
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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
     * 获取是否需要统一账户 1 需要同步 0 不需要同步
     *
     * @return is_unified - 是否需要统一账户 1 需要同步 0 不需要同步
     */
    public Boolean getIsUnified() {
        return isUnified;
    }

    /**
     * 设置是否需要统一账户 1 需要同步 0 不需要同步
     *
     * @param isUnified 是否需要统一账户 1 需要同步 0 不需要同步
     */
    public void setIsUnified(Boolean isUnified) {
        this.isUnified = isUnified;
    }

    /**
     * 获取统一账户id
     *
     * @return account_id - 统一账户id
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 设置统一账户id
     *
     * @param accountId 统一账户id
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     *
     * @return review_status - 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     */
    public Boolean getReviewStatus() {
        return reviewStatus;
    }

    /**
     * 设置0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     *
     * @param reviewStatus 0 未申请人工审核  1 人工审核审批中 2 通过  9 拒绝
     */
    public void setReviewStatus(Boolean reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * 获取人工审核id
     *
     * @return apply_id - 人工审核id
     */
    public Integer getApplyId() {
        return applyId;
    }

    /**
     * 设置人工审核id
     *
     * @param applyId 人工审核id
     */
    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }
}