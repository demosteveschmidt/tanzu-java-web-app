package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		// update here AND the test ;-)
		String message = "Greetings from Spring Boot + Tanzu!";
		// had "<h1>" + message + "</h1>" BUT did not update test :-/
		return message;
	}

}

// how to force an update without a code change?