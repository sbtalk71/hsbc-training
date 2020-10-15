package com.hsbc.tr.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Greeter {

	@Autowired
	private Greeting greeting;

	public void greet() {
		System.out.println(greeting.greetMessage());
	}
}
