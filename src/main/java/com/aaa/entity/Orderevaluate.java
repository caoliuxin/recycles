package com.aaa.entity;

//订单评价
public class Orderevaluate {
    private Integer id; //主键
    private SubscribeOrder subscribeOrderid; //订单id
    private Integer speedscore; //上门速度分
    private Integer mannerscore; //服务态度分

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SubscribeOrder getSubscribeOrderid() {
        return subscribeOrderid;
    }

    public void setSubscribeOrderid(SubscribeOrder subscribeOrderid) {
        this.subscribeOrderid = subscribeOrderid;
    }

    public Integer getSpeedscore() {
        return speedscore;
    }

    public void setSpeedscore(Integer speedscore) {
        this.speedscore = speedscore;
    }

    public Integer getMannerscore() {
        return mannerscore;
    }

    public void setMannerscore(Integer mannerscore) {
        this.mannerscore = mannerscore;
    }

    public Orderevaluate() {
    }

    public Orderevaluate(Integer id, SubscribeOrder subscribeOrderid, Integer speedscore, Integer mannerscore) {
        this.id = id;
        this.subscribeOrderid = subscribeOrderid;
        this.speedscore = speedscore;
        this.mannerscore = mannerscore;
    }
}
