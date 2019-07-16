package com.aaa.dao;

import com.aaa.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    /**
     * 用户登录
     * @param user
     * @return
     */
    User userLogin(User user);
    /**
     * 曹刘鑫
     * 查询用户
     */
    List<Map<String,Object>> selectUser();
}
