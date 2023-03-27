package com.edtech.student.signup.repository;

import com.edtech.student.signup.entity.StudentSignupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSignupRepository extends JpaRepository<StudentSignupEntity, Integer> {

}
