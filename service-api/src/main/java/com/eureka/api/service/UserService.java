package com.eureka.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("s")
public interface UserService {
    @RequestMapping(value = "/info1", method = RequestMethod.GET)
    String getUser();
}
