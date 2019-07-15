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
        //获取session数据
        User user= (User) session.getAttribute("user");
        List<Map<String,Object>> subs=service.selectSubscriber(user.getId());
        request.setAttribute("sub",subs);
        return "selectSubscribe";
    }

    /**
     * 曹刘鑫
     * 回收预约
     * @return
     */
    @RequestMapping("insertSubscribe")
    public String addSubscribe(Subscribe subscribe,Integer uid, HttpSession session){
        //获取session数据(查看我的预约只能查当前登陆人的预约)
        User user= (User) session.getAttribute("user");
        service.addSubscribe(subscribe,user.getId());
        return "redirect:/selectSubscribe";
    }
}
