package org.artemis.sparrow.entity;

import javax.persistence.*;

@Table(name = "glp_company_bank")
public class GlpCompanyBank {
    @Id
    private Integer id;

    /**
     * 企业ID
     */
    @Column(name = "enterprise_id")
    private Integer enterpriseId;

    /**
     * 户名
     */
    @Column(name = "back_username")
    private String backUsername;

    /**
     * 银行卡号
     */
    @Column(name = "back_number")
    private String backNumber;

    /**
     * 开户行
     */
    @Column(name = "back_name")
    private String backName;

    /**
     * 银行代号
     */
    @Column(name = "bankCode")
    private String bankcode;

    /**
     * 开户支行
     */
    @Column(name = "back_filiale")
    private String backFiliale;

    /**
     * 银行支行号
     */
    @Column(name = "branchNo")
    private String branchno;

    /**
     * 省份
     */
    @Column(name = "provName")
    private String provname;

    /**
     * 省份ID
     */
    @Column(name = "provId")
    private Integer provid;

    /**
     * 城市
     */
    @Column(name = "cityName")
    private String cityname;

    /**
     * 城市ID
     */
    @Column(name = "cityId")
    private Integer cityid;

    /**
     * 实体户名
     */
    @Column(name = "instance_name")
    private String instanceName;

    /**
     * 实体账号
     */
    @Column(name = "instance_number")
    private String instanceNumber;

    /**
     * 实体银行参数
     */
    @Column(name = "instance_bank_extension")
    private String instanceBankExtension;

    /**
     * 维金注册名
     */
    @Column(name = "wj_loginName")
    private String wjLoginname;

    /**
     * 维金用户名类型
     */
    @Column(name = "wj_loginType")
    private String wjLogintype;

    /**
     * 维金用户返回ID	
     */
    @Column(name = "wj_member_id")
    private String wjMemberId;

    /**
     * 维金户号
     */
    @Column(name = "wj_account_id")
    private String wjAccountId;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     */
    private Boolean type;

    /**
     * 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     */
    @Column(name = "use_type")
    private Boolean useType;

    /**
     * 1/未激活，2/已激活
     */
    private Boolean status;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 来源类型 0系统录入 1接口 2web端
     */
    @Column(name = "source_type")
    private Boolean sourceType;

    /**
     * 来源公司id 0系统录入
     */
    @Column(name = "source_id")
    private Integer sourceId;

    /**
     * 审核状态 1 待提交审核 2 待审核 3 审核通过 4审核驳回
     */
    @Column(name = "audit_status")
    private Boolean auditStatus;

    /**
     * 客户补录 否:0 是:1 
     */
    @Column(name = "is_supplement")
    private Boolean isSupplement;

    /**
     * 队列任务ID ：  默认为0
     */
    @Column(name = "manualpullWater_queueId")
    private Integer manualpullwaterQueueid;

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
     * 获取企业ID
     *
     * @return enterprise_id - 企业ID
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置企业ID
     *
     * @param enterpriseId 企业ID
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取户名
     *
     * @return back_username - 户名
     */
    public String getBackUsername() {
        return backUsername;
    }

    /**
     * 设置户名
     *
     * @param backUsername 户名
     */
    public void setBackUsername(String backUsername) {
        this.backUsername = backUsername == null ? null : backUsername.trim();
    }

    /**
     * 获取银行卡号
     *
     * @return back_number - 银行卡号
     */
    public String getBackNumber() {
        return backNumber;
    }

    /**
     * 设置银行卡号
     *
     * @param backNumber 银行卡号
     */
    public void setBackNumber(String backNumber) {
        this.backNumber = backNumber == null ? null : backNumber.trim();
    }

    /**
     * 获取开户行
     *
     * @return back_name - 开户行
     */
    public String getBackName() {
        return backName;
    }

    /**
     * 设置开户行
     *
     * @param backName 开户行
     */
    public void setBackName(String backName) {
        this.backName = backName == null ? null : backName.trim();
    }

    /**
     * 获取银行代号
     *
     * @return bankCode - 银行代号
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * 设置银行代号
     *
     * @param bankcode 银行代号
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }

    /**
     * 获取开户支行
     *
     * @return back_filiale - 开户支行
     */
    public String getBackFiliale() {
        return backFiliale;
    }

    /**
     * 设置开户支行
     *
     * @param backFiliale 开户支行
     */
    public void setBackFiliale(String backFiliale) {
        this.backFiliale = backFiliale == null ? null : backFiliale.trim();
    }

    /**
     * 获取银行支行号
     *
     * @return branchNo - 银行支行号
     */
    public String getBranchno() {
        return branchno;
    }

    /**
     * 设置银行支行号
     *
     * @param branchno 银行支行号
     */
    public void setBranchno(String branchno) {
        this.branchno = branchno == null ? null : branchno.trim();
    }

    /**
     * 获取省份
     *
     * @return provName - 省份
     */
    public String getProvname() {
        return provname;
    }

    /**
     * 设置省份
     *
     * @param provname 省份
     */
    public void setProvname(String provname) {
        this.provname = provname == null ? null : provname.trim();
    }

