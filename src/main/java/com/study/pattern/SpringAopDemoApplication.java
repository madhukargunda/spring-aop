package com.study.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import com.study.pattern.service.impl.CustomerServiceImpl;
import com.study.pattern.service.impl.EmployServiceImpl;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
@EnableCaching(proxyTargetClass=true)
public class SpringAopDemoApplication  {
	
	@Autowired
	EmployServiceImpl employServiceImpl;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringAopDemoApplication.class, args);
	
		
		EmployServiceImpl employeService = run.getBean(EmployServiceImpl.class);
		employeService.getEmployeList();		
		
		
		CustomerServiceImpl cusService = run.getBean(CustomerServiceImpl.class);
		cusService.getCustomerList();
		
	}
	
	
//	@Bean
//    @Primary
//    public ProxyFactoryBean testProxyFactoryBean() {
//        ProxyFactoryBean testProxyFactoryBean = new ProxyFactoryBean();
//        testProxyFactoryBean.setTarget(employServiceImpl);
//        testProxyFactoryBean.setInterceptorNames("myAroundAdvice");
//        return testProxyFactoryBean;
//    }
}
