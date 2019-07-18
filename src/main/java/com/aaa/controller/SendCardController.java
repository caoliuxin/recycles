package com.aaa.controller;

import com.aaa.entity.SendCard;
import com.aaa.service.SendCardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class SendCardController {
    @Resource
    private SendCardService service;

    /**
     * 曹刘鑫
     * 查看所有贴子
     * @return
     */
    @RequestMapping("selectSendCard")
    public String selectSendCrad(HttpServletRequest request){
        List<Map<String,Object>> sendcards=service.selectSendCrad();
        request.setAttribute("allSendCards",sendcards);
        return "selectAllSendCards";
    }

    /**
     * 曹刘鑫
     * 用户发布帖子
     * @param sendCard
     * @return
     */
    @RequestMapping("publicSendCard")
    public String addSendCard(SendCard sendCard) {
        service.addSendCard(sendCard);
        return "postSendCard";
    }
}
