package com.aaa.service;

import com.aaa.entity.Address;

import java.util.List;
import java.util.Map;

public interface AddressService {
    List<Map<String,Object>> selectAddress();//查询地址
    List<Map<String,Object>> selectMyAddress();//查询我的所有地址
    int addAddress(Address address);//添加地址
}
