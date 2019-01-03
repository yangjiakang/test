package com.cesgroup.zw.componentscan.annotation01;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import com.cesgroup.zw.componentscan.annotation01.mapper.Dao;

public class CustomTypeFilter implements TypeFilter{

	
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {

		System.out.println("call CustomTypeFilter "+ metadataReader.getClassMetadata().getClassName());
		
		boolean result = Arrays.asList(metadataReader.getClassMetadata().getInterfaceNames()).contains(Dao.class.getName());
		
		
		//System.out.println(result);
		return result;// 如果匹配成功就不扫描
	}

	


}
