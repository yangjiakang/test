package com.cesgroup.zw.t03.lifecycle.bean07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println(context.getBean("person").getClass());
	
		context.close();
	}

}
