package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.bjpowernode.springboot.mapper")//开启mybatis扫描mapper
@EnableTransactionManagement //开启事务支持
public class Springboot04MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04MybatisApplication.class, args);
    }

}
