package com.cesgroup.zw.t02.register.annotation.import03.conf;

import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import com.cesgroup.zw.t02.register.annotation.import03.BeanScan;

public class Config implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		
		Map<String, Object> map = importingClassMetadata.getAnnotationAttributes(BeanScan.class.getName(),true);
		AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(map);
		
		String[] basePackages = annotationAttributes.getStringArray("basePackage");
		
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry,false);
		
		scanner.addIncludeFilter(( metadataReader,  metadataReaderFactory)->{
			return true;
		});
		
		scanner.scan(basePackages);

	
	}

}
