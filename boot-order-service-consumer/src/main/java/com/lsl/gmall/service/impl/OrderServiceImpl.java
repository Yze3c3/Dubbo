package com.lsl.gmall.service.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 * 		2）、配置服务提供者
 *
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 *
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
   /*
      @Reference(url = "127.0.0.1:20881")当Zookeeper注册中心挂了以后使用dubbo直连，
      直接告诉服务消费者服务注册者的位置，可以直接进行调用
   *
   */

    @Reference
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
