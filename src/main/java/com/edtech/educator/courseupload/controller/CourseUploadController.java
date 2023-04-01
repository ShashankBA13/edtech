package com.edtech.educator.courseupload.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edtech.educator.courseupload.service.CourseUploadService;
import com.edtech.educator.courseupload.vo.CourseBriefVO;

@RestController
@RequestMapping("/educator")
public class CourseUploadController {

    @Autowired
    private CourseUploadService courseUploadService;

    @PostMapping("/submit_course")
    public String uploadCourse(@ModelAttribute CourseBriefVO vo){

    System.out.println(vo);

        return "Course Upload";
    }
}