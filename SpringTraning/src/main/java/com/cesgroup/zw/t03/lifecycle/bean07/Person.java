package com.cesgroup.zw.t03.lifecycle.bean07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	
	public Person() {
		System.out.println("Person constructor.......");
	}
	
	@PostConstruct
	public void destroy() throws Exception {
		System.out.println("Person @PostConstruct........");
	}
	@PreDestroy
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person @PreDestroy........");
	}
}