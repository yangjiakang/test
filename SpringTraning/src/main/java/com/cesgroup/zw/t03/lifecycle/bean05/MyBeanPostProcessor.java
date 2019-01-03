package com.cesgroup.zw.t03.lifecycle.bean05;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBeanPostProcessor implements BeanPostProcessor,ApplicationContextAware {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor-----------postProcessBeforeInitialization---"+beanName);
		
		Class<?> currentClass = bean.getClass();
        while (currentClass != null) {
	        Field[] fields = currentClass.getDeclaredFields();
	        for (Field field : fields) {
	            try {
	                if (! field.isAccessible()) {
	                    field.setAccessible(true);
	                }
	                CesAutowired reference = field.getAnnotation(CesAutowired.class);
	            	if (reference != null) {
		                Object value = applicationContext.getBean(field.getType());
		                if (value != null) {
		                	field.set(bean, value);
		                }
	            	}
	            } catch (Throwable e) {
	            	
	            }
	        }
	        currentClass = currentClass.getSuperclass();
        }
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor-----------postProcessAfterInitialization---"+beanName);
	
		return bean;
	}

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		this.applicationContext = applicationContext;
	}
	
	
	

}
