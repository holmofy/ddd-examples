package cn.hff.ddd.shippingcontext.repository;

import cn.hff.ddd.shippingcontext.model.ShippableOrder;

import java.util.Optional;

public interface ShippingOrderRepository {
    Optional<ShippableOrder> findShippableOrder(int orderId);
}
