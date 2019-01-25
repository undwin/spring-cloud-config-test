package com.eureka.client.controller;

import com.eureka.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController1_1 {
    @Autowired
    UserService userService;
    @RequestMapping("/hello")
    public String getUser(){
        return userService.getUser()+"client1-1";
    }
}
