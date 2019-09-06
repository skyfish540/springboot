package com.bjpowernode.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class Springboot07ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07ConsumerApplication.class, args);
    }

}
