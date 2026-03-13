package com.bobby.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;

    @Bean
    public PaymentService strip() {
        return new StripPaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PaypalPaymentService();
    }

    @Bean
    @Lazy
    @Scope("prototype")
    public orderService orderService() {
        if  (paymentGateway.equals("Stripe")) {
            return new orderService(strip());
        }
        return new orderService(paypal());
    }
}
