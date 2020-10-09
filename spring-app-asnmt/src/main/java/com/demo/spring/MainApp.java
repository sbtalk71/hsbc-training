package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Object o=ctx.getBean("greeter2");
		
		//Greeter greeter=ctx.getBean(Greeter.class);
		System.out.println(o.getClass().getName());
		
		Greeter greeter=(Greeter)o;
		
		greeter.greet();

	}

}
