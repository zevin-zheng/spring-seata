package com.zhengwei.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SeataStorageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageServerApplication.class, args);
    }

}
