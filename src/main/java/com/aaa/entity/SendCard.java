package com.aaa.entity;

import java.util.Date;

//二手帖子表
public class SendCard {
    private Integer id; // 主键
    private User userid; //用户id
    private String sendtime; //发帖时间
    private String sendaddress; // 发帖地址
    private String sendcontent; //发帖内容
    private String phone ;  // 电话
    private String send_img1;//发帖配图1
    private String send_img2;//发帖配图2
    private String send_img3; //发帖配图3
    private Integer deleteflag; // 0：有效 1：无效

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

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress;
    }

    public String getSendcontent() {
        return sendcontent;
    }

    public void setSendcontent(String sendcontent) {
        this.sendcontent = sendcontent;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSend_img1() {
        return send_img1;
    }

    public void setSend_img1(String send_img1) {
        this.send_img1 = send_img1;
    }

    public String getSend_img2() {
        return send_img2;
    }

    public void setSend_img2(String send_img2) {
        this.send_img2 = send_img2;
    }

    public String getSend_img3() {
        return send_img3;
    }

    public void setSend_img3(String send_img3) {
        this.send_img3 = send_img3;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    public SendCard(Integer id, User userid, String sendtime, String sendaddress, String sendcontent, String phone, String send_img1, String send_img2, String send_img3, Integer deleteflag) {
        this.id = id;
        this.userid = userid;
        this.sendtime = sendtime;
        this.sendaddress = sendaddress;
        this.sendcontent = sendcontent;
        this.phone = phone;
        this.send_img1 = send_img1;
        this.send_img2 = send_img2;
        this.send_img3 = send_img3;
        this.deleteflag = deleteflag;
    }

    public SendCard() {
    }
}
