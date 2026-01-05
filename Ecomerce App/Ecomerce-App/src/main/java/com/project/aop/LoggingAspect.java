package com.project.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	
private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);

@Pointcut("excution(* com.project.controllers.*.*(..))")
public void controllerLayer() {
}

@Pointcut("excution(* com.project.services.*.*(..))")
public void serviceLayer() {
}


@Pointcut("excution(* com.project.daos.*.*(..))")
public void daoLayer() {
}
	
	@Before("controllerLayer()||serviceLayer()||daoLayer()")
	public void beforeEachMethod(JoinPoint joinpoint) {
		logger.info("Entering method: {}",joinpoint.getSignature().getName());		
	}
	
	@After("controllerLayer()||serviceLayer()||daoLayer()")
	public void afterEachMethod(JoinPoint joinpoint) {
		logger.info(joinpoint.getSignature().getName());		
	}
	
	@AfterReturning("controllerLayer()||serviceLayer()||daoLayer()")
	public void afterReturningEachMethod(JoinPoint joinpoint) {
		logger.info("Entering method: {}",joinpoint.getSignature());		
	}
	
	@AfterThrowing("controllerLayer()||serviceLayer()||daoLayer()")
	public void afterExceptionThrown(JoinPoint joinpoint,Exception ex) {
		logger.info("Service Exception: {}, message= {}", joinpoint.getSignature());		
	}

}
