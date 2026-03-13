package com.bobby.store;

import org.springframework.stereotype.Service;

//@Service("Paypal")
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL PAYMENT");
        System.out.println("amount: " + amount);
    }
}
