package cn.hff.ddd.shippingcontext.service;

import cn.hff.ddd.shippingcontext.model.Parcel;
import cn.hff.ddd.shippingcontext.repository.ShippingOrderRepository;

import java.util.Optional;

public interface ShippingService {
    void shipOrder(int orderId);

    Optional<Parcel> getParcelByOrderId(int orderId);

    void setOrderRepository(ShippingOrderRepository orderRepository);
}
