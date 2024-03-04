package com.claudia.services;

import com.claudia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }


    public double total(Order order) {
        return order.getBasic() + shippingService.shipment();
    }
}