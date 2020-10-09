package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service

public class Greeter {

	@Autowired
	private Greeting greeting;
	
	public void greet() {
		System.out.println(greeting.greetMessage());
	}
}
