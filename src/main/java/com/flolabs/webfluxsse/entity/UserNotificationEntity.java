package com.flolabs.webfluxsse.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USER_NOTIFICATION_ENTITY")
public class UserNotificationEntity {

	@Id
	private Long notificationId;
	private String userId;
	private String notificationDetails;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNotificationDetails() {
		return notificationDetails;
	}

	public void setNotificationDetails(String notificationDetails) {
		this.notificationDetails = notificationDetails;
	}

}
