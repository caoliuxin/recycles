package com.aaa.dao;

import com.aaa.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

//地址接口
@Mapper
public interface AddressDao {
    /**
     * 曹刘鑫
     * @return
     */
    //查询地址名称(预约时选择地址)
    List<Map<String,Object>> selectAddress();
    //查询我的所有地址
    List<Map<String,Object>> selectMyAddress();
     //添加地址:预约时使用
    int addAddress(Address address);
}
