package com.cesgroup.zw.componentscan.xml01;

import java.io.IOException;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class CustomTypeFilter implements TypeFilter{

	
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		
		
		
		System.out.println("call CustomTypeFilter "+ metadataReader.getClassMetadata().getClassName());
		
		
		return false;// 如果匹配成功就不扫描
	}

	


}
