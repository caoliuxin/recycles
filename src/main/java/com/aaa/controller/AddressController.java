package com.aaa.controller;

import com.aaa.entity.Address;
import com.aaa.entity.User;
import com.aaa.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class AddressController {
    @Resource
    private AddressService service;

    /**
     * 曹刘鑫
     * 查询地址
     */
    @RequestMapping("selectAddress")
    public String selectAddress(HttpServletRequest request){
        List<Map<String,Object>> address=service.selectAddress();
        request.setAttribute("address",address);
        return "forward:/selectUser";
    }

    /**
     * 曹刘鑫
     * 查询我的地址
     */
    @RequestMapping("selectMyAddress")
    public String selectMyAddress(HttpServletRequest request,HttpSession session){
        User user=(User)session.getAttribute("user");
        List<Map<String,Object>> address=service.selectMyAddress(user.getId());
        request.setAttribute("myaddress",address);
        return "selectMyAddress";
    }


    /**曹刘鑫
     * 添加地址
     * @param address
     * @return
     */
    @RequestMapping("insertAddress")
    public String addAddress(Address address) {
        service.addAddress(address);
        return  "redirect:/selectMyAddress";
    }
}
