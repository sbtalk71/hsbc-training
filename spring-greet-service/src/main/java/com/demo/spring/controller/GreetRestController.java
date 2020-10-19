package com.demo.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GreetRestController {

	@GetMapping(path = "/greetservice/greet/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> greet(@PathVariable("name") String name) {
		return ResponseEntity.ok("{\"greet\":\"Good Morning " + name + "\"}");
	}
}
