package com.eureka.client.service;

import com.eureka.api.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;
@FeignClient(value = "eureka-client1")
public interface UserImpl extends UserService {

}
