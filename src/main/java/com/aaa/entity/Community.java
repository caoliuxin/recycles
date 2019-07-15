package com.aaa.entity;

//入住小区表
public class Community {
    private Integer id;
    private String communityname;
    private Integer householdcount;
    private String propertyinformation;
    private String communityaddress;
    private String longitude;
    private String latitude;
    private Integer deleteflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public Integer getHouseholdcount() {
        return householdcount;
    }

    public void setHouseholdcount(Integer householdcount) {
        this.householdcount = householdcount;
    }

    public String getPropertyinformation() {
        return propertyinformation;
    }

    public void setPropertyinformation(String propertyinformation) {
        this.propertyinformation = propertyinformation;
    }

    public String getCommunityaddress() {
        return communityaddress;
    }

    public void setCommunityaddress(String communityaddress) {
        this.communityaddress = communityaddress;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }
}
