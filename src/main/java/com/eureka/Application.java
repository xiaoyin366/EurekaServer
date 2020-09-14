package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author    yinph
 * @name    springboot启动类
 * */
 @SpringBootApplication
 @EnableEurekaServer            //启动注册中心
 public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}