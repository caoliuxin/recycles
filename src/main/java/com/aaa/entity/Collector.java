package com.aaa.entity;

public class Collector {
    private Integer id;//主键
    private String jobnum;//回收员工号
    private Integer userid;//用户id
    private Integer collectorAuthenticateid;//认证id
    private Integer state;//状态(0:在存 1：销毁)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobnum() {
        return jobnum;
    }

    public void setJobnum(String jobnum) {
        this.jobnum = jobnum;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCollectorAuthenticateid() {
        return collectorAuthenticateid;
    }

    public void setCollectorAuthenticateid(Integer collectorAuthenticateid) {
        this.collectorAuthenticateid = collectorAuthenticateid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
