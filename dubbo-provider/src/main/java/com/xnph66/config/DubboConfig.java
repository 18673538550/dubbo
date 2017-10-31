package com.xnph66.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value={"classpath:dubbo-*.xml"})
public class DubboConfig {

}
