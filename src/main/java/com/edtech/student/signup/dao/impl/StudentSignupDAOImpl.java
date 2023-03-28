package com.edtech.student.signup.dao.impl;

import com.edtech.student.signup.dao.StudentSignupDAO;
import com.edtech.student.signup.entity.StudentSignupEntity;
import com.edtech.student.signup.repository.StudentSignupRepository;
import com.edtech.student.signup.vo.StudentSignupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class StudentSignupDAOImpl implements StudentSignupDAO{

	@Autowired
	public StudentSignupRepository repo;
	
	@Override
	public String studentSignup(StudentSignupVO vo, String userId) {
		StudentSignupEntity entity = new StudentSignupEntity();
		entity.setEmail(vo.getEmail());
		entity.setUserId(userId);
		entity.setName(vo.getName());
		entity.setPassword(org.mindrot.jbcrypt.BCrypt.hashpw(vo.getPassword(), org.mindrot.jbcrypt.BCrypt.gensalt(12)));
		try {
		    repo.save(entity);
		    return "success";
		} catch (DataIntegrityViolationException e) {
		    if (e.getCause() instanceof SQLException sqlException) {
				if (sqlException.getErrorCode() == 2627 || sqlException.getErrorCode() == 2601) {
		            // Unique constraint violation error
		            String msg = "A unique constraint violation occurred: " + sqlException.getMessage();
		            System.out.println(msg);
		            return "failed";
		        }
		    }
		    e.printStackTrace();
		    return "failed";
		}
	}

	@Override
	public boolean emailExists(String email) {
		StudentSignupEntity studentSignupEntity = repo.emailExists(email);
		return studentSignupEntity!=null;
	}
}