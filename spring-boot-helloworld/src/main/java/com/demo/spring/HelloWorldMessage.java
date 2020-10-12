package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessage {

	public String getMessage() {
		return "Hello World from Spring Boot";
	}
}
