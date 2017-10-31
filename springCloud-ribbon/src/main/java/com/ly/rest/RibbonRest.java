package com.ly.rest;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonRest {

	private static final Log logger = LogFactory.getLog(RibbonRest.class);
	
	private static String URL = "https://www.baidu.com/";

	//nginx可以使用负载均衡分配流量，ribbon为客户端提供负载均衡，dubbo服务调用里的负载均衡
	
	@Autowired
	@LoadBalanced //通过@LoadBalanced注解开启均衡负载能力
	private RestTemplate restTemplate;

	@RequestMapping(value = "/ribbon")
	public void show(HttpServletRequest request) {
		ResponseEntity<String> response = restTemplate.getForEntity(URL, String.class);
		logger.info("re:" + response.getBody());
	}
}
