package com.digitalhouse.checkoutservie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CheckoutServieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckoutServieApplication.class, args);
	}

}
