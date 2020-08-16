package com.lsl.gmall.service.impl;

import bean.UserAddress;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl2 {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "cc", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "Yze3c", "010-56253825", "Y");
        return Arrays.asList(address1,address2);
    }
}
