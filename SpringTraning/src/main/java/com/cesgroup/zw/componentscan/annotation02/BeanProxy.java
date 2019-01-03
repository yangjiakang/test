package com.cesgroup.zw.componentscan.annotation02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SuppressWarnings("rawtypes")
public class BeanProxy implements InvocationHandler{
	
	
	private Class target;
	
	public  Object newInstance(Class target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClassLoader(),new Class[] {target}, this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("call BeanProxy ..........."+target.getName());
		
		System.out.println("根据请求对象自己扩展代码");
		
		return null;
		
		
	}

}
