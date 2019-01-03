package com.cesgroup.zw.t03.lifecycle.bean01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		context.getBean(Person.class);
		
		context.close();
	}

}
