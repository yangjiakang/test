package com.cesgroup.zw.t03.scopes.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("---------------------");
		
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person"));
    
	}

}
