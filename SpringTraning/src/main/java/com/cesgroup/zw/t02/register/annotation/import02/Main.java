package com.cesgroup.zw.t02.register.annotation.import02;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import com.cesgroup.zw.t02.register.annotation.import02.conf.Config;



@Import(Config.class)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
	
	
	
	
		print(context.getBeanDefinitionNames());
	}


public static void print(String[] beanDefinitions) {
	Arrays.asList(beanDefinitions).forEach(System.out::println);
}

}
