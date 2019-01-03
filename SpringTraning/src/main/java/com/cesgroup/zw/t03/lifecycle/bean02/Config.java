package com.cesgroup.zw.t03.lifecycle.bean02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(initMethod="initMethod",destroyMethod="destroyMethod")
	public Person person() {
		Person person = new Person();
		
		return person;
	}
	


}
