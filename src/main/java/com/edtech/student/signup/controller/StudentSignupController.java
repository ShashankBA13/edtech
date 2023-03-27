package com.edtech.student.signup.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentSignupController {

	// Endpoint which handles the student sign up process. Saves the data into the database and returns home page if successful
	@RequestMapping({"/signup"})
	public String studentSignUp(Model model) {
		return "Hello, welcome to signup";
	}
	
}