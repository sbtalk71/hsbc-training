package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.items.Computer;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Computer computer=(Computer)ctx.getBean("computer");
		
		System.out.println(computer.getSpecs());
		
		computer.getRam().setRamSize(32);

		System.out.println(computer.getSpecs());
	}

}
