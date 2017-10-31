package com.xn.api.dubbo.entity;

import java.io.Serializable;

public class City implements Serializable {

	private static final long serialVersionUID = -7567310989931458293L;

	private String id;
	private String cityName;
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
