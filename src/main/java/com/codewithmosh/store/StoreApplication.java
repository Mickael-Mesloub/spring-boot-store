package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
        var paypalOrderService = new OrderService(new PaypalPaymentService());
        var stripeOrderService = new OrderService(new StripePaymentService());
        paypalOrderService.placeOrder();
        stripeOrderService.placeOrder();
    }

}
