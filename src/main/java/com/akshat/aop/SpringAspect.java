package com.akshat.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpringAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringAspect.class);
	
	@Before("execution(* com.akshat.layer.*.*.*(..))")
	public void logMethodName(JoinPoint jp) {
		LOGGER.info("Method initiated : " + jp.getSignature().getName());
	}
	
	@Around("execution(* com.akshat.layer.*.*.*(..))")
	public Object performanceMetric(ProceedingJoinPoint jp) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		
		Object obj = jp.proceed();
		
		long endTime = System.currentTimeMillis();
		
		LOGGER.info("Time take to complete the method : " + jp.getSignature().getName() + " is " + (endTime - startTime) + " ms");
		
		return obj;
	}
	
	@After("execution(* com.akshat.layer.repository.*.*(..))")
	public void logMethodExecCompleted() {
		LOGGER.info("Method execution completed !!!");
	}
}
