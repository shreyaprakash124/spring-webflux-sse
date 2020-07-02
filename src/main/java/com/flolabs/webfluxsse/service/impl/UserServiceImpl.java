package com.flolabs.webfluxsse.service.impl;

import org.springframework.http.codec.ServerSentEvent;
import org.springframework.stereotype.Service;

import com.flolabs.webfluxsse.dto.NotificationDTO;
import com.flolabs.webfluxsse.service.UserService;

import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxProcessor;
import reactor.core.publisher.FluxSink;

@Service
public class UserServiceImpl implements UserService {
	
	FluxProcessor<NotificationDTO, NotificationDTO> emitter;

	FluxSink<NotificationDTO> sink;

	public UserServiceImpl() {
		this.emitter = EmitterProcessor.create();
		this.sink = emitter.sink();
	}

	@Override
	public Flux<ServerSentEvent<NotificationDTO>> getAllNotifications(String userId) {
		return emitter.filter(u -> u.getUserId().equals(userId)).map(e -> ServerSentEvent.builder(e).build());
	}

	@Override
	public void createNotifications(NotificationDTO notificationDTO) {
		sink.next(notificationDTO);
	}

}
