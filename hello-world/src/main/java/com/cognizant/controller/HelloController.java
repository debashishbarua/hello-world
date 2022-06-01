package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!!!";
	}
	
	@GetMapping("/v1/hello/{name}")
	public String sayHelloToXX(@PathVariable("name") String name) {
		return "Hello Mr. " +name;
	}
	
	
}
