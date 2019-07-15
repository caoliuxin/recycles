package com.aaa.dao;

import com.aaa.entity.Subscribe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SubscribeDao {
    /**
     * 曹刘鑫
     * 查看我的预约
     * @return
     */
    List<Map<String,Object>> selectSubscriber(Integer userid);
    /**
     * 曹刘鑫
     * 回收预约
     * @param subscribe
     * @return
     */
    int addSubscribe(Subscribe subscribe,Integer uid);
}
