package com.ly.dubbo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xn.api.dubbo.entity.City;
import com.xn.api.dubbo.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/get/{cityName}")
	public void getCity(HttpServletRequest request,@PathVariable String cityName) {
		System.out.println("******************进入消费者方法***************");
		City c = new City();
		c.setCityName(cityName);
		cityService.show(c);
		System.out.println("******************进入消费者完毕***************");
	}

}
