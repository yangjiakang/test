package com.cesgroup.zw.t02.register.annotation.conditional.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cesgroup.zw.t02.register.annotation.conditional.ConditionalOnBean;

@Configuration
public class Config {
	
	@Bean
	@ConditionalOnBean(Car.class)
	public Person person() {
		return new Person();
	}
}
