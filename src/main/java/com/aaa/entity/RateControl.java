package com.aaa.entity;

//费率控制表
public class RateControl {

    private Integer id;//主键
    private String ratename;// 名称
    private String ratecode; // 编码
    private String ratedescribe;// 描述
    private Integer rate; // 百分比

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRatename() {
        return ratename;
    }

    public void setRatename(String ratename) {
        this.ratename = ratename;
    }

    public String getRatecode() {
        return ratecode;
    }

    public void setRatecode(String ratecode) {
        this.ratecode = ratecode;
    }

    public String getRatedescribe() {
        return ratedescribe;
    }

    public void setRatedescribe(String ratedescribe) {
        this.ratedescribe = ratedescribe;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public RateControl(Integer id, String ratename, String ratecode, String ratedescribe, Integer rate) {
        this.id = id;
        this.ratename = ratename;
        this.ratecode = ratecode;
        this.ratedescribe = ratedescribe;
        this.rate = rate;
    }

    public RateControl() {
    }
}
