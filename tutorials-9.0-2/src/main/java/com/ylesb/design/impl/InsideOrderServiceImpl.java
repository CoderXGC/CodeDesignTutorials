package com.ylesb.design.impl;


import com.ylesb.design.OrderAdapterService;
import com.ylesb.design.service.OrderService;

/**
 * 内部订单，判断首单逻辑
 */
public class InsideOrderServiceImpl implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }

}
