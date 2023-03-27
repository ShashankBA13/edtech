package com.edtech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// A simple endpoint to check project running status
	@RequestMapping("/hello")
	public String hello() {
		return "Hello my   World!!!";
	}
}