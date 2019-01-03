package com.cesgroup.zw.t03.lifecycle.bean04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	@PostConstruct
	public void destroy() throws Exception {
		System.out.println("Person @PostConstruct........");
	}
	@PreDestroy
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person @PreDestroy........");
	}
}