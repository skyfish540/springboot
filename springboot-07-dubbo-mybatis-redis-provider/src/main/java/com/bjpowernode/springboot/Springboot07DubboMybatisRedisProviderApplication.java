package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableRedisRepositories //开启springboot对dubbo的支持
@EnableTransactionManagement  //开启对事务的支持
//开启对Mapper文件的扫描
@MapperScan("com.bjpowernode.springboot.mapper") //作用和在Mapper接口上添加@Mapper注解是一样的
public class Springboot07DubboMybatisRedisProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07DubboMybatisRedisProviderApplication.class, args);
    }

}
