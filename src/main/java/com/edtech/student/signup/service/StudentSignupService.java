package com.edtech.student.signup.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.edtech.student.signup.vo.StudentSignupVO;

public interface StudentSignupService {

	public Map<String, String> studentSignup(StudentSignupVO vo);
}