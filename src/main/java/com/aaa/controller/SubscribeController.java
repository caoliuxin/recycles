package com.aaa.controller;

import com.aaa.entity.Subscribe;
import com.aaa.entity.User;
import com.aaa.service.SubscribeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public String selectSubscribe(HttpServletRequest request, HttpSession session){
        User user=(User)session.getAttribute("user");
        List<Map<String,Object>> subs=service.selectSubscriber(user.getId());
        request.setAttribute("sub",subs);
        return "selectSubscribe";
    }

    /**
     * 曹刘鑫
     * 添加回收预约
     * @return
     */
    @RequestMapping("insertSubscribe")
    public String addSubscribe(Subscribe subscribe){
        service.addSubscribe(subscribe);
        return "redirect:/selectSubscribe";
    }
}
