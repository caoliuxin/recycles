package com.aaa.entity;

//回收员信息
public class Collector {

    private Integer id; //主键
    private String jobnum; //回收员工号
    private User userid; //用户id
    private Integer collectorAuthenticateid; //认证id
    private Integer state; //状态(0:在存 1：销毁)

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

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
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

    public Collector(Integer id, String jobnum, User userid, Integer collectorAuthenticateid, Integer state) {
        this.id = id;
        this.jobnum = jobnum;
        this.userid = userid;
        this.collectorAuthenticateid = collectorAuthenticateid;
        this.state = state;
    }

    public Collector(){}
}
