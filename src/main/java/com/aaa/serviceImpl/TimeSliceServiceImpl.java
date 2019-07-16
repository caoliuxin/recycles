package com.aaa.serviceImpl;

import com.aaa.dao.TimeSliceDao;
import com.aaa.service.TimeSliceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TimeSliceServiceImpl implements  TimeSliceService{
    @Resource
    private TimeSliceDao dao;

    @Override
    public List<Map<String, Object>> selectTimeSlice() {
        return dao.selectTimeSlice();
    }
}
