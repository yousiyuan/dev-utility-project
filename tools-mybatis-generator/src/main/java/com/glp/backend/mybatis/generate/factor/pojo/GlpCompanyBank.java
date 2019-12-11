package com.glp.backend.mybatis.generate.factor.pojo;

import com.glp.backend.risk.tools.entity.BaseEntity;

public class GlpCompanyBank extends BaseEntity {
    /**
     * 
     * 表字段 : glp_company_bank.id
     */
    private Integer id;

    /**
     * 企业ID
     * 表字段 : glp_company_bank.enterprise_id
     */
    private Integer enterpriseId;

    /**
     * 户名
     * 表字段 : glp_company_bank.back_username
     */
    private String backUsername;

    /**
     * 银行卡号
     * 表字段 : glp_company_bank.back_number
     */
    private String backNumber;

    /**
     * 开户行
     * 表字段 : glp_company_bank.back_name
     */
    private String backName;

    /**
     * 银行代号
     * 表字段 : glp_company_bank.bankCode
     */
    private String bankcode;

    /**
     * 开户支行
     * 表字段 : glp_company_bank.back_filiale
     */
    private String backFiliale;

    /**
     * 银行支行号
     * 表字段 : glp_company_bank.branchNo
     */
    private String branchno;

    /**
     * 省份
     * 表字段 : glp_company_bank.provName
     */
    private String provname;

    /**
     * 省份ID
     * 表字段 : glp_company_bank.provId
     */
    private Integer provid;

    /**
     * 城市
     * 表字段 : glp_company_bank.cityName
     */
    private String cityname;

    /**
     * 城市ID
     * 表字段 : glp_company_bank.cityId
     */
    private Integer cityid;

    /**
     * 实体户名
     * 表字段 : glp_company_bank.instance_name
     */
    private String instanceName;

    /**
     * 实体账号
     * 表字段 : glp_company_bank.instance_number
     */
    private String instanceNumber;

    /**
     * 实体银行参数
     * 表字段 : glp_company_bank.instance_bank_extension
     */
    private String instanceBankExtension;

    /**
     * 维金注册名
     * 表字段 : glp_company_bank.wj_loginName
     */
    private String wjLoginname;

    /**
     * 维金用户名类型
     * 表字段 : glp_company_bank.wj_loginType
     */
    private String wjLogintype;

    /**
     * 维金用户返回ID	
     * 表字段 : glp_company_bank.wj_member_id
     */
    private String wjMemberId;

    /**
     * 维金户号
     * 表字段 : glp_company_bank.wj_account_id
     */
    private String wjAccountId;

    /**
     * 
     * 表字段 : glp_company_bank.create_time
     */
    private Integer createTime;

    /**
     * 
     * 表字段 : glp_company_bank.update_time
     */
    private Integer updateTime;

    /**
     * 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     * 表字段 : glp_company_bank.type
     */
    private Boolean type;

    /**
     * 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     * 表字段 : glp_company_bank.use_type
     */
    private Boolean useType;

    /**
     * 1/未激活，2/已激活
     * 表字段 : glp_company_bank.status
     */
    private Boolean status;

    /**
     * 公司id
     * 表字段 : glp_company_bank.company_id
     */
    private Integer companyId;

    /**
     * 来源类型 0系统录入 1接口 2web端
     * 表字段 : glp_company_bank.source_type
     */
    private Boolean sourceType;

    /**
     * 来源公司id 0系统录入
     * 表字段 : glp_company_bank.source_id
     */
    private Integer sourceId;

    /**
     * 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     * 表字段 : glp_company_bank.audit_status
     */
    private Boolean auditStatus;

    /**
     * 客户补录 否:0 是:1 
     * 表字段 : glp_company_bank.is_supplement
     */
    private Boolean isSupplement;

    /**
     * 队列任务ID ：  默认为0
     * 表字段 : glp_company_bank.manualpullWater_queueId
     */
    private Integer manualpullwaterQueueid;

