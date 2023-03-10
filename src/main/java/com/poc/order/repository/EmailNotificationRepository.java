package com.poc.order.repository;

import com.poc.order.model.NotificationRequest;
import com.poc.order.model.NotificationRequestId;
import org.springframework.data.repository.CrudRepository;

public interface EmailNotificationRepository extends CrudRepository<NotificationRequest, NotificationRequestId> {


}
