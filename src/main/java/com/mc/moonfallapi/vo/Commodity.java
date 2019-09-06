package com.mc.moonfallapi.vo;

import java.util.Date;

public class Commodity {
    private String id;

    private String commodityTypeId;

    private String commodityNo;

    private String commodityName;

    private Integer commodityStatus;

    private Integer commodityQuantity;

    private String commodityComment;

    private Integer commodityAttribute;

    private Integer commodityEffectiveQuantity;

    private Date commodityCreateTime;

    private String commodityCreateUser;

    private Date commodityUpdateTime;

    private String commodityUpdateUser;

    private Integer commodityDeleteFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(String commodityTypeId) {
        this.commodityTypeId = commodityTypeId == null ? null : commodityTypeId.trim();
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo == null ? null : commodityNo.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public Integer getCommodityQuantity() {
        return commodityQuantity;
    }

    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
    }

    public String getCommodityComment() {
        return commodityComment;
    }

    public void setCommodityComment(String commodityComment) {
        this.commodityComment = commodityComment == null ? null : commodityComment.trim();
    }

    public Integer getCommodityAttribute() {
        return commodityAttribute;
    }

    public void setCommodityAttribute(Integer commodityAttribute) {
        this.commodityAttribute = commodityAttribute;
    }

    public Integer getCommodityEffectiveQuantity() {
        return commodityEffectiveQuantity;
    }

    public void setCommodityEffectiveQuantity(Integer commodityEffectiveQuantity) {
        this.commodityEffectiveQuantity = commodityEffectiveQuantity;
    }

    public Date getCommodityCreateTime() {
        return commodityCreateTime;
    }

    public void setCommodityCreateTime(Date commodityCreateTime) {
        this.commodityCreateTime = commodityCreateTime;
    }

    public String getCommodityCreateUser() {
        return commodityCreateUser;
    }

    public void setCommodityCreateUser(String commodityCreateUser) {
        this.commodityCreateUser = commodityCreateUser == null ? null : commodityCreateUser.trim();
    }

    public Date getCommodityUpdateTime() {
        return commodityUpdateTime;
    }

    public void setCommodityUpdateTime(Date commodityUpdateTime) {
        this.commodityUpdateTime = commodityUpdateTime;
    }

    public String getCommodityUpdateUser() {
        return commodityUpdateUser;
    }

    public void setCommodityUpdateUser(String commodityUpdateUser) {
        this.commodityUpdateUser = commodityUpdateUser == null ? null : commodityUpdateUser.trim();
    }

    public Integer getCommodityDeleteFlag() {
        return commodityDeleteFlag;
    }

    public void setCommodityDeleteFlag(Integer commodityDeleteFlag) {
        this.commodityDeleteFlag = commodityDeleteFlag;
    }
}