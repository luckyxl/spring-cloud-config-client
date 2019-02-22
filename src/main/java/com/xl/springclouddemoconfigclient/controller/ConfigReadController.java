package com.xl.springclouddemoconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigReadController
 * @Description springcloud config 客户端
 * @Author xule
 * @Date 2019/2/14 11:01
 * @Version 1.0
 **/
@RestController
@RequestMapping("/configRead")
@RefreshScope
public class ConfigReadController {
    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String readFoo() {
        return foo;
    }
}
