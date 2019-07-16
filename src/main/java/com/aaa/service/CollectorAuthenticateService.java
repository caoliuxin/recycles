package com.aaa.service;

import com.aaa.entity.CollectorAuthenticate;

import java.util.List;
import java.util.Map;

public interface CollectorAuthenticateService {
    //回收员身份认证
    int collectorAuthenticate(CollectorAuthenticate collectorAuthenticate);
    //根据用户id查询 是否有认证记录
    Map<String,Object> checkAuthenticate(Integer userid);
    //修改身份认证
    int updateCollectorAuthen(CollectorAuthenticate collectorAuthenticate);
}
