package com.aaa.controller;

import com.aaa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Resource
    private UserService service;
    @RequestMapping("select")
    public String selctUser(HttpServletRequest request){
        List<Map<String,Object>> users=service.selectUser();
        request.setAttribute("user",users);
        return "selectUser";
    }
    public String updUser(){
        return null;
    }
}
