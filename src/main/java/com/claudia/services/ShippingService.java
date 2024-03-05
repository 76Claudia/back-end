package com.claudia.services;


import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment() {
        double basic = 0.0;
        double discount = 0.0;
        double shipment = 0.0;

        if (basic < 100.0) {
            return shipment = 20.0;
        }
        else if (basic < 200.0) {
            return shipment = 12.0;
        } else {
            return shipment = 0.0;
        }
    }

    }
