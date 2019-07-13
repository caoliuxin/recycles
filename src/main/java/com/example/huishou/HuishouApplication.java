package com.example.huishou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aaa.entity")
@ComponentScan("com.aaa.controller")
@ComponentScan("com.aaa.service")
@ComponentScan("com.aaa.serviceImpl")
@MapperScan("com.aaa.dao")
public class HuishouApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuishouApplication.class, args);
        System.out.println("这是测试");
    }

}
