package com.xia.demo.userconsumerdemo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feLevel() {
        return Logger.Level.FULL;
    }
}
