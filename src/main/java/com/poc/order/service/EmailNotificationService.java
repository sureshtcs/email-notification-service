package com.poc.order.service;

import com.poc.order.model.NotificationRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmailNotificationService {

	ResponseEntity<String> submitEmailNotification(NotificationRequest request);

	List<NotificationRequest> getAllNotification();
}
