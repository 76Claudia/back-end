package com.claudia.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public class ShippingService {
    public double shipment(){
        double basic = 0.0;

        if (basic < 100.0) {
            return basic + 20.0;
        }

        else if (basic < 200.0 ) {
            return basic + 12.0;
        }

        else {
            return 0.0;
        }
    }
}
