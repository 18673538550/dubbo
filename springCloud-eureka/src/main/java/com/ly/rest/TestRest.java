package com.ly.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

	@RequestMapping(value = "/test/{name}")
	public String test(HttpServletRequest request, @PathVariable String name) {
		return name + ",testing is ok";
	}

}
