package cn.hff.ddd.shippingcontext.service;

import cn.hff.ddd.shippingcontext.model.Parcel;
import cn.hff.ddd.shippingcontext.model.ShippableOrder;
import cn.hff.ddd.shippingcontext.repository.ShippingOrderRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParcelShippingService implements ShippingService {
    public static final String EVENT_ORDER_READY_FOR_SHIPMENT = "OrderReadyForShipmentEvent";
    private ShippingOrderRepository orderRepository;
    private Map<Integer, Parcel> shippedParcels = new HashMap<>();

    @Override
    public void shipOrder(int orderId) {
        Optional<ShippableOrder> order = this.orderRepository.findShippableOrder(orderId);
        order.ifPresent(completedOrder -> {
            Parcel parcel = new Parcel(completedOrder.getOrderId(), completedOrder.getAddress(), completedOrder.getPackageItems());
            if (parcel.isTaxable()) {
                // Calculate additional taxes
            }
            // Ship parcel
            this.shippedParcels.put(completedOrder.getOrderId(), parcel);
        });
    }

    @Override
    public Optional<Parcel> getParcelByOrderId(int orderId) {
        return Optional.ofNullable(this.shippedParcels.get(orderId));
    }

    public void setOrderRepository(ShippingOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

}
