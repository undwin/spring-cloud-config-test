package com.eureka.client.controller;

import com.eureka.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController1 {
    @Value("${spring.application.name}")
    private String name;
    @Autowired
    UserService userService;
    @RequestMapping("/")
    public String getUser(){
        return userService.getUser()+"client1"+name;
    }
}
