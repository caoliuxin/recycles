package com.aaa.entity;

//服务配置表
public class ServiceConfiguration {

    private Integer id; //编号
    private String servicename; //名称
    private String servicecode; // 编码
    private String describedescribe; // 描述
    private Integer content; //值(0:有效 1：无效)
    private Integer deleteflag; //(0:有效 1：无效)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    public String getDescribedescribe() {
        return describedescribe;
    }

    public void setDescribedescribe(String describedescribe) {
        this.describedescribe = describedescribe;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }






    public ServiceConfiguration(Integer id, String servicename, String servicecode, String describedescribe, Integer content, Integer deleteflag) {
        this.id = id;
        this.servicename = servicename;
        this.servicecode = servicecode;
        this.describedescribe = describedescribe;
        this.content = content;
        this.deleteflag = deleteflag;
    }

    public ServiceConfiguration() {
    }
}
