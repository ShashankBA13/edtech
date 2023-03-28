package com.edtech.student.signup.dao;

import com.edtech.student.signup.vo.StudentSignupVO;


public interface StudentSignupDAO {

	public String studentSignup(StudentSignupVO vo, String studentId);
	
	boolean emailExists(String email);
	
}