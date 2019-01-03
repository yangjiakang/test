package com.cesgroup.zw.t03.scopes.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Person person() {
		return new Person();
	}
	
	
	
	@Bean
	public Car car() {
		return new Car();
	}
	
	
}
