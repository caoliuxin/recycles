package com.aaa.controller;

import com.aaa.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService service;
}
