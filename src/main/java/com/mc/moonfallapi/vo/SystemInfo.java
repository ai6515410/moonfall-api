package com.mc.moonfallapi.vo;

import java.util.Date;

public class SystemInfo {
    private String id;

    private String systemInfo;

    private Integer systemDeleteFlag;

    private Date systemCreateTime;

    private String systemCreateUser;

    private Date systemUpdateTime;

    private String systemUpdateUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo == null ? null : systemInfo.trim();
    }

    public Integer getSystemDeleteFlag() {
        return systemDeleteFlag;
    }

    public void setSystemDeleteFlag(Integer systemDeleteFlag) {
        this.systemDeleteFlag = systemDeleteFlag;
    }

    public Date getSystemCreateTime() {
        return systemCreateTime;
    }

    public void setSystemCreateTime(Date systemCreateTime) {
        this.systemCreateTime = systemCreateTime;
    }

    public String getSystemCreateUser() {
        return systemCreateUser;
    }

    public void setSystemCreateUser(String systemCreateUser) {
        this.systemCreateUser = systemCreateUser == null ? null : systemCreateUser.trim();
    }

    public Date getSystemUpdateTime() {
        return systemUpdateTime;
    }

    public void setSystemUpdateTime(Date systemUpdateTime) {
        this.systemUpdateTime = systemUpdateTime;
    }

    public String getSystemUpdateUser() {
        return systemUpdateUser;
    }

    public void setSystemUpdateUser(String systemUpdateUser) {
        this.systemUpdateUser = systemUpdateUser == null ? null : systemUpdateUser.trim();
    }
}