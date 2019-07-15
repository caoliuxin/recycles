package com.aaa.controller;

import com.aaa.service.TimeSliceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class TimeSliceController {
    @Resource
    private TimeSliceService service;

    @RequestMapping("selectTime")
    public String selectTime(HttpServletRequest request) {
        List<Map<String,Object>> times=service.selectTimeSlice();
        request.setAttribute("times",times);
        return "forward:/selectAddress";
    }
}
