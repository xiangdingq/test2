package com.xiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiang.user.mapper")
public class userApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(userApplication1.class);
    }
}

