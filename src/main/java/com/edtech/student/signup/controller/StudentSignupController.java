package com.edtech.student.signup.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edtech.student.signup.service.StudentSignupService;
import com.edtech.student.signup.vo.StudentSignupVO;

@RestController
public class StudentSignupController {

	@Autowired
	private StudentSignupService service;

	/* End point which handles the student sign up process. Saves the data into the database and 
	   returns home page if successful */
	
	@PostMapping({"/signup"})
	public Map<String, String> studentSignUp(Model model, StudentSignupVO vo) {
		Map<String, String> res = service.studentSignup(vo);
		 if (res != null && res.containsKey("saved")) {
	            return res;
	        }
		return res;
	}	
}