package com.cesgroup.zw.t03.lifecycle.bean01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements InitializingBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware,DisposableBean {

	
	private String name;
	
	public Person() {
		System.out.println("Person constructor........");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person afterPropertiesSet........");
	}
	
	@PostConstruct
	public void PostConstruct() {
		System.out.println("Person PostConstruct........");
	}
	
	
	public void initMethod() {
		System.out.println("Person initMethod........");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Person setApplicationContext........");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Person setBeanFactory........");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Person setBeanName........");
	}

	public String getName() {
		return name;
	}

	@Resource(name="personName")
	public void setName(String name) {
		System.out.println("Person setName........");
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Person destroy........");
	}
	
	
	public void destroyMethod() {
		System.out.println("Person destroyMethod........");
	}
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("Person PreDestroy........");
	}
	
	
}
