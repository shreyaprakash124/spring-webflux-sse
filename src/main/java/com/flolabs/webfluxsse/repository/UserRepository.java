package com.flolabs.webfluxsse.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.flolabs.webfluxsse.entity.UserNotificationEntity;

public interface UserRepository extends ReactiveCrudRepository<UserNotificationEntity, Long>{

}
