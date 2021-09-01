package com.example.gateway;
//package bookingexhibition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"com.example"} ) //PMJ 추가
public class GatewayApplication {

    public static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(GatewayApplication.class, args);
    }


}


