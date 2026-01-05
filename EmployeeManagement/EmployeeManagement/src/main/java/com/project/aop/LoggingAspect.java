package com.project.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(* com.project.service.*.*(..))")
	public void beforeEachMethod(JoinPoint joinpoint) {
		logger.info("Entering method: {}",joinpoint.getSignature());		
	}
	
	@After("execution(* com.project.service.*.*(..))")
	public void afterEachMethod(JoinPoint joinpoint) {
		logger.info(joinpoint.getSignature().getName());		
	}
	
	@AfterReturning("execution(* com.project.service.*.*(..))")
	public void afterReturningEachMethod(JoinPoint joinpoint) {
		logger.info("Entering method: {}",joinpoint.getSignature());		
	}
	
	@AfterThrowing("execution(* com.project.service.*.*(..))")
	public void afterExceptionThrown(JoinPoint joinpoint,Exception ex) {
		logger.info("Service Exception: {}, message= {}", joinpoint.getSignature());		
	}

}
