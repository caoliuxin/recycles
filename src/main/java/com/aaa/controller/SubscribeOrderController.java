package com.aaa.controller;

import com.aaa.service.SubscribeOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class SubscribeOrderController {

    @Resource
    private SubscribeOrderService service;


    /**
     *  多表连接查询
     */

    @RequestMapping("selSubOrder")
    public String selSubOrder(Model m){
        List<Map<String, Object>> maps = service.selSubOrder();
        m.addAttribute("maps",maps);
        return "selSubOrder";
    }

}
