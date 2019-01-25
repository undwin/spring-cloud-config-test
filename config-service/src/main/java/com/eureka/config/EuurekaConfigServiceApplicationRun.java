package com.eureka.config;

import common.common.datasources.DynamicDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceConfig.class})
@EnableConfigServer
@EnableEurekaClient
public class EuurekaConfigServiceApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(EuurekaConfigServiceApplicationRun.class, args);
    }
}
