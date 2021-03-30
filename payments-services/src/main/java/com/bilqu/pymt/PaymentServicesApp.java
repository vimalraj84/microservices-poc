package com.bilqu.pymt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServicesApp {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServicesApp.class,args);

    }
}
