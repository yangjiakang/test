package com.cesgroup.zw.t02.bean.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	
	private Car car;
	
	public Person() {
		
	}
	
	public String getCarName() {
		return car.getName();
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	

}
