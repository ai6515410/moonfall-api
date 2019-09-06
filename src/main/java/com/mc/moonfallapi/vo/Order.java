package com.mc.moonfallapi.vo;

public class Order {
    private String 主键;

    private String 订单编号;

    private String 店铺id;

    private String 用户id;

    private String 订单类型;

    private String 金额总数;

    private String 创建时间;

    private String 更新时间;

    private String 更新人;

    private String 订单状态;

    public String get主键() {
        return 主键;
    }

    public void set主键(String 主键) {
        this.主键 = 主键 == null ? null : 主键.trim();
    }

    public String get订单编号() {
        return 订单编号;
    }

    public void set订单编号(String 订单编号) {
        this.订单编号 = 订单编号 == null ? null : 订单编号.trim();
    }

    public String get店铺id() {
        return 店铺id;
    }

    public void set店铺id(String 店铺id) {
        this.店铺id = 店铺id == null ? null : 店铺id.trim();
    }

    public String get用户id() {
        return 用户id;
    }

    public void set用户id(String 用户id) {
        this.用户id = 用户id == null ? null : 用户id.trim();
    }

    public String get订单类型() {
        return 订单类型;
    }

    public void set订单类型(String 订单类型) {
        this.订单类型 = 订单类型 == null ? null : 订单类型.trim();
    }

    public String get金额总数() {
        return 金额总数;
    }

    public void set金额总数(String 金额总数) {
        this.金额总数 = 金额总数 == null ? null : 金额总数.trim();
    }

    public String get创建时间() {
        return 创建时间;
    }

    public void set创建时间(String 创建时间) {
        this.创建时间 = 创建时间 == null ? null : 创建时间.trim();
    }

    public String get更新时间() {
        return 更新时间;
    }

    public void set更新时间(String 更新时间) {
        this.更新时间 = 更新时间 == null ? null : 更新时间.trim();
    }

    public String get更新人() {
        return 更新人;
    }

    public void set更新人(String 更新人) {
        this.更新人 = 更新人 == null ? null : 更新人.trim();
    }

    public String get订单状态() {
        return 订单状态;
    }

    public void set订单状态(String 订单状态) {
        this.订单状态 = 订单状态 == null ? null : 订单状态.trim();
    }
}