package com.cesgroup.zw.component.annotation;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ComponentAnnotation {
	
	public ComponentAnnotation() {
		System.out.println("call ComponentAnnotation constructor.....");
	}
	
	@Bean
	public User user() {
		return new User();
	}
	
	public static void main(String[] args) {
		
		ApplicationContext 
			context = new AnnotationConfigApplicationContext(ComponentAnnotation.class);
		System.out.println("-----------------------");
		print(context.getBeanDefinitionNames());
		
	}
	public static void print(String[] beanNames) {
		
		Arrays.asList(beanNames).forEach(System.out::println);
	}
}
