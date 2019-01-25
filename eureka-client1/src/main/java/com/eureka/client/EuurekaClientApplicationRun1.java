package com.eureka.client;

import common.common.datasources.DynamicDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceConfig.class})
@EnableDiscoveryClient
@EnableFeignClients
public class EuurekaClientApplicationRun1 {
    public static void main(String[] args) {
        SpringApplication.run(EuurekaClientApplicationRun1.class, args);
    }
}
