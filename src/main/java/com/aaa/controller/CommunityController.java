package com.aaa.controller;

import com.aaa.service.CommunityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class CommunityController {
    @Resource
    private CommunityService service;

    @RequestMapping("selectCommunity")
    public String selectCommunity(HttpServletRequest request){
        List<Map<String,Object>> comms=service.selectCommunity();
        request.setAttribute("comm",comms);
        return "insertAddress";
    }
}
