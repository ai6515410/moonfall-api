package com.mc.moonfallapi.vo;

import java.util.Date;

public class Store {
    private String id;

    private String storeNo;

    private String storeName;

    private String storeAddress;

    private String storePhone;

    private Integer storeSaleQty;

    private Integer storeGuaranteeQty;

    private Integer storePraiseQty;

    private Date storeCreateTime;

    private Date storeUpdateTime;

    private String storeCreateUser;

    private Integer storeDeleteFlag;

    private String storeSamllAvatarImg;

    private String storeBigAvatarImg;

    private String storeUpdateUser;

    private Integer storeIsFoster;

    private Integer storeType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo == null ? null : storeNo.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public Integer getStoreSaleQty() {
        return storeSaleQty;
    }

    public void setStoreSaleQty(Integer storeSaleQty) {
        this.storeSaleQty = storeSaleQty;
    }

    public Integer getStoreGuaranteeQty() {
        return storeGuaranteeQty;
    }

    public void setStoreGuaranteeQty(Integer storeGuaranteeQty) {
        this.storeGuaranteeQty = storeGuaranteeQty;
    }

    public Integer getStorePraiseQty() {
        return storePraiseQty;
    }

    public void setStorePraiseQty(Integer storePraiseQty) {
        this.storePraiseQty = storePraiseQty;
    }

    public Date getStoreCreateTime() {
        return storeCreateTime;
    }

    public void setStoreCreateTime(Date storeCreateTime) {
        this.storeCreateTime = storeCreateTime;
    }

    public Date getStoreUpdateTime() {
        return storeUpdateTime;
    }

    public void setStoreUpdateTime(Date storeUpdateTime) {
        this.storeUpdateTime = storeUpdateTime;
    }

    public String getStoreCreateUser() {
        return storeCreateUser;
    }

    public void setStoreCreateUser(String storeCreateUser) {
        this.storeCreateUser = storeCreateUser == null ? null : storeCreateUser.trim();
    }

    public Integer getStoreDeleteFlag() {
        return storeDeleteFlag;
    }

    public void setStoreDeleteFlag(Integer storeDeleteFlag) {
        this.storeDeleteFlag = storeDeleteFlag;
    }

    public String getStoreSamllAvatarImg() {
        return storeSamllAvatarImg;
    }

    public void setStoreSamllAvatarImg(String storeSamllAvatarImg) {
        this.storeSamllAvatarImg = storeSamllAvatarImg == null ? null : storeSamllAvatarImg.trim();
    }

    public String getStoreBigAvatarImg() {
        return storeBigAvatarImg;
    }

    public void setStoreBigAvatarImg(String storeBigAvatarImg) {
        this.storeBigAvatarImg = storeBigAvatarImg == null ? null : storeBigAvatarImg.trim();
    }

    public String getStoreUpdateUser() {
        return storeUpdateUser;
    }

    public void setStoreUpdateUser(String storeUpdateUser) {
        this.storeUpdateUser = storeUpdateUser == null ? null : storeUpdateUser.trim();
    }

    public Integer getStoreIsFoster() {
        return storeIsFoster;
    }

    public void setStoreIsFoster(Integer storeIsFoster) {
        this.storeIsFoster = storeIsFoster;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }
}