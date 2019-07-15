package com.aaa.entity;

//预约时间段
public class TimeSlice {
    private Integer id; //编号
    private String slice; //预约时间段
    private Integer deleteflag; //(0:有效 1：无效)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlice() {
        return slice;
    }

    public void setSlice(String slice) {
        this.slice = slice;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    public TimeSlice() {
    }

    public TimeSlice(Integer id, String slice, Integer deleteflag) {
        this.id = id;
        this.slice = slice;
        this.deleteflag = deleteflag;
    }
}
