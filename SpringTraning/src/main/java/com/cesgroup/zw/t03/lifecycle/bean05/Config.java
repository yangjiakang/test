package com.cesgroup.zw.t03.lifecycle.bean05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Person person() {
		Person person = new Person();
		
		return person;
	}
	
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean
	public MyBeanPostProcessor MyBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}


}
