package com.cesgroup.zw.t02.register.annotation.import03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;

import com.cesgroup.zw.t02.register.annotation.import03.conf.Config;



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(Config.class)
public @interface BeanScan {
	
	@AliasFor("value")
	String[]  basePackage() default  {};
	
	@AliasFor("basePackage")
	String[] value() default {};
}
