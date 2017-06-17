package com.study.pattern.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
public class MyAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// Adding before service
	    methodDescription(invocation);
		System.out.println("Calling the MyAroundAdvice");
		return  invocation.proceed();
	}
	
	private void methodDescription(MethodInvocation invocation) {
	      String methodName = invocation.getMethod().getName();
	      Object[] args = invocation.getArguments();
	      String description = String.format("Before Services : %s(%s, %s)",
	              methodName, args[0], args[1]);
	      System.out.println(description);
	  }

	
}
						