package service;

import bean.UserAddress;

import java.util.List;

public interface OrderService {
    //初始化订单
    public List<UserAddress> initOrder(String userid);
}
