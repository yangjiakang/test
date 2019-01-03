package com.cesgroup.zw.t03.lifecycle.bean06;

public class Person {
	private Car car;
	public void setCar(@CesAutowired Car car) {
		this.car = car;
	} 
	@Override
	public String toString() {
		return "Person [car=" + car + "]";
	}
}
