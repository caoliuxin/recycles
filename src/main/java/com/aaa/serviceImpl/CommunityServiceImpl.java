package com.aaa.serviceImpl;

import com.aaa.dao.CommunityDao;
import com.aaa.service.CommunityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CommunityServiceImpl implements CommunityService {

    @Resource
    private CommunityDao dao;

    @Override
    public List<Map<String, Object>> selectCommunity() {
        return dao.selectCommunity();
    }
}
