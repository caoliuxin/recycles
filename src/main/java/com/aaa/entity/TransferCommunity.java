package com.aaa.entity;

//中转小区表
public class TransferCommunity {

    private Integer id;// 主键
    private TransferStation transferStationid;// 中转站id
    private Community communityid ;//小区id
    private Integer deleteflag; // 0：有效 1：无效

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TransferStation getTransferStationid() {
        return transferStationid;
    }

    public void setTransferStationid(TransferStation transferStationid) {
        this.transferStationid = transferStationid;
    }

    public Community getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Community communityid) {
        this.communityid = communityid;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    public TransferCommunity(Integer id, TransferStation transferStationid, Community communityid, Integer deleteflag) {
        this.id = id;
        this.transferStationid = transferStationid;
        this.communityid = communityid;
        this.deleteflag = deleteflag;
    }

    public TransferCommunity() {
    }
}
