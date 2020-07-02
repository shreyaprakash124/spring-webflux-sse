package com.flolabs.webfluxsse.api;

import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flolabs.webfluxsse.dto.NotificationDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Flux;

@RequestMapping(value = "notifications")
public interface UserApi {

	@ApiOperation(value = "Returns all relevant notifications for an user", nickname = "getAllNotifications", response = Flux.class, tags = {
			"Notification" })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "List of all notifications", response = Flux.class) })
	@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	Flux<ServerSentEvent<NotificationDTO>> getAllNotifications(@RequestParam(value = "userId") String userId);

	@ApiOperation(value = "Create a new notification for an user", nickname = "createNotifications", tags = {
			"Notification" })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Create a new notification for an user") })
	@PostMapping(consumes = { "application/json" })
	void createNotifications(@RequestBody NotificationDTO notificationDTO);

}
