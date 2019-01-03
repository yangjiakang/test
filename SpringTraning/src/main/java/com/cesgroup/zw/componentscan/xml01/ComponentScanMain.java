package com.cesgroup.zw.componentscan.xml01;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:/com/cesgroup/zw"
						+ "/componentscan/xml01/Component.xml");
		
		
		
		System.out.println("-----------------------");
		print(context.getBeanDefinitionNames());
		
	}
	public static void print(String[] beanNames) {
		
		Arrays.asList(beanNames).forEach(System.out::println);
	}

}
