package com.cesgroup.zw.t02.register.annotation.conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Conditional;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {
	
	
	Class<?>[] value() ;
	
	
}
