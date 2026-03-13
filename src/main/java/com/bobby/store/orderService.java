package com.bobby.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class orderService {
    private PaymentService paymentService;

//    @Autowired
    public orderService(PaymentService paymentService) {

        this.paymentService = paymentService;
        System.out.println("Order Service created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Order Service Post construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Order Service destroy");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
