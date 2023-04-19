package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String message = "Now trying debug 1. 2. 3. Greetings from Spring Boot + Tanzu!";
		return "<h1>" + message + "</h1>";
	}

}