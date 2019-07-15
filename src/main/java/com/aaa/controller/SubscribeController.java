package com.aaa.controller;

import com.aaa.entity.Subscribe;
import com.aaa.service.SubscribeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class SubscribeController {
    @Resource
    private SubscribeService service;

    /**
     * 查看我的预约
     * @param request
     * @return
     */
    @RequestMapping("selectSubscribe")
    public String selectSubscribe(HttpServletRequest request){
        List<Map<String,Object>> subs=service.selectSubscriber();
        request.setAttribute("sub",subs);
        return "selectSubscribe";
    }

    /**
     * 曹刘鑫
     * 回收预约
     * @return
     */
    @RequestMapping("insertSubscribe")
    public String addSubscribe(Subscribe subscribe){
        service.addSubscribe(subscribe);
        return "selectSubscribe";
    }
}
