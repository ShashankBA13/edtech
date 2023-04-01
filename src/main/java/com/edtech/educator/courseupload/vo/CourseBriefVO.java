package com.edtech.educator.courseupload.vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class CourseBriefVO {

	private String title;
	private String description;
	private MultipartFile video;
	private Double price;
	private String videoPath;
	private List<TopicsVO> topicsList;

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public MultipartFile getVideo() {
		return video;
	}

	public void setVideo(MultipartFile video) {
		this.video = video;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TopicsVO> getTopicsList() {
		return topicsList;
	}

	public void setTopicsList(List<TopicsVO> topicsList) {
		this.topicsList = topicsList;
	}

}