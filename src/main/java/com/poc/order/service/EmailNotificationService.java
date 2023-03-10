package com.poc.order.service;

import com.poc.order.model.NotificationRequest;
import com.poc.order.repository.EmailNotificationRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Log4j2
public class EmailNotificationService{
	@Autowired
	private EmailNotificationRepository emailNotificationRepository;

	public NotificationRequest submitEmailNotification(NotificationRequest request) {
		log.info("Inside submitEmailNotification method of EmailNotificationService");

		NotificationRequest notificationRequest = NotificationRequest.builder()
			.notificationType(request.getNotificationType())
			.notificationFlag(request.getNotificationFlag())
			.headerId(request.getHeaderId())
			.requestedBy(request.getRequestedBy())
			.requestedTo(request.getRequestedTo())
			.createdBy(request.getCreatedBy())
			.creationDate(LocalDateTime.now())
			.lastUpdateDate(LocalDateTime.now())
			.lastUpdatedBy(request.getLastUpdatedBy())
			.requestedToName(request.getRequestedBy())
			.requestedToSurname(request.getRequestedBy())
			.build();
		return emailNotificationRepository.save(notificationRequest);
	}

	public List getAllNotification() {
		log.info("Inside getAllNotification method of EmailNotificationService");
		return (List<NotificationRequest>) emailNotificationRepository.findAll();
	}

}
