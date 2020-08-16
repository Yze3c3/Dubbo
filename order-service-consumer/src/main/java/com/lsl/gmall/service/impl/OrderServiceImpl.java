package com.lsl.gmall.service.impl;



import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;
    public List<UserAddress> initOrder(String userId) {
        System.out.println("传进来的用户id："+userId);
              //查询用户收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress address:addressList) {
            System.out.println(address.getUserAddress());
        }
        return addressList;
    }
}
