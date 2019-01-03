package com.cesgroup.zw.t03.lifecycle.bean07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public MyInstantiationAwareBeanPostProcessor MyInstantiationAwareBeanPostProcessor() {
		return new MyInstantiationAwareBeanPostProcessor();
	}
	@Bean
	public Person person() {
		return new Person();
	}
}
