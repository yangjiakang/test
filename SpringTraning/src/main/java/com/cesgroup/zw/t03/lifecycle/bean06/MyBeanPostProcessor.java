package com.cesgroup.zw.t03.lifecycle.bean06;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor,ApplicationContextAware {

	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.applicationContext = applicationContext;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Class<?> currentClass = bean.getClass();
		while (currentClass != null) {
			Method[] methods = currentClass.getMethods();
			for (Method method : methods) {
				try {
					Parameter[] references = method.getParameters();
//					if(references.length>0){
						for (Parameter reference: references){
							CesAutowired cesAutowired = reference.getAnnotation(CesAutowired.class);
//							if(cesAutowired!=null){
								method.invoke(bean,applicationContext.getBean(reference.getType()));
//							}
						}
//					}

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
		System.out.println();
		return bean;
	}



}
