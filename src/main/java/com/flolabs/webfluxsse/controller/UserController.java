package com.flolabs.webfluxsse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.RestController;

import com.flolabs.webfluxsse.api.UserApi;
import com.flolabs.webfluxsse.dto.NotificationDTO;
import com.flolabs.webfluxsse.service.UserService;

import io.swagger.annotations.Api;
import reactor.core.publisher.Flux;

@Api(tags = "Notification")
@RestController
public class UserController implements UserApi {

	@Autowired
	UserService userService;

	@Override
	public Flux<ServerSentEvent<NotificationDTO>> getAllNotifications(String userId) {
		return userService.getAllNotifications(userId);
	}

	@Override
	public void createNotifications(NotificationDTO userNotificationEntity) {
		userService.createNotifications(userNotificationEntity);
	}

}
