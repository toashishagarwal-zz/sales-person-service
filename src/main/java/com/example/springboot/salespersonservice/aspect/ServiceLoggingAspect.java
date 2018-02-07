package com.example.springboot.salespersonservice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceLoggingAspect {

	@Before("execution(* com..*Service.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Entering: " + joinPoint);
	}
	
	@AfterReturning(value = "execution(* com..*Service.*(..))", returning="result")
	public void logServiceAccess(JoinPoint joinPoint, Object result) {
		System.out.println("Completed: " + joinPoint);
		System.out.println("Value returned: " + result);
	}
}
