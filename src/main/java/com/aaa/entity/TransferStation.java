package com.aaa.entity;

//中转回收站
public class TransferStation {

    private Integer id; // 主键
    private String transfername;//中转站名称
    private int deleteflag;//(0:有效 1：无效)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransfername() {
        return transfername;
    }

    public void setTransfername(String transfername) {
        this.transfername = transfername;
    }

    public int getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(int deleteflag) {
        this.deleteflag = deleteflag;
    }

    public TransferStation(Integer id, String transfername, int deleteflag) {
        this.id = id;
        this.transfername = transfername;
        this.deleteflag = deleteflag;
    }

    public TransferStation() {
    }
}
