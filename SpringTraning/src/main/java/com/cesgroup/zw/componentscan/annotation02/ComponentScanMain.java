package com.cesgroup.zw.componentscan.annotation02;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

import com.cesgroup.zw.componentscan.annotation02.dao.StaffDao;
import com.cesgroup.zw.componentscan.annotation02.dao.UserDao;



@ComponentScan(value="com.cesgroup.zw.componentscan.annotation02.dao",
useDefaultFilters=false,includeFilters= {
		@Filter(type=FilterType.CUSTOM,value=CustomTypeFilter.class)
		//@Filter(type=FilterType.ANNOTATION,value=Mapper.class) //可以通过注解类
})
public class ComponentScanMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanMain.class);
		
		System.out.println("-----------------------");
		
		print(context.getBeanDefinitionNames());
		
		StaffDao staffDao = context.getBean(StaffDao.class);
		
		System.out.println(staffDao.findAll());
		
		UserDao userDao =  context.getBean(UserDao.class);
		
		System.out.println(userDao.findAll());

	}

	public static void print(String[] beanNames) {

		Arrays.asList(beanNames).forEach(System.out::println);
	}

}
