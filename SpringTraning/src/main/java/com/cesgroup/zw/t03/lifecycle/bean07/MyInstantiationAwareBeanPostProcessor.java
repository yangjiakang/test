package com.cesgroup.zw.t03.lifecycle.bean07;

import java.beans.PropertyDescriptor;
import java.util.HashMap;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor  postProcessBeforeInstantiation "+beanName);
		return new HashMap();
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor  postProcessAfterInstantiation "+beanName);
		return false;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor  postProcessPropertyValues "+beanName);
		return pvs;
	}

	
	
}