    /**
     * 获取  字段:glp_company_bank.id
     *
     * @return glp_company_bank.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:glp_company_bank.id
     *
     * @param id the value for glp_company_bank.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 企业ID 字段:glp_company_bank.enterprise_id
     *
     * @return glp_company_bank.enterprise_id, 企业ID
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置 企业ID 字段:glp_company_bank.enterprise_id
     *
     * @param enterpriseId the value for glp_company_bank.enterprise_id, 企业ID
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取 户名 字段:glp_company_bank.back_username
     *
     * @return glp_company_bank.back_username, 户名
     */
    public String getBackUsername() {
        return backUsername;
    }

    /**
     * 设置 户名 字段:glp_company_bank.back_username
     *
     * @param backUsername the value for glp_company_bank.back_username, 户名
     */
    public void setBackUsername(String backUsername) {
        this.backUsername = backUsername == null ? null : backUsername.trim();
    }

    /**
     * 获取 银行卡号 字段:glp_company_bank.back_number
     *
     * @return glp_company_bank.back_number, 银行卡号
     */
    public String getBackNumber() {
        return backNumber;
    }

    /**
     * 设置 银行卡号 字段:glp_company_bank.back_number
     *
     * @param backNumber the value for glp_company_bank.back_number, 银行卡号
     */
    public void setBackNumber(String backNumber) {
        this.backNumber = backNumber == null ? null : backNumber.trim();
    }

    /**
     * 获取 开户行 字段:glp_company_bank.back_name
     *
     * @return glp_company_bank.back_name, 开户行
     */
    public String getBackName() {
        return backName;
    }

    /**
     * 设置 开户行 字段:glp_company_bank.back_name
     *
     * @param backName the value for glp_company_bank.back_name, 开户行
     */
    public void setBackName(String backName) {
        this.backName = backName == null ? null : backName.trim();
    }

    /**
     * 获取 银行代号 字段:glp_company_bank.bankCode
     *
     * @return glp_company_bank.bankCode, 银行代号
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * 设置 银行代号 字段:glp_company_bank.bankCode
     *
     * @param bankcode the value for glp_company_bank.bankCode, 银行代号
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }

    /**
     * 获取 开户支行 字段:glp_company_bank.back_filiale
     *
     * @return glp_company_bank.back_filiale, 开户支行
     */
    public String getBackFiliale() {
        return backFiliale;
    }

    /**
     * 设置 开户支行 字段:glp_company_bank.back_filiale
     *
     * @param backFiliale the value for glp_company_bank.back_filiale, 开户支行
     */
    public void setBackFiliale(String backFiliale) {
        this.backFiliale = backFiliale == null ? null : backFiliale.trim();
    }

    /**
     * 获取 银行支行号 字段:glp_company_bank.branchNo
     *
     * @return glp_company_bank.branchNo, 银行支行号
     */
    public String getBranchno() {
        return branchno;
    }

    /**
     * 设置 银行支行号 字段:glp_company_bank.branchNo
     *
     * @param branchno the value for glp_company_bank.branchNo, 银行支行号
     */
    public void setBranchno(String branchno) {
        this.branchno = branchno == null ? null : branchno.trim();
    }

    /**
     * 获取 省份 字段:glp_company_bank.provName
     *
     * @return glp_company_bank.provName, 省份
     */
    public String getProvname() {
        return provname;
    }

    /**
     * 设置 省份 字段:glp_company_bank.provName
     *
     * @param provname the value for glp_company_bank.provName, 省份
     */
    public void setProvname(String provname) {
        this.provname = provname == null ? null : provname.trim();
    }

    /**
     * 获取 省份ID 字段:glp_company_bank.provId
     *
     * @return glp_company_bank.provId, 省份ID
     */
    public Integer getProvid() {
        return provid;
    }

