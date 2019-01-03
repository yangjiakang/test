package com.cesgroup.zw.t03.lifecycle.bean05;

public class Person {

	@CesAutowired
	private Car car;

	@Override
	public String toString() {
		return "Person [car=" + car + "]";
	}
	
	
}
