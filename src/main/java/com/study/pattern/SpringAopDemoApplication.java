package com.study.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import com.study.pattern.bo.Audit;
import com.study.pattern.service.impl.EmployServiceImpl;

@SpringBootApplication
@EnableCaching(proxyTargetClass=true)
public class SpringAopDemoApplication  {
	
	@Autowired
	EmployServiceImpl employServiceImpl;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringAopDemoApplication.class, args);
		EmployServiceImpl bean = run.getBean(EmployServiceImpl.class);
		Audit audit = new Audit("EmployGateway","GetEmployeList");
		System.out.println(bean.getEmployeList(1,audit));	
	}
}
