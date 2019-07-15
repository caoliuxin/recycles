package com.aaa.entity;

import java.util.Date;

//问题反馈
public class Feedback {
    private Integer id; //主键
    private User userid; //用户id
    private Integer feedbacktype; //反馈类型
    private String feedbackcontent; //反馈内容
    private String feedback_img1; //反馈附图1
    private String feedback_img2; //反馈附图2
    private Date feedbackdate; //反馈日期

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

    public Integer getFeedbacktype() {
        return feedbacktype;
    }

    public void setFeedbacktype(Integer feedbacktype) {
        this.feedbacktype = feedbacktype;
    }

    public String getFeedbackcontent() {
        return feedbackcontent;
    }

    public void setFeedbackcontent(String feedbackcontent) {
        this.feedbackcontent = feedbackcontent;
    }

    public String getFeedback_img1() {
        return feedback_img1;
    }

    public void setFeedback_img1(String feedback_img1) {
        this.feedback_img1 = feedback_img1;
    }

    public String getFeedback_img2() {
        return feedback_img2;
    }

    public void setFeedback_img2(String feedback_img2) {
        this.feedback_img2 = feedback_img2;
    }

    public Date getFeedbackdate() {
        return feedbackdate;
    }

    public void setFeedbackdate(Date feedbackdate) {
        this.feedbackdate = feedbackdate;
    }

    public Feedback() {
    }

    public Feedback(Integer id, User userid, Integer feedbacktype, String feedbackcontent, String feedback_img1, String feedback_img2, Date feedbackdate) {
        this.id = id;
        this.userid = userid;
        this.feedbacktype = feedbacktype;
        this.feedbackcontent = feedbackcontent;
        this.feedback_img1 = feedback_img1;
        this.feedback_img2 = feedback_img2;
        this.feedbackdate = feedbackdate;
    }
}
