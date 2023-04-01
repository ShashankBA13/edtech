package com.edtech.educator.courseupload.vo;

import org.springframework.web.multipart.MultipartFile;

public class TopicsVO {

	private String topicName;
	private String topicDescription;
	private MultipartFile topicVideo;

	public String getTopicName() {
		return topicName;
	} 

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public MultipartFile getTopicVideo() {
		return topicVideo;
	}

	public void setTopicVideo(MultipartFile topicVideo) {
		this.topicVideo = topicVideo;
	}

	@Override
	public String toString() {
		return "TopicsVO [topicName=" + topicName + ", topicDescription=" + topicDescription + ", topicVideo="
				+ topicVideo + "]/n";
	}

}