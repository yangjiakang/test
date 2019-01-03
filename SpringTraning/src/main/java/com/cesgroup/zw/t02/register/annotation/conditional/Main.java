package com.cesgroup.zw.t02.register.annotation.conditional;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.cesgroup.zw.t02.register.annotation.conditional")
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
