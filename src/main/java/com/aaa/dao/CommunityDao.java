package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommunityDao {
    /**
     * 曹刘鑫
     * 查询小区
     */
    List<Map<String,Object>> selectCommunity();

}
