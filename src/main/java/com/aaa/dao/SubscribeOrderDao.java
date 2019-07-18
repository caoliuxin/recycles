package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SubscribeOrderDao {

//    连接查询
    List<Map<String,Object>> selSubOrder();
}
