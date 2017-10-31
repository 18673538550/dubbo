package com.xnph66.service.impl;

import org.springframework.stereotype.Service;

import com.xn.api.dubbo.entity.City;
import com.xn.api.dubbo.service.CityService;

@Service("city")
public class CityServiceImpl implements CityService {

	@Override
	public void show(City city) {
		System.out.println("CityName:" + city.getCityName());
	}

}
