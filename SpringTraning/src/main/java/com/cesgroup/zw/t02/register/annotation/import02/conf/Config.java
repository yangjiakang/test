package com.cesgroup.zw.t02.register.annotation.import02.conf;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class Config implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		return new String[] {Car.class.getName(),Person.class.getName()};
	}

}
