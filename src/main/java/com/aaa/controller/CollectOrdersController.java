package com.aaa.controller;

import com.aaa.entity.User;
import com.aaa.service.CollectOrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class CollectOrdersController {
    @Resource
    private CollectOrdersService service;

    /**
     * 曹刘鑫
     * 查看我的订单大厅
     * @param request
     * @return
     */
    @RequestMapping("selectAllOrders")
    public String selectAllOrders(HttpServletRequest request){
        List<Map<String,Object>> orders=service.selectAllOrders();
        request.setAttribute("allOrder",orders);
        return "CollectorAllOrders";
    }

    @RequestMapping("selectHistoryOrders")
    public String selectHistoryOrders(HttpServletRequest request, Integer userid, HttpSession session){
        User users= (User) session.getAttribute("user");
        List<Map<String,Object>> orders=service.selectHistoryOrders(users.getId());
        request.setAttribute("historyOrder",orders);
        return "CollectorHistoryOrders";
    }
}
