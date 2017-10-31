package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudAppliction {
	
	//通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAppliction.class, args);
	}
}
