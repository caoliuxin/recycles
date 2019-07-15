package com.aaa.entity;

//中转站回收人员表
public class TransferCollector {

    private Integer id; // 主键
    private TransferStation transferStationid;//中转站id
    private Collector collectorid; // 回收员id
    private Integer deleteflag ; //0：有效 1：无效

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

    public Collector getCollectorid() {
        return collectorid;
    }

    public void setCollectorid(Collector collectorid) {
        this.collectorid = collectorid;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    public TransferCollector(Integer id, TransferStation transferStationid, Collector collectorid, Integer deleteflag) {
        this.id = id;
        this.transferStationid = transferStationid;
        this.collectorid = collectorid;
        this.deleteflag = deleteflag;
    }

    public TransferCollector() {
    }
}
