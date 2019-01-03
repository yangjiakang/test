package com.cesgroup.zw.t02.register.annotation.import01.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Car car() {
		System.out.println("------------------------car");
		return new Car();
	}
	
	@Bean
	public Person person1() {
		return new Person(car());
	}
	
	
}
