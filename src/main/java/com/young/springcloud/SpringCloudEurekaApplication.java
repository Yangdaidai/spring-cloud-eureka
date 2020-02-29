package com.young.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.springcloud
 * @ClassName SpringCloudEurekaApplication
 * @Description 启动类
 * @Author young
 * @Modify young
 * @Date 2020/2/29 17:31
 * @Version 1.0.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
