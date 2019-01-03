package com.cesgroup.zw.t03.register.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConf.class);
		
		System.out.println(context.getBean("personFactoryBean"));
		
		System.out.println(context.getBean("&personFactoryBean"));
		
		//DefaultListableBeanFactory.SCOPE_PROTOTYPE
    
	}

}
