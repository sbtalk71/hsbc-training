package com.demo.spring;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessage {

	public void getMessage() {

		System.out.println("Hello World from Spring Boot");
	}
}
