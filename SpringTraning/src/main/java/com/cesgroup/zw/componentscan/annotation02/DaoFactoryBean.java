package com.cesgroup.zw.componentscan.annotation02;

import org.springframework.beans.factory.FactoryBean;

@SuppressWarnings("rawtypes")
public class DaoFactoryBean implements FactoryBean{
	
	private Class clazz;

	private Object target;
	public DaoFactoryBean(Class clz) {
		this.clazz = clz;
		BeanProxy beanProxy = new BeanProxy();
		target=  beanProxy.newInstance(clazz);
	}
	
	
	@Override
	public Object getObject() throws Exception {
		return target;
	}

	@Override
	public Class getObjectType() {
		return clazz;
	}

}
