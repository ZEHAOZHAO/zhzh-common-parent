package com.zhzh.config;

import com.zhzh.service.BeanServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean(name = "beanServiceImpl")
    public BeanServiceImpl getBeanServiceImpl() {
        return new BeanServiceImpl();
    }
}
