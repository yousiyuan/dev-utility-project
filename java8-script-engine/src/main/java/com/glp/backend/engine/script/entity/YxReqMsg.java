package com.glp.backend.engine.script.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class YxReqMsg {
    /**
     * 事务ID，每条记录 uuid()
     */
    @JsonProperty("tid")
    private String tid;
    /**
     * 数据源，例如yy或xd(云柚或鑫达)
     */
    @JsonProperty("data_source")
    private String dataSource;
    /**
     * 业务名称，例如yy_data_active_yx或xd_data_active_yx（有效数据）
     */
    @JsonProperty("business_name")
    private String businessName;
    /**
     * 记录创建时间YYYY-MM-DD HH24:MI:SS
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * data数组长度
     */
    @JsonProperty("size")
    private Integer size;
    /**
     * 业务类型：glp_factor
     */
    @JsonProperty("business_type")
    private String businessType;
    /**
     * 数据填装在data中，数据结构详见各模块
     */
    @JsonProperty("data")
    private List<YxReqMsgData> data;

    public static YxReqMsg newObject(YxReqMsg object) {
        YxReqMsg yxReqMsg = new YxReqMsg();
        yxReqMsg.setTid(object.getTid());
        yxReqMsg.setDataSource(object.getDataSource());
        yxReqMsg.setBusinessName(object.getBusinessName());
        yxReqMsg.setCreateTime(object.getCreateTime());
        yxReqMsg.setSize(object.getSize());
        yxReqMsg.setBusinessType(object.getBusinessType());
        yxReqMsg.setData(new ArrayList<>());
        return yxReqMsg;
    }
}
