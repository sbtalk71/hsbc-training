package com.hsbc.tr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Greeter greeter = (Greeter) ctx.getBean("greeter");
		greeter.greet();
	}
}
