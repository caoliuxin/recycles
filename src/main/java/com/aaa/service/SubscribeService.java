package com.aaa.service;

import com.aaa.entity.Subscribe;

import java.util.List;
import java.util.Map;

public interface SubscribeService {
    //查看我的预约
    List<Map<String,Object>> selectSubscriber(Integer userid);
    //回收预约
    int addSubscribe(Subscribe subscribe,Integer uid);
}
