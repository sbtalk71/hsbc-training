package com.hsbc.tr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hsbc.tr.spring.service.EmpService;

public class SpringMain {

	public static void main(String[] args) {
		
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	EmpService service=(EmpService)ctx.getBean("empService");
	
	System.out.println(service.registerEmp(100, "James", "Bangalore", 89000));
	
	

	}

}
