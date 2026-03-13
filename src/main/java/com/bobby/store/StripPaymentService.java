package com.bobby.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("Strip")
//@Primary
public class StripPaymentService implements PaymentService {
    @Value("${stripe.apiURL}")
    private String apiURL;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> currencies;


    @Override
    public void processPayment(double amount) {
        System.out.println("STRIP PAYMENT");
        System.out.println("API URL: " + apiURL);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Currencies: " + currencies);
        System.out.println("amount: " + amount);
    }
}
