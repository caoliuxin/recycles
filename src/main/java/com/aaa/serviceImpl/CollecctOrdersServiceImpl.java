package com.aaa.serviceImpl;

import com.aaa.dao.CollectOrdersDao;
import com.aaa.service.CollectOrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CollecctOrdersServiceImpl implements CollectOrdersService {
    @Resource
    private CollectOrdersDao dao;

    @Override
    public List<Map<String, Object>> selectAllOrders() {
        return dao.selectAllOrders();
    }

    @Override
    public List<Map<String, Object>> selectHistoryOrders(Integer userid) {
        return dao.selectHistoryOrders(userid);
    }
}
