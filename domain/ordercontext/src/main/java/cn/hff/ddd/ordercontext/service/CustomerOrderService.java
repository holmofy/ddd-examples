package cn.hff.ddd.ordercontext.service;

import cn.hff.ddd.ordercontext.model.CustomerOrder;
import cn.hff.ddd.ordercontext.repository.CustomerOrderRepository;

public class CustomerOrderService implements OrderService {

    private CustomerOrderRepository orderRepository;

    @Override
    public void placeOrder(CustomerOrder order) {
        this.orderRepository.saveCustomerOrder(order);

    }
}
