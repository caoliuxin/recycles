package com.aaa.serviceImpl;

import com.aaa.dao.UserDao;
import com.aaa.entity.User;
import com.aaa.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao dao;


    @Override
    public User userLogin(User user) {
        return dao.userLogin(user);
    }

    @Override
    public List<Map<String, Object>> selectUser() {
        return dao.selectUser();
    }
}
