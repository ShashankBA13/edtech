package com.edtech.student.signup.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edtech.student.signup.service.StudentSignupService;

@RestController
public class StudentSignupController {

	private StudentSignupService service;
	/* End point which handles the student sign up process. Saves the data into the database and 
	   returns home page if successful */
	
	@PostMapping({"/signup"})
	public String studentSignUp(Model model) {
		String result = service.studentSignup();
		return "Hello, welcome to signup";
	}
	
}