package com.edtech.student.signup.service;

import com.edtech.student.signup.dao.StudentSignupDAO;

public class StudentSignupServiceImpl implements StudentSignupService{

	public StudentSignupDAO dao;
	
	@Override
	public String studentSignup() {
		return dao.studentSignup();	
	}
	
}