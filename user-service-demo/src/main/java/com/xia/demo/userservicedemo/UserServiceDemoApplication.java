package com.xia.demo.userservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.xia.demo.userservicedemo.mapper")
@EnableDiscoveryClient //开启eurekaClient的功能
public class UserServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceDemoApplication.class, args);
    }

}