    /**
     * 设置 省份ID 字段:glp_company_bank.provId
     *
     * @param provid the value for glp_company_bank.provId, 省份ID
     */
    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    /**
     * 获取 城市 字段:glp_company_bank.cityName
     *
     * @return glp_company_bank.cityName, 城市
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * 设置 城市 字段:glp_company_bank.cityName
     *
     * @param cityname the value for glp_company_bank.cityName, 城市
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * 获取 城市ID 字段:glp_company_bank.cityId
     *
     * @return glp_company_bank.cityId, 城市ID
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * 设置 城市ID 字段:glp_company_bank.cityId
     *
     * @param cityid the value for glp_company_bank.cityId, 城市ID
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    /**
     * 获取 实体户名 字段:glp_company_bank.instance_name
     *
     * @return glp_company_bank.instance_name, 实体户名
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * 设置 实体户名 字段:glp_company_bank.instance_name
     *
     * @param instanceName the value for glp_company_bank.instance_name, 实体户名
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }

    /**
     * 获取 实体账号 字段:glp_company_bank.instance_number
     *
     * @return glp_company_bank.instance_number, 实体账号
     */
    public String getInstanceNumber() {
        return instanceNumber;
    }

    /**
     * 设置 实体账号 字段:glp_company_bank.instance_number
     *
     * @param instanceNumber the value for glp_company_bank.instance_number, 实体账号
     */
    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber == null ? null : instanceNumber.trim();
    }

    /**
     * 获取 实体银行参数 字段:glp_company_bank.instance_bank_extension
     *
     * @return glp_company_bank.instance_bank_extension, 实体银行参数
     */
    public String getInstanceBankExtension() {
        return instanceBankExtension;
    }

    /**
     * 设置 实体银行参数 字段:glp_company_bank.instance_bank_extension
     *
     * @param instanceBankExtension the value for glp_company_bank.instance_bank_extension, 实体银行参数
     */
    public void setInstanceBankExtension(String instanceBankExtension) {
        this.instanceBankExtension = instanceBankExtension == null ? null : instanceBankExtension.trim();
    }

    /**
     * 获取 维金注册名 字段:glp_company_bank.wj_loginName
     *
     * @return glp_company_bank.wj_loginName, 维金注册名
     */
    public String getWjLoginname() {
        return wjLoginname;
    }

    /**
     * 设置 维金注册名 字段:glp_company_bank.wj_loginName
     *
     * @param wjLoginname the value for glp_company_bank.wj_loginName, 维金注册名
     */
    public void setWjLoginname(String wjLoginname) {
        this.wjLoginname = wjLoginname == null ? null : wjLoginname.trim();
    }

    /**
     * 获取 维金用户名类型 字段:glp_company_bank.wj_loginType
     *
     * @return glp_company_bank.wj_loginType, 维金用户名类型
     */
    public String getWjLogintype() {
        return wjLogintype;
    }

    /**
     * 设置 维金用户名类型 字段:glp_company_bank.wj_loginType
     *
     * @param wjLogintype the value for glp_company_bank.wj_loginType, 维金用户名类型
     */
    public void setWjLogintype(String wjLogintype) {
        this.wjLogintype = wjLogintype == null ? null : wjLogintype.trim();
    }

    /**
     * 获取 维金用户返回ID	 字段:glp_company_bank.wj_member_id
     *
     * @return glp_company_bank.wj_member_id, 维金用户返回ID	
     */
    public String getWjMemberId() {
        return wjMemberId;
    }

    /**
     * 设置 维金用户返回ID	 字段:glp_company_bank.wj_member_id
     *
     * @param wjMemberId the value for glp_company_bank.wj_member_id, 维金用户返回ID	
     */
    public void setWjMemberId(String wjMemberId) {
        this.wjMemberId = wjMemberId == null ? null : wjMemberId.trim();
    }

    /**
     * 获取 维金户号 字段:glp_company_bank.wj_account_id
     *
     * @return glp_company_bank.wj_account_id, 维金户号
     */
    public String getWjAccountId() {
        return wjAccountId;
    }

    /**
     * 设置 维金户号 字段:glp_company_bank.wj_account_id
     *
     * @param wjAccountId the value for glp_company_bank.wj_account_id, 维金户号
     */
    public void setWjAccountId(String wjAccountId) {
        this.wjAccountId = wjAccountId == null ? null : wjAccountId.trim();
    }

    /**
     * 获取  字段:glp_company_bank.create_time
     *
     * @return glp_company_bank.create_time, 
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置  字段:glp_company_bank.create_time
     *
     * @param createTime the value for glp_company_bank.create_time, 
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:glp_company_bank.update_time
     *
     * @return glp_company_bank.update_time, 
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置  字段:glp_company_bank.update_time
     *
     * @param updateTime the value for glp_company_bank.update_time, 
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户 字段:glp_company_bank.type
     *
     * @return glp_company_bank.type, 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户 字段:glp_company_bank.type
     *
     * @param type the value for glp_company_bank.type, 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * 获取 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户  字段:glp_company_bank.use_type
     *
     * @return glp_company_bank.use_type, 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     */
    public Boolean getUseType() {
        return useType;
    }

    /**
     * 设置 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户  字段:glp_company_bank.use_type
     *
     * @param useType the value for glp_company_bank.use_type, 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     */
    public void setUseType(Boolean useType) {
        this.useType = useType;
    }

    /**
     * 获取 1/未激活，2/已激活 字段:glp_company_bank.status
     *
     * @return glp_company_bank.status, 1/未激活，2/已激活
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置 1/未激活，2/已激活 字段:glp_company_bank.status
     *
     * @param status the value for glp_company_bank.status, 1/未激活，2/已激活
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取 公司id 字段:glp_company_bank.company_id
     *
     * @return glp_company_bank.company_id, 公司id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置 公司id 字段:glp_company_bank.company_id
     *
     * @param companyId the value for glp_company_bank.company_id, 公司id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取 来源类型 0系统录入 1接口 2web端 字段:glp_company_bank.source_type
     *
     * @return glp_company_bank.source_type, 来源类型 0系统录入 1接口 2web端
     */
    public Boolean getSourceType() {
        return sourceType;
    }

    /**
     * 设置 来源类型 0系统录入 1接口 2web端 字段:glp_company_bank.source_type
     *
     * @param sourceType the value for glp_company_bank.source_type, 来源类型 0系统录入 1接口 2web端
     */
    public void setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取 来源公司id 0系统录入 字段:glp_company_bank.source_id
     *
     * @return glp_company_bank.source_id, 来源公司id 0系统录入
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * 设置 来源公司id 0系统录入 字段:glp_company_bank.source_id
     *
     * @param sourceId the value for glp_company_bank.source_id, 来源公司id 0系统录入
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回 字段:glp_company_bank.audit_status
     *
     * @return glp_company_bank.audit_status, 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    public Boolean getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回 字段:glp_company_bank.audit_status
     *
     * @param auditStatus the value for glp_company_bank.audit_status, 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    public void setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取 客户补录 否:0 是:1  字段:glp_company_bank.is_supplement
     *
     * @return glp_company_bank.is_supplement, 客户补录 否:0 是:1 
     */
    public Boolean getIsSupplement() {
        return isSupplement;
    }

    /**
     * 设置 客户补录 否:0 是:1  字段:glp_company_bank.is_supplement
     *
     * @param isSupplement the value for glp_company_bank.is_supplement, 客户补录 否:0 是:1 
     */
    public void setIsSupplement(Boolean isSupplement) {
        this.isSupplement = isSupplement;
    }

    /**
     * 获取 队列任务ID ：  默认为0 字段:glp_company_bank.manualpullWater_queueId
     *
     * @return glp_company_bank.manualpullWater_queueId, 队列任务ID ：  默认为0
     */
    public Integer getManualpullwaterQueueid() {
        return manualpullwaterQueueid;
    }

    /**
     * 设置 队列任务ID ：  默认为0 字段:glp_company_bank.manualpullWater_queueId
     *
     * @param manualpullwaterQueueid the value for glp_company_bank.manualpullWater_queueId, 队列任务ID ：  默认为0
     */
    public void setManualpullwaterQueueid(Integer manualpullwaterQueueid) {
        this.manualpullwaterQueueid = manualpullwaterQueueid;
    }
}