package com.study.pattern.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class GatewayAspect {
	
	//@Before("com.xyz.lib.Pointcuts.anyPublicMethod() && @annotation(auditable)"){}	
	//@After("allGatewayMethods()")	
	//@After(value="execution(* com.study.pattern.gateway..*(..)) && @annotation(auditEvent)",argNames="audiEvent")
	
	@After("allGatewayMethods()")
	//@After(value="execution(* com.study.pattern.gateway..*(..)) && @annotation(com.study.pattern.aspect.AuditEvent)",argNames="audiEvent")
	public void gateWayAspect(JoinPoint joinpoint){


		//Here i need Audit Object 
		//System.out.println("Here I need Audit Object from service class"+joinpoint);	
	//	System.out.println("   "+joinpoint.getArgs().length);
		Signature signature = joinpoint.getStaticPart().getSignature();
		//System.out.println("signature "+signature);
		MethodSignature methodSignature = (MethodSignature) joinpoint.getStaticPart().getSignature();
        Method method = methodSignature.getMethod();
      //  System.out.println(method.toString());  

      //  System.out.println("Madhukr :"+method.getAnnotation(AuditEvent.class));
        AuditEvent findAnnotation = AnnotationUtils.findAnnotation(method,com.study.pattern.aspect.AuditEvent.class);
        System.out.println(" Gateway Name  = " + findAnnotation.gateWayName() + " Service Name = " + findAnnotation.serviceName());
        
//        
//        if (method.isAnnotationPresent(AuditEvent.class)) {
//			Annotation annotation = method.getAnnotation(AuditEvent.class);
//			AuditEvent auditEvent = (AuditEvent) annotation;
//		   System.out.println(" Gateway Name = " + auditEvent.gateWayName() + " Service Name = " + auditEvent.serviceName());
//        }	
			
			
			
        /*Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        System.out.println("The total number of annotations "+parameterAnnotations.length);
        System.out.println();
        int args = parameterAnnotations.length;
        for (int argIndex = 0; argIndex < args; argIndex++) {
        	System.out.println("Entered into for loop");
            for (Annotation annotation : parameterAnnotations[argIndex]) {
            	System.out.println("Annotation Class :"+annotation.getClass());
                if (!(annotation instanceof AuditEvent))
                    continue;
                AuditEvent auditEvent = (AuditEvent) annotation;  
                System.out.println(" Gateway Name = " + auditEvent.gateWayName() + " Service Name = " + auditEvent.serviceName());
            }
        }*/
        
        
		
		//System.out.println("******************************************** Calling the logAspect **********************************************");
	}
	
	@Pointcut(value="execution(* com.study.pattern.gateway..*(..))") // && @annotation(com.study.pattern.aspect.AuditEvent)
	public void allGatewayMethods(){
		
	}
	

	//@Around("allGatewayMethods()")
	public Object auditLog(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("******************************************** Calling the auditLog Method **********************************************");		
		System.out.println("Here I need Audit Object"+joinpoint.getSourceLocation().toString());
			System.out.println("Here I need Audit Object"+joinpoint.getStaticPart().getSignature());	
			System.out.println("Here I need Audit Object"+joinpoint.getStaticPart());	
		System.out.println("******************************************** Calling the auditLog Method **********************************************");
		return joinpoint.proceed();
		
	}
	
	
	//@After("@annotation(com.study.pattern.aspect.AuditEvent)")
	public void methodA(JoinPoint joinpoint){
		System.out.println("******************************************** Calling the auditLog Method **********************************************");		
		System.out.println("Here I need Audit Object");
		
	}
		



}
