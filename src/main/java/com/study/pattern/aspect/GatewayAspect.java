package com.study.pattern.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GatewayAspect {
	
	//@Before("allGatewayMethods()")
	public void logAspect(JoinPoint joinpoint){
		System.out.println("******************************************** Calling the logAspect **********************************************");		
		//Here i need Audit Object 
		System.out.println("Here I need Audit Object from service class");	
		System.out.println("   "+joinpoint.getArgs().length);
		Signature signature = joinpoint.getStaticPart().getSignature();
		System.out.println("signature "+signature);
		MethodSignature methodSignature = (MethodSignature) joinpoint.getStaticPart().getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.toString());
		
		System.out.println("******************************************** Calling the logAspect **********************************************");
	}
	
	@Pointcut("execution(* com.study.pattern.gateway..*(..))")
	public void allGatewayMethods(){
		
	}
	
	@Around("allGatewayMethods()")
	public Object auditLog(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("******************************************** Calling the auditLog Method **********************************************");		
		System.out.println("Here I need Audit Object"+joinpoint.getSourceLocation());
			System.out.println("Here I need Audit Object"+joinpoint.getStaticPart().getSignature());	
			System.out.println("Here I need Audit Object"+joinpoint.getStaticPart());	
		System.out.println("******************************************** Calling the auditLog Method **********************************************");
		return joinpoint.proceed();
		
	}

}
