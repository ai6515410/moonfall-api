package com.mc.moonfallapi.vo;

public class OrderDetail {
    private String 主键;

    private String 商品id;

    private String 商品数量;

    private String 订单id;

    private String 订单编号;

    private String column6;

    public String get主键() {
        return 主键;
    }

    public void set主键(String 主键) {
        this.主键 = 主键 == null ? null : 主键.trim();
    }

    public String get商品id() {
        return 商品id;
    }

    public void set商品id(String 商品id) {
        this.商品id = 商品id == null ? null : 商品id.trim();
    }

    public String get商品数量() {
        return 商品数量;
    }

    public void set商品数量(String 商品数量) {
        this.商品数量 = 商品数量 == null ? null : 商品数量.trim();
    }

    public String get订单id() {
        return 订单id;
    }

    public void set订单id(String 订单id) {
        this.订单id = 订单id == null ? null : 订单id.trim();
    }

    public String get订单编号() {
        return 订单编号;
    }

    public void set订单编号(String 订单编号) {
        this.订单编号 = 订单编号 == null ? null : 订单编号.trim();
    }

    public String getColumn6() {
        return column6;
    }

    public void setColumn6(String column6) {
        this.column6 = column6 == null ? null : column6.trim();
    }
}