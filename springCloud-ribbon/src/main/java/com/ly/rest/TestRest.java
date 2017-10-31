package com.ly.rest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TestRest {

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct--time:" + System.currentTimeMillis());
	}

	@PreDestroy
	public void shutdown() {
		System.out.println("@PreDestroy--time:" + System.currentTimeMillis());
	}
}
