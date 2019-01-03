package com.cesgroup.zw.componentscan.annotation02;

import java.io.IOException;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class CustomTypeFilter implements TypeFilter{

	
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {

		boolean result = metadataReader.getClassMetadata().isInterface();
		
		if(result) {
			
			CachingMetadataReaderFactory cachingMetadataReaderFactory = (CachingMetadataReaderFactory) metadataReaderFactory;
			
			GenericApplicationContext context =  (GenericApplicationContext) cachingMetadataReaderFactory.getResourceLoader();
			
			RootBeanDefinition beanDefinition = new RootBeanDefinition();
			
			
			try {
				
				Class clz = Class.forName(metadataReader.getClassMetadata().getClassName());
			
				beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(clz);
				
				beanDefinition.setBeanClass(DaoFactoryBean.class);
				
				context.registerBeanDefinition(clz.getName(), beanDefinition);
				
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		return result;// 如果匹配成功就不扫描
	}

	


}
