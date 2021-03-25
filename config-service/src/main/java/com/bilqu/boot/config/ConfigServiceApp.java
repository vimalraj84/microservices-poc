package com.bilqu.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApp.class,args);

    }
}
