package com.aaa.service;

import java.util.List;
import java.util.Map;

public interface CollectOrdersService {
    //历史订单
    List<Map<String,Object>> selectHistoryOrders(Integer userid);
}
