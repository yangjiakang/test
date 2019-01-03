package com.cesgroup.zw.t03.register.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConf {
	
	@Bean
	public PersonFactoryBean personFactoryBean() {
		return new PersonFactoryBean();
	}

}
