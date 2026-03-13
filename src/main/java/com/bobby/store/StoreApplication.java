package com.bobby.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.module.Configuration;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var resource = context.getBean(HeavyResource.class);
		var orderService = context.getBean(orderService.class);
		var orderService2 = context.getBean(orderService.class);
		orderService.placeOrder();
		context.close();
	}

}
