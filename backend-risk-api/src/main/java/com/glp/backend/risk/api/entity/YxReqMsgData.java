package com.glp.backend.risk.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class YxReqMsgData {
    @JsonProperty("source_id")
    private String sourceId;
    @JsonProperty("depart_car_id")
    private String departCarId;
    @JsonProperty("basic_debt_amt")
    private String basicDebtAmt;
    @JsonProperty("recive_time")
    private String reciveTime;
    @JsonProperty("number_plate")
    private String numberPlate;
    @JsonProperty("origin_province")
    private String originProvince;
    @JsonProperty("origin_city")
    private String originCity;
    @JsonProperty("origin_district")
    private String originDistrict;
    @JsonProperty("driving_time")
    private String drivingTime;
    @JsonProperty("destination_province")
    private String destinationProvince;
    @JsonProperty("destination_city")
    private String destinationCity;
    @JsonProperty("destination_district")
    private String destinationDistrict;
    @JsonProperty("arrival_time")
    private String arrivalTime;
    @JsonProperty("buyer")
    private String buyer;
    @JsonProperty("seller")
    private String seller;
}