    /**
     * 获取省份ID
     *
     * @return provId - 省份ID
     */
    public Integer getProvid() {
        return provid;
    }

    /**
     * 设置省份ID
     *
     * @param provid 省份ID
     */
    public void setProvid(Integer provid) {
        this.provid = provid;
    }

    /**
     * 获取城市
     *
     * @return cityName - 城市
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * 设置城市
     *
     * @param cityname 城市
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * 获取城市ID
     *
     * @return cityId - 城市ID
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * 设置城市ID
     *
     * @param cityid 城市ID
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    /**
     * 获取实体户名
     *
     * @return instance_name - 实体户名
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * 设置实体户名
     *
     * @param instanceName 实体户名
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }

    /**
     * 获取实体账号
     *
     * @return instance_number - 实体账号
     */
    public String getInstanceNumber() {
        return instanceNumber;
    }

    /**
     * 设置实体账号
     *
     * @param instanceNumber 实体账号
     */
    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber == null ? null : instanceNumber.trim();
    }

    /**
     * 获取实体银行参数
     *
     * @return instance_bank_extension - 实体银行参数
     */
    public String getInstanceBankExtension() {
        return instanceBankExtension;
    }

    /**
     * 设置实体银行参数
     *
     * @param instanceBankExtension 实体银行参数
     */
    public void setInstanceBankExtension(String instanceBankExtension) {
        this.instanceBankExtension = instanceBankExtension == null ? null : instanceBankExtension.trim();
    }

    /**
     * 获取维金注册名
     *
     * @return wj_loginName - 维金注册名
     */
    public String getWjLoginname() {
        return wjLoginname;
    }

    /**
     * 设置维金注册名
     *
     * @param wjLoginname 维金注册名
     */
    public void setWjLoginname(String wjLoginname) {
        this.wjLoginname = wjLoginname == null ? null : wjLoginname.trim();
    }

    /**
     * 获取维金用户名类型
     *
     * @return wj_loginType - 维金用户名类型
     */
    public String getWjLogintype() {
        return wjLogintype;
    }

    /**
     * 设置维金用户名类型
     *
     * @param wjLogintype 维金用户名类型
     */
    public void setWjLogintype(String wjLogintype) {
        this.wjLogintype = wjLogintype == null ? null : wjLogintype.trim();
    }

    /**
     * 获取维金用户返回ID	
     *
     * @return wj_member_id - 维金用户返回ID	
     */
    public String getWjMemberId() {
        return wjMemberId;
    }

    /**
     * 设置维金用户返回ID	
     *
     * @param wjMemberId 维金用户返回ID	
     */
    public void setWjMemberId(String wjMemberId) {
        this.wjMemberId = wjMemberId == null ? null : wjMemberId.trim();
    }

    /**
     * 获取维金户号
     *
     * @return wj_account_id - 维金户号
     */
    public String getWjAccountId() {
        return wjAccountId;
    }

    /**
     * 设置维金户号
     *
     * @param wjAccountId 维金户号
     */
    public void setWjAccountId(String wjAccountId) {
        this.wjAccountId = wjAccountId == null ? null : wjAccountId.trim();
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
     * 获取1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     *
     * @return type - 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     *
     * @param type 1/实名账户，2/浦发虚账户 3/广发虚账户 4/浦发E账通账户
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * 获取账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     *
     * @return use_type - 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     */
    public Boolean getUseType() {
        return useType;
    }

    /**
     * 设置账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     *
     * @param useType 账户用途 1收款账户 2 还款账户 3 翻单账户 4 代偿账户 5保证金账户 
     */
    public void setUseType(Boolean useType) {
        this.useType = useType;
    }

    /**
     * 获取1/未激活，2/已激活
     *
     * @return status - 1/未激活，2/已激活
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置1/未激活，2/已激活
     *
     * @param status 1/未激活，2/已激活
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取公司id
     *
     * @return company_id - 公司id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司id
     *
     * @param companyId 公司id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
     * 获取来源公司id 0系统录入
     *
     * @return source_id - 来源公司id 0系统录入
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * 设置来源公司id 0系统录入
     *
     * @param sourceId 来源公司id 0系统录入
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
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
     * 获取客户补录 否:0 是:1 
     *
     * @return is_supplement - 客户补录 否:0 是:1 
     */
    public Boolean getIsSupplement() {
        return isSupplement;
    }

    /**
     * 设置客户补录 否:0 是:1 
     *
     * @param isSupplement 客户补录 否:0 是:1 
     */
    public void setIsSupplement(Boolean isSupplement) {
        this.isSupplement = isSupplement;
    }

    /**
     * 获取队列任务ID ：  默认为0
     *
     * @return manualpullWater_queueId - 队列任务ID ：  默认为0
     */
    public Integer getManualpullwaterQueueid() {
        return manualpullwaterQueueid;
    }

    /**
     * 设置队列任务ID ：  默认为0
     *
     * @param manualpullwaterQueueid 队列任务ID ：  默认为0
     */
    public void setManualpullwaterQueueid(Integer manualpullwaterQueueid) {
        this.manualpullwaterQueueid = manualpullwaterQueueid;
    }
}