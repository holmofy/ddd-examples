package cn.hff.ddd.ordercontext.repository;

import cn.hff.ddd.ordercontext.model.CustomerOrder;

public interface CustomerOrderRepository {
    void saveCustomerOrder(CustomerOrder order);
}
