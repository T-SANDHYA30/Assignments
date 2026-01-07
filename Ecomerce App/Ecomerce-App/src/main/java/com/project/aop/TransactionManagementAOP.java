package com.project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class TransactionManagementAOP {
	
	@Around("@annotation(org.springframework.transaction.annotation.Transactional)")
	public Object transactionAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		//beginTransaction();
		try {
			Object result =pjp.proceed();
			//commitTransaction();
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return pjp;
		
	}
	
	

}
