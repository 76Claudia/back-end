package com.claudia.services;

import com.claudia.entities.Order;
import org.springframework.stereotype.Service;

@Service

public class OrderService {
    private final ShippingService shippingService;
    private Order order;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }


    public double total(Order order) {

        return this.order.getBasic() - this.order.getDiscount() + shippingService.shipment();
    }
}