package com.feri.shop.newretail.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer //基于Eureka实现注册中心
public class RegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryApplication.class,args);
    }
}