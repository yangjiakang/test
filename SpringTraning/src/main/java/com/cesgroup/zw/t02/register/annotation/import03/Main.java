package com.cesgroup.zw.t02.register.annotation.import03;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@BeanScan("com.cesgroup.zw.t02.register.annotation.import03")
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext 
		context = new AnnotationConfigApplicationContext(Main.class);
		print(context.getBeanDefinitionNames());
	}
	
	public static void print(String[] beanDefinitions) {
		Arrays.asList(beanDefinitions).forEach(System.out::println);
	}

}
