package com.eureka.client.service.impl;

import com.eureka.api.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "张三1";
    }
}
