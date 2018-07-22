package com.zhzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:spring-bean.xml")
public class CommonApplication {
    public static void main(String args[]) {
        SpringApplication.run(CommonApplication.class);
    }
}
