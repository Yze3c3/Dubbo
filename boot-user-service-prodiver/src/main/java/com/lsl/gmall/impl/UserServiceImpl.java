package com.lsl.gmall.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Arrays;
import java.util.List;


/*
   1.将服务提供者注册到注册中心（暴露服务）
     1）导入dubbo依赖（2.6.2）/操作zookeeper的客户端（curator）
     2）配置服务提供者


   2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "cc", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "Yze3c", "010-56253825", "Y");
        return Arrays.asList(address1,address2);
    }
}
