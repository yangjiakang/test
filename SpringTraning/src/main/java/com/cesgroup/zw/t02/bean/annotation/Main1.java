package com.cesgroup.zw.t02.bean.annotation;

import java.util.Arrays;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import com.cesgroup.zw.t02.componentscan.annotation.conf.Config;
import com.cesgroup.zw.t02.componentscan.annotation.conf.User;

public class Main1 {
	
	public static void main(String[] args) {
		
		
		SimpleBeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();

		registry.registerBeanDefinition("user", new RootBeanDefinition(User.class));
		
		print(registry.getBeanDefinitionNames());
		
		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(registry);
		
		reader.register(Config.class);

		print(registry.getBeanDefinitionNames());
		
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
		
		scanner.scan("com.cesgroup.zw.t02.componentscan");
		
		print(registry.getBeanDefinitionNames());
		
	}
	
	public static void print(String[] beanDefinitions) {
		Arrays.asList(beanDefinitions).forEach(System.out::println);
	}

}
