package com.aaa.serviceImpl;

import com.aaa.dao.SubscribeDao;
import com.aaa.entity.Subscribe;
import com.aaa.service.SubscribeService;
import javafx.scene.SubScene;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SubscribeServiceImpl implements SubscribeService {
    @Resource
    private SubscribeDao dao;

    @Override
    public List<Map<String, Object>> selectSubscriber(Integer userid) {
        return dao.selectSubscriber(userid);
    }

    @Override
    public int addSubscribe(Subscribe subscribe,Integer uid) {
        return dao.addSubscribe(subscribe,uid);
    }
}
