package com.aaa.serviceImpl;

import com.aaa.dao.AddressDao;
import com.aaa.entity.Address;
import com.aaa.service.AddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao dao;

    @Override
    public List<Map<String, Object>> selectAddress() {
        return dao.selectAddress();
    }

    @Override
    public int addAddress(Address address) {
        return dao.addAddress(address);
    }
}
