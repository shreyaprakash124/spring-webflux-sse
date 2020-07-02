package com.flolabs.webfluxsse.service;

import org.springframework.http.codec.ServerSentEvent;
import org.springframework.stereotype.Service;

import com.flolabs.webfluxsse.dto.NotificationDTO;

import reactor.core.publisher.Flux;

@Service
public interface UserService {
	
	/**
	 * Fetch all the notifications
	 * 
	 * @param userId
	 * @return
	 */
	public Flux<ServerSentEvent<NotificationDTO>> getAllNotifications(String userId);
	
	/**
	 * Create notification
	 * 
	 * @param userNotificationEntity
	 */
	public void createNotifications(NotificationDTO notificationDTO);
}
