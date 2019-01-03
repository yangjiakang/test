package com.cesgroup.zw.componentscan.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:/com/cesgroup/zw"
						+ "/componentscan/xml/Component.xml");
		
		User user = context.getBean(User.class);
		
		System.out.println(user);

	}

}
