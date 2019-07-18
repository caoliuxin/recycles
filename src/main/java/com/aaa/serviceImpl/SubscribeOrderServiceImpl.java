package com.aaa.serviceImpl;

import com.aaa.dao.SubscribeOrderDao;
import com.aaa.service.SubscribeOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SubscribeOrderServiceImpl implements SubscribeOrderService {

    @Resource
    private SubscribeOrderDao dao;

    @Override
    public List<Map<String, Object>> selSubOrder() {
        return dao.selSubOrder();
    }
}
