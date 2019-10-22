package com.boha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BohaUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(BohaUploadApplication.class, args);
    }
}