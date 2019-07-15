package com.aaa.entity;

import java.util.Date;

//预约时间控制表
public class AppointmentDate {
    private Integer id; //主键
    private Integer types;//预约控制（0:指定范围1:指定日期2:混合）
    private Date appointdate; // 日期
    private Integer days; // 预约范围

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTypes(Integer types) {
        this.types = types;
    }

    public void setAppointdate(Date appointdate) {
        this.appointdate = appointdate;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTypes() {
        return types;
    }

    public Date getAppointdate() {
        return appointdate;
    }

    public Integer getDays() {
        return days;
    }

    public AppointmentDate(Integer id, Integer types, Date appointdate, Integer days) {
        this.id = id;
        this.types = types;
        this.appointdate = appointdate;
        this.days = days;
    }

    public AppointmentDate() {
    }
}
