package com.glp.backend.risk.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class YxReqMsg {
    @JsonProperty("tid")
    private String tid;
    @JsonProperty("data_source")
    private String dataSource;
    @JsonProperty("business_name")
    private String businessName;
    @JsonProperty("create_time")
    private String createTime;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("business_type")
    private String businessType;
    @JsonProperty("data")
    private List<YxReqMsgData> data ;
}
