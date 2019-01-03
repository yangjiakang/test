package com.cesgroup.zw.componentscan.annotation01;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;


@ComponentScan(value="com.cesgroup.zw.componentscan.annotation01",
useDefaultFilters=false,includeFilters= {
		@Filter(type=FilterType.CUSTOM,value=CustomTypeFilter.class)
		//@Filter(type=FilterType.ANNOTATION,value=Mapper.class) //可以通过注解类
})
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
