package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TimeSliceDao {
    /**
     * caoliuxin
     * 查询时间段
     */
    List<Map<String,Object>> selectTimeSlice();
}
