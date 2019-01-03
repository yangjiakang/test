package com.cesgroup.zw.t03.lifecycle.bean08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public MyBeanFactoryPostProcessor MyBeanFactoryPostProcessor() {
		return new MyBeanFactoryPostProcessor();
	}
}
