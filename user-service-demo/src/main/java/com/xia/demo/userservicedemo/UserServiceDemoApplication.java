package com.xia.demo.userservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.xia.demo.userservicedemo.mapper")
public class UserServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceDemoApplication.class, args);
    }

}
