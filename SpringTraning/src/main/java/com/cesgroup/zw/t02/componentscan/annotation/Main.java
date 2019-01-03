package com.cesgroup.zw.t02.componentscan.annotation;

import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

public class Main {

	public static void main(String[] args) {
		
		ClassPathScanningCandidateComponentProvider 
			provider = new ClassPathScanningCandidateComponentProvider(true);

		//provider.addExcludeFilter(new AnnotationTypeFilter(Component.class));
		provider.addIncludeFilter(new AnnotationTypeFilter(Component.class));
		/*provider.addIncludeFilter((metadataReader,metadataReaderFactory) ->{
			System.out.println(metadataReader.getClassMetadata().getClassName());
			
			return true;
		});*/

		Set<BeanDefinition> beanDefinitions = 
				provider.findCandidateComponents("com.cesgroup.zw.t02.componentscan.annotation");

		print(beanDefinitions);
		
		
		
	}
	
	public static void print(Set<BeanDefinition> beanDefinitions) {
		beanDefinitions.forEach(System.out::println);
	}

}
