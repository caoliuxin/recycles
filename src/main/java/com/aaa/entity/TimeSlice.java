package com.aaa.entity;

public class TimeSlice {
    private Integer id;
    private String slice;
    private Integer deleteflag;

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
}
