package com.xl.springclouddemoconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringclouddemoconfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoconfigclientApplication.class, args);
    }

}

