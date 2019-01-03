package com.cesgroup.zw.t03.lifecycle.bean06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Config {
	@Bean
	public CarFactoryBean carFactoryBean() {
		return new CarFactoryBean();
	}
	@Bean
	public Person person() {
		Person person = new Person();
		
		return person;
	}

	@Bean
	public MyBeanPostProcessor MyBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}


}
