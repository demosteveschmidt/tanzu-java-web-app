package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String greeting() {
		// update here AND the test ;-)
		String message = "Greetings from Spring Boot + Tanzu!";
		return message;
	}

	@RequestMapping("/host")
	public String hostname() {
		String message = "Running on: " + System.getenv("HOSTNAME") + "\n";
		return message;
	}

}