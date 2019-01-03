package com.cesgroup.zw.t03.lifecycle.bean01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public MyBeanPostProcessor MyBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}
	
	@Bean(initMethod="initMethod",destroyMethod="destroyMethod")
	public Person person() {
		Person person = new Person();
		
		return person;
	}
	
	@Bean
	public String personName() {
		return "personName";
	}
	

}
