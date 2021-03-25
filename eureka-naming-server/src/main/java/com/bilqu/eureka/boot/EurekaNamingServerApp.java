package com.bilqu.eureka.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaNamingServerApp.class,args);

    }
}
