package com.aaa.entity;

import java.util.Date;

//充值记录表
public class Recharge {
    private Integer id; // 主键
    private String ordernum ;//订单编号
    private Collector collectorid; // 回收员id
    private Double integral; // 积分
    private String garbagetype;    // 干、湿垃圾(对应费率表编码)
    private Double weight; // 重量
    private Date rechargetime; // 充值时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Collector getCollectorid() {
        return collectorid;
    }

    public void setCollectorid(Collector collectorid) {
        this.collectorid = collectorid;
    }

    public Double getIntegral() {
        return integral;
    }

    public void setIntegral(Double integral) {
        this.integral = integral;
    }

    public String getGarbagetype() {
        return garbagetype;
    }

    public void setGarbagetype(String garbagetype) {
        this.garbagetype = garbagetype;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Date getRechargetime() {
        return rechargetime;
    }

    public void setRechargetime(Date rechargetime) {
        this.rechargetime = rechargetime;
    }

    public Recharge(Integer id, String ordernum, Collector collectorid, Double integral, String garbagetype, Double weight, Date rechargetime) {
        this.id = id;
        this.ordernum = ordernum;
        this.collectorid = collectorid;
        this.integral = integral;
        this.garbagetype = garbagetype;
        this.weight = weight;
        this.rechargetime = rechargetime;
    }

    public Recharge() {
    }
}
