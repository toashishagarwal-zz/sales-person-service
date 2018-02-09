package com.example.springboot.salespersonservice.aspect;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceLoggingAspect {
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	@Before("execution(* com..*Service.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Entering: " + joinPoint);
	}
	
	@AfterReturning(value = "execution(* com..*Service.*(..))", returning="result")
	public void logServiceAccess(JoinPoint joinPoint, Object result) {
		logger.info("Completed: " + joinPoint);
		logger.info("Value returned: " + result);
	}
}
