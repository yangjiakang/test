package com.cesgroup.zw.t02.register.annotation.conditional;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.cesgroup.zw.t02.register.annotation.import03.BeanScan;

public class OnBeanCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		Map<String, Object> map = metadata.getAnnotationAttributes(ConditionalOnBean.class.getName());
		AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(map);
		Class<?>[] classes = annotationAttributes.getClassArray("value");
		boolean isContain = false;
		for(Class<?> clz: classes) {
			isContain = context.getBeanFactory().containsBean(clz.getSimpleName().toLowerCase());
			if(!isContain) {
				break;
			}
		}
		return isContain;
	}

}
