package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CollectOrdersDao {
    /**
     *曹刘鑫
     */
    // *订单大厅(查看可以接的单)
    List<Map<String,Object>> selectAllOrders();
    //历史订单
    List<Map<String,Object>> selectHistoryOrders(Integer userid);

}
