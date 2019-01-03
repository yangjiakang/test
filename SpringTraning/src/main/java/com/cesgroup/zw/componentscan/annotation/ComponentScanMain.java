package com.cesgroup.zw.componentscan.annotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;


@ComponentScan(value="com.cesgroup.zw.componentscan.annotation")
public class ComponentScanMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanMain.class);
		System.out.println("-----------------------");
		print(context.getBeanDefinitionNames());

	}

	public static void print(String[] beanNames) {

		Arrays.asList(beanNames).forEach(System.out::println);
	}

}
