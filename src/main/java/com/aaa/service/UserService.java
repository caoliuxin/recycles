package com.aaa.service;

import com.aaa.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User userLogin(User user);//登录
    List<Map<String,Object>> selectUser();//查询用户
}
