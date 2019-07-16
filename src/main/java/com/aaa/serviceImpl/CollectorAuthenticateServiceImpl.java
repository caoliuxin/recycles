package com.aaa.serviceImpl;

import com.aaa.dao.CollectorAuthenticateDao;
import com.aaa.entity.CollectorAuthenticate;
import com.aaa.service.CollectorAuthenticateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CollectorAuthenticateServiceImpl implements CollectorAuthenticateService {
    @Resource
    private CollectorAuthenticateDao dao;

    @Override
    public int collectorAuthenticate(CollectorAuthenticate collectorAuthenticate) {
        return dao.collectorAuthenticate(collectorAuthenticate);
    }

    @Override
    public Map<String, Object> checkAuthenticate(Integer userid) {
        return dao.checkAuthenticate(userid);
    }


    @Override
    public int updateCollectorAuthen(CollectorAuthenticate collectorAuthenticate) {
        return dao.updateCollectorAuthen(collectorAuthenticate);
    }
}
