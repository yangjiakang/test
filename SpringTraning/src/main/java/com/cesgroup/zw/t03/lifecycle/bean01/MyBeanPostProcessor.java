package com.cesgroup.zw.t03.lifecycle.bean01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor-----------postProcessBeforeInitialization---"+beanName);
		System.out.println();
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor-----------postProcessAfterInitialization---"+beanName);
		System.out.println();
		return bean;
	}

}
