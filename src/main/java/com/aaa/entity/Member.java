package com.aaa.entity;

import java.util.Date;

//会员表
public class Member {
    private Integer id;// 主键
    private String codingkey ; //关联用户表
    private String phone; // 手机号码
    private Date createtime; // 创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodingkey() {
        return codingkey;
    }

    public void setCodingkey(String codingkey) {
        this.codingkey = codingkey;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Member() {
    }

    public Member(Integer id, String codingkey, String phone, Date createtime) {
        this.id = id;
        this.codingkey = codingkey;
        this.phone = phone;
        this.createtime = createtime;
    }
}
