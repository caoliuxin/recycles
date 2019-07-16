package com.aaa.entity;

//回收预约
public class Subscribe {
    private Integer id;
    private User userid;
    private Address addressid;
    private String subdate;
    private TimeSlice subquantumdate;
    private String createtime;
    private String cancletime;
    private Integer orderstate;
    private String canclreason;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public Address getAddressid() {
        return addressid;
    }

    public void setAddressid(Address addressid) {
        this.addressid = addressid;
    }

    public String getSubdate() {
        return subdate;
    }

    public void setSubdate(String subdate) {
        this.subdate = subdate;
    }

    public TimeSlice getSubquantumdate() {
        return subquantumdate;
    }

    public void setSubquantumdate(TimeSlice subquantumdate) {
        this.subquantumdate = subquantumdate;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCancletime() {
        return cancletime;
    }

    public void setCancletime(String cancletime) {
        this.cancletime = cancletime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public String getCanclreason() {
        return canclreason;
    }

    public void setCanclreason(String canclreason) {
        this.canclreason = canclreason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
