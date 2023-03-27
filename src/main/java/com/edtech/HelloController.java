package com.edtech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// A simple end point to check project running status
	@GetMapping("/hello")
	public String hello() {
		return "Hello my   World!!!";
	}
}
