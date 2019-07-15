package com.aaa.entity;

import java.util.Date;

public class SubscribeOrder {
    private Integer id;//主键
    private Subscribe subscribeid;//回收预约id
    private User collectorid;//回收员id
    private String ordernum;//订单编号
    private Date createtime;// 接单时间
    private Date cancletime;//取消时间
    private Integer orderstate;//订单状态(0:完成1：取消2：未完成3：待取消)
    private Integer cancletype;//取消类型(0:客户 1：回收员)
    private String canclereason;// 取消原因

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subscribe getSubscribeid() {
        return subscribeid;
    }

    public void setSubscribeid(Subscribe subscribeid) {
        this.subscribeid = subscribeid;
    }

    public User getCollectorid() {
        return collectorid;
    }

    public void setCollectorid(User collectorid) {
        this.collectorid = collectorid;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCancletime() {
        return cancletime;
    }

    public void setCancletime(Date cancletime) {
        this.cancletime = cancletime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getCancletype() {
        return cancletype;
    }

    public void setCancletype(Integer cancletype) {
        this.cancletype = cancletype;
    }

    public String getCanclereason() {
        return canclereason;
    }

    public void setCanclereason(String canclereason) {
        this.canclereason = canclereason;
    }
}
