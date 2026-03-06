package com.hd.order.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderConfig {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }

    //重试配置
    @Bean
    Retryer feignRetry() {
        return new Retryer.Default();
    }
}
