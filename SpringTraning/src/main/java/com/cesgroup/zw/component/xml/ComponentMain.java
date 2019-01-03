package com.cesgroup.zw.component.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:/com/cesgroup/zw"
						+ "/component/xml/Component.xml");
		
		User user = context.getBean(User.class);
		
		System.out.println(user);

	}

}
