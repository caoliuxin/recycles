package com.aaa.service;

import java.util.List;
import java.util.Map;

public interface TimeSliceService {
    //查询时间段
    List<Map<String,Object>> selectTimeSlice();
}
