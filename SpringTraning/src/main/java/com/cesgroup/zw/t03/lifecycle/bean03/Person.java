package com.cesgroup.zw.t03.lifecycle.bean03;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean{
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Person destroy........");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Person afterPropertiesSet........");
	}
}
