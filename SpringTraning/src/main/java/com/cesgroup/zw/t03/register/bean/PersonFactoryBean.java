package com.cesgroup.zw.t03.register.bean;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean<Person>{

	@Override
	public Person getObject() throws Exception {
		
		System.out.println("call ------------------");
		// TODO Auto-generated method stub
		return new Person();
	}

	@Override
	public Class<Person> getObjectType() {
		
		return Person.class;
	}


}
