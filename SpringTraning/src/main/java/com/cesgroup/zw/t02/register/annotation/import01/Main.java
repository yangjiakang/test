package com.cesgroup.zw.t02.register.annotation.import01;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;



import com.cesgroup.zw.t02.register.annotation.import01.conf.Car;
import com.cesgroup.zw.t02.register.annotation.import01.conf.Config;
import com.cesgroup.zw.t02.register.annotation.import01.conf.Person;



@Import(Config.class)
public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		Car car = context.getBean(Car.class); 
		
		Car car1 = context.getBean(Person.class).getCar();
		
		System.out.println(car == car1);
		
		print(context.getBeanDefinitionNames());

	}
	
	public static void print(String[] beanDefinitions) {
		Arrays.asList(beanDefinitions).forEach(System.out::println);
	}


}
