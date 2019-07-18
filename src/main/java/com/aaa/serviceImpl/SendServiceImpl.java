package com.aaa.serviceImpl;

import com.aaa.dao.SendCardDao;
import com.aaa.entity.SendCard;
import com.aaa.service.SendCardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SendServiceImpl implements SendCardService {
    @Resource
    private SendCardDao dao;

    @Override
    public int addSendCard(SendCard sendCard) {
        return dao.addSendCard(sendCard);
    }

    @Override
    public List<Map<String, Object>> selectSendCrad() {
        return dao.selectSendCrad();
    }
}
