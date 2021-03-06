package com.boha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.boha.item.mapper")
public class BohaItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BohaItemServiceApplication.class,args);
    }
}
