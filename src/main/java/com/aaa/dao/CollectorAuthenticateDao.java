package com.aaa.dao;

import com.aaa.entity.CollectorAuthenticate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CollectorAuthenticateDao {
    /**
     * 曹刘鑫
     * 回收员身份认证
     */
    int collectorAuthenticate(CollectorAuthenticate collectorAuthenticate);
    //查询是否有认证记录
    Map<String,Object> checkAuthenticate(Integer userid);
    //修改身份认证
    int updateCollectorAuthen(CollectorAuthenticate collectorAuthenticate);
}

