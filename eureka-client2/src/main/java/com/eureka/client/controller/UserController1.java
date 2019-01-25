package com.eureka.client.controller;

import com.eureka.api.service.UserService;
import com.eureka.client.service.UserImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController1 {
    @Autowired
    UserImpl userImpl;
    @GetMapping("/")
    @HystrixCommand(fallbackMethod = "fallback")
    public String getUser(){
        if(userImpl == null){
            return "null";
        }
        return userImpl.getUser()+"client2";
    }
    public String fallback() {
        return "服务请求错误";
    }
}
