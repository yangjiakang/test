package com.cesgroup.zw.t03.lifecycle.bean06;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car>{

	@Override
	public Car getObject() throws Exception {
		
		System.out.println("call ------------------");
		// TODO Auto-generated method stub
		return new Car() {

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "Car";
			}
		};
	}

	@Override
	public Class<Car> getObjectType() {
		
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}


}
