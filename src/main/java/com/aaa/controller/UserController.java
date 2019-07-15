package com.aaa.controller;

import com.aaa.entity.User;
import com.aaa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {
    @Resource
    private UserService service;
    /**
     * 曹刘鑫
     * 查询用户
     */
    @RequestMapping("selectUser")
    public String selectUser(HttpServletRequest request){
        List<Map<String,Object>> users=service.selectUser();
        request.setAttribute("users",users);
        return "Subscribe";
    }

    /**
     * 用户登录
     *
     * @param session
     * @param user
     * @return
     */
    @RequestMapping("login")
    public String userLogin(HttpSession session, User user) {

        User users = service.userLogin(user);
        if (users!=null){
            session.setAttribute("user", users);
            return "redirect:/selectSubscribe";
        }
        return "Login";
    }

}
