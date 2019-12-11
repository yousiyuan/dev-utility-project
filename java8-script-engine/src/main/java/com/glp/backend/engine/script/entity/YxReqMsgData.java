package com.glp.backend.engine.script.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class YxReqMsgData {
    /**
     * 债权编码 对应字段是SearchCode，也就是RowKey，即 产品编码|项目编码|统一社会信用代码|发车单号
     */
    @JsonProperty("code")
    private String code;
    /**
     * 渠道ID
     */
    @JsonProperty("source_id")
    private String sourceId;
    /**
     * 发车单ID
     */
    @JsonProperty("departure_id")
    private String departureId;
    /**
     * 基础债权金额
     */
    @JsonProperty("freight_amount")
    private String freightAmount;
    /**
     * 基础债权生效时间
     */
    @JsonProperty("reptile_create_time")
    private String reptileCreateTime;
    /**
     * 基础债权失效时间
     */
    @JsonProperty("reptile_invalid_time")
    private String reptileInvalidTime;
    /**
     * 车牌号
     */
    @JsonProperty("carnum")
    private String carNum;
    /**
     * 始发地省
     */
    @JsonProperty("originating_province")
    private String originatingProvince;
    /**
     * 始发地市
     */
    @JsonProperty("originating_market")
    private String originatingMarket;
    /**
     * 始发地区
     */
    @JsonProperty("originating_area")
    private String originatingArea;
    /**
     * 发车时间
     */
    @JsonProperty("start_time_origin")
    private String startTimeOrigin;
    /**
     * 目的地省
     */
    @JsonProperty("destination_province")
    private String destinationProvince;
    /**
     * 目的地市
     */
    @JsonProperty("destination_city")
    private String destinationCity;
    /**
     * 目的地区
     */
    @JsonProperty("destination_region")
    private String destinationRegion;
    /**
     * 到达时间
     */
    @JsonProperty("destination_arrival_time")
    private String destinationArrivalTime;
    /**
     * 买方
     */
    @JsonProperty("buyer")
    private String buyer;
    /**
     * 卖方
     */
    @JsonProperty("seller")
    private String seller;
    /**
     * 项目编码
     */
    @JsonProperty("project_code")
    private String projectCode;
    /**
     * 社会统一信用代码
     */
    @JsonProperty("certificate_id")
    private String certificateId;
    /**
     * 司机电话
     */
    @JsonProperty("driver_telephone")
    private String mobileNo;
    /**
     * 运单id
     */
    @JsonProperty("waybill_id")
    private String wayBillNo;
    /**
     * 通过数据有效性检验：Y,不通过：N
     */
    @JsonProperty("dw_active_flag")
    private String dwActiveFlag;

    public static YxReqMsgData newObject(YxReqMsgData object) {
        YxReqMsgData yxReqMsgData = new YxReqMsgData();
        yxReqMsgData.setCode(null);
        yxReqMsgData.setSourceId(object.getSourceId());
        yxReqMsgData.setDepartureId(object.getDepartureId());
        yxReqMsgData.setFreightAmount(object.getFreightAmount());
        yxReqMsgData.setReptileCreateTime(object.getReptileCreateTime());
        yxReqMsgData.setReptileInvalidTime(object.getReptileInvalidTime());
        yxReqMsgData.setCarNum(object.getCarNum());
        yxReqMsgData.setOriginatingProvince(object.getOriginatingProvince());
        yxReqMsgData.setOriginatingMarket(object.getOriginatingMarket());
        yxReqMsgData.setOriginatingArea(object.getOriginatingArea());
        yxReqMsgData.setStartTimeOrigin(object.getStartTimeOrigin());
        yxReqMsgData.setDestinationProvince(object.getDestinationProvince());
        yxReqMsgData.setDestinationCity(object.getDestinationCity());
        yxReqMsgData.setDestinationRegion(object.getDestinationRegion());
        yxReqMsgData.setDestinationArrivalTime(object.getDestinationArrivalTime());
        yxReqMsgData.setBuyer(object.getBuyer());
        yxReqMsgData.setSeller(object.getSeller());
        yxReqMsgData.setProjectCode(object.getProjectCode());
        yxReqMsgData.setCertificateId(object.getCertificateId());
        yxReqMsgData.setMobileNo(object.getMobileNo());
        yxReqMsgData.setWayBillNo(object.getWayBillNo());
        yxReqMsgData.setDwActiveFlag(object.getDwActiveFlag());
        return yxReqMsgData;
    }
}
