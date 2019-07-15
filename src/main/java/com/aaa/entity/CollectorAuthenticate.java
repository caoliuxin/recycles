package com.aaa.entity;

public class CollectorAuthenticate {
    private Integer id;//主键
    private User userid;//用户id
    private String realname;//真实姓名
    private Integer sex;//性别(0:男 1：女)
    private String phone;//电话号码
    private String headurl;//真实照片
    private String permanentaddress;//常住地址
    private String cartype;//车辆类型
    private String contactman;//紧急联系人
    private String idcardnum;//身份证号码
    private String idcardfront;//身份证正面
    private String idcardreverse;//身份证反面
    private Integer isauthenticate;//是否认证通过(0:通过1：审核中2：驳回3：已销毁)
    private String rejectionreasons;//驳回原因
    private Integer identitytype;//身份 (0:自营   1:外包)

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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public String getPermanentaddress() {
        return permanentaddress;
    }

    public void setPermanentaddress(String permanentaddress) {
        this.permanentaddress = permanentaddress;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getContactman() {
        return contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman;
    }

    public String getIdcardnum() {
        return idcardnum;
    }

    public void setIdcardnum(String idcardnum) {
        this.idcardnum = idcardnum;
    }

    public String getIdcardfront() {
        return idcardfront;
    }

    public void setIdcardfront(String idcardfront) {
        this.idcardfront = idcardfront;
    }

    public String getIdcardreverse() {
        return idcardreverse;
    }

    public void setIdcardreverse(String idcardreverse) {
        this.idcardreverse = idcardreverse;
    }

    public Integer getIsauthenticate() {
        return isauthenticate;
    }

    public void setIsauthenticate(Integer isauthenticate) {
        this.isauthenticate = isauthenticate;
    }

    public String getRejectionreasons() {
        return rejectionreasons;
    }

    public void setRejectionreasons(String rejectionreasons) {
        this.rejectionreasons = rejectionreasons;
    }

    public Integer getIdentitytype() {
        return identitytype;
    }

    public void setIdentitytype(Integer identitytype) {
        this.identitytype = identitytype;
    }
}
