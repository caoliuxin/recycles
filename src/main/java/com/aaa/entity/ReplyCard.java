package com.aaa.entity;

import java.util.Date;

//帖子回复表
public class ReplyCard {
    private Integer id; // 主键
    private SendCard sendCardid ;    //交易帖子Id
    private User replyuserid;   //回复人id
    private String replycontent;    // 回复内容
    private String replyimg;    //回复贴配图
    private String replytime;//回复时间
    private User userid; //对评论说，回复人id（具体回复的某个人，无则为-1）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SendCard getSendCardid() {
        return sendCardid;
    }

    public void setSendCardid(SendCard sendCardid) {
        this.sendCardid = sendCardid;
    }

    public User getReplyuserid() {
        return replyuserid;
    }

    public void setReplyuserid(User replyuserid) {
        this.replyuserid = replyuserid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    public String getReplyimg() {
        return replyimg;
    }

    public void setReplyimg(String replyimg) {
        this.replyimg = replyimg;
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public ReplyCard(Integer id, SendCard sendCardid, User replyuserid, String replycontent, String replyimg, String replytime, User userid) {
        this.id = id;
        this.sendCardid = sendCardid;
        this.replyuserid = replyuserid;
        this.replycontent = replycontent;
        this.replyimg = replyimg;
        this.replytime = replytime;
        this.userid = userid;
    }

    public ReplyCard(){}
}
