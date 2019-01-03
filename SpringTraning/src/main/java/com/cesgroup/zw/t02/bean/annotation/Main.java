package com.cesgroup.zw.t02.bean.annotation;

import java.util.Arrays;

import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

import com.cesgroup.zw.t02.bean.annotation.beans.Car;
import com.cesgroup.zw.t02.bean.annotation.beans.Person;

public class Main {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
				
		RootBeanDefinition definitions = new RootBeanDefinition(Car.class);
		
		definitions.getConstructorArgumentValues().addIndexedArgumentValue(0,"BM");
		
		context.registerBeanDefinition("car", definitions);
		
		definitions = new RootBeanDefinition(Person.class);

		definitions.getPropertyValues().add("car", new RuntimeBeanReference("car"));

		context.registerBeanDefinition("person", definitions);
		
		print(context.getBeanDefinitionNames());
		
		Car car = context.getBean(Car.class);
		
		System.out.println(car);
		
		System.out.println(context.getBean(Person.class).getCarName());
		
	}

	public static void print(String[] beanDefinitions) {
		Arrays.asList(beanDefinitions).forEach(System.out::println);
	}
}
