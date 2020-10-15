package com.hsbc.tr.spring.computer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CompService computer = ctx.getBean(CompService.class);
		// CompService computer = (CompService) ctx.getBean("computer");
		System.out.println(computer.getPc());
	}

}
