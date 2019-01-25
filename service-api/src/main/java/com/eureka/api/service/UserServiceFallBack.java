package com.eureka.api.service;

import com.eureka.api.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBack implements UserService {

    @Override
    public String getUser() {
        return "调用失败，请等待";
    }
}
