package com.mc.moonfallapi.vo;

import java.util.Date;

public class ChatInfo {
    private String id;

    private String chatMasterUserAccount;

    private String chatSlaveUserAccount;

    private String chatComment;

    private Date chatCreateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChatMasterUserAccount() {
        return chatMasterUserAccount;
    }

    public void setChatMasterUserAccount(String chatMasterUserAccount) {
        this.chatMasterUserAccount = chatMasterUserAccount == null ? null : chatMasterUserAccount.trim();
    }

    public String getChatSlaveUserAccount() {
        return chatSlaveUserAccount;
    }

    public void setChatSlaveUserAccount(String chatSlaveUserAccount) {
        this.chatSlaveUserAccount = chatSlaveUserAccount == null ? null : chatSlaveUserAccount.trim();
    }

    public String getChatComment() {
        return chatComment;
    }

    public void setChatComment(String chatComment) {
        this.chatComment = chatComment == null ? null : chatComment.trim();
    }

    public Date getChatCreateTime() {
        return chatCreateTime;
    }

    public void setChatCreateTime(Date chatCreateTime) {
        this.chatCreateTime = chatCreateTime;
    }
}