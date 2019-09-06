package com.mc.moonfallapi.vo;

public class CommodityType {
    private String id;

    private String commodityTypeNo;

    private String commodityTypeName;

    private Integer commodityTypeDeleteFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommodityTypeNo() {
        return commodityTypeNo;
    }

    public void setCommodityTypeNo(String commodityTypeNo) {
        this.commodityTypeNo = commodityTypeNo == null ? null : commodityTypeNo.trim();
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName == null ? null : commodityTypeName.trim();
    }

    public Integer getCommodityTypeDeleteFlag() {
        return commodityTypeDeleteFlag;
    }

    public void setCommodityTypeDeleteFlag(Integer commodityTypeDeleteFlag) {
        this.commodityTypeDeleteFlag = commodityTypeDeleteFlag;
    }
}