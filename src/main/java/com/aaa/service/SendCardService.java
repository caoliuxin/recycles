package com.aaa.service;

import com.aaa.entity.SendCard;

import java.util.List;
import java.util.Map;

public interface SendCardService {
    //发布帖子
    int addSendCard(SendCard sendCard);
    //查看帖子
    List<Map<String,Object>> selectSendCrad();
}
