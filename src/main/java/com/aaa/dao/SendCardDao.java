package com.aaa.dao;

import com.aaa.entity.SendCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SendCardDao {
    /**
     * 曹刘鑫
     * 用户发布帖子
     */
    int addSendCard(SendCard sendCard);
    //查看帖子
    List<Map<String,Object>> selectSendCrad();
}
