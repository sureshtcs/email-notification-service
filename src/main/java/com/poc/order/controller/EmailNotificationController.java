package com.poc.order.controller;

import com.poc.order.model.NotificationRequest;
import com.poc.order.service.EmailNotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailNotificationController {

    private static final Logger log = LoggerFactory.getLogger(AppSubscriberController.class);
    @Autowired
    private EmailNotificationService emailNotificationService;

    @PostMapping("/")
    public NotificationRequest submitEmailNotification(@RequestBody NotificationRequest notificationRequest) {
        log.info("Inside submitEmailNotification method of EmailNotificationController");
        return emailNotificationService.submitEmailNotification(notificationRequest);
    }

    @GetMapping("/")
    public List getAllNotification() {
        log.info("Inside getAllNotification method of EmailNotificationController");
        return emailNotificationService.getAllNotification();
    }
}
