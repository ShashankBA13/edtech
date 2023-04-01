package com.edtech.educator.courseupload.service.impl;

import com.edtech.educator.courseupload.dao.CourseUploadDAO;
import com.edtech.educator.courseupload.service.CourseUploadService;
import com.edtech.educator.courseupload.vo.CourseBriefVO;
import com.edtech.educator.courseupload.vo.TopicsVO;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CourseUploadServiceImpl implements CourseUploadService {

	@Autowired
	private CourseUploadDAO dao;

	@Override
	public Map<String, String> uploadCourse(CourseBriefVO vo, Integer instructorid) {
		String courseId = generateCourseId();
		createFoldersForCourse(vo);
		return dao.uploadCourse(vo, courseId, instructorid);
	}

	private void createFoldersForCourse(CourseBriefVO vo) {
		
		// storing the introduction video of the course
		
		String introVideoPath = "Course Content/" + vo.getTitle() + "/" + "intro video" + "/";
		MultipartFile introVideo = vo.getVideo();
		try {
			File introVideoDir = new File(introVideoPath);
			if (!introVideoDir.exists()) {
				introVideoDir.mkdirs();
			}
			File introVideoFile = new File(introVideoDir, introVideo.getOriginalFilename());
			introVideo.transferTo(introVideoFile);
			vo.setVideoPath(introVideoPath);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// storing topic wise videos
		
		List<TopicsVO> list = vo.getTopicsList();
		for (TopicsVO topicsVO : list) {
			String topicVideoPath = "Course Content/" + vo.getTitle() + "/" + "topics/" + topicsVO.getTopicName() + "/";
			MultipartFile topicVideo = topicsVO.getTopicVideo();
			try {
				File topicVideoDir = new File(topicVideoPath);
				if (!topicVideoDir.exists()) {
					topicVideoDir.mkdirs();
				}
				File topicVideoFile = new File(topicVideoDir, topicVideo.getOriginalFilename());
				topicVideo.transferTo(topicVideoFile);
				topicsVO.setVideoPath(topicVideoPath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// A null pointer exception will arise in a case where user adds a topic and
		// then deleted it later.
		// The variable in the HTML topicCounter keeps incrementing. And if there is no
		// video for that.

	}

	private String generateCourseId() {
		String res = UUID.randomUUID().toString();
		res = res.replace("-", "");
		return res.substring(0, 7);
	}

}