package cn.hff.ddd.ordercontext.service;

import cn.hff.ddd.ordercontext.model.CustomerOrder;

public interface OrderService {
    void placeOrder(CustomerOrder order);
}
