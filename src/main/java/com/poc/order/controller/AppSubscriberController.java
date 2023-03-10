package com.poc.order.controller;

import com.poc.order.model.AppSubscriber;
import com.poc.order.service.AppSubscriberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class AppSubscriberController {
    private static final Logger log = LoggerFactory.getLogger(AppSubscriberController.class);
    @Autowired
    private AppSubscriberService subscriberService ;

    @PostMapping("/")
    public AppSubscriber saveSubscriber(@RequestBody AppSubscriber subscriber) {
        log.info("Inside saveDepartment method of AppSubscriberController");
        return subscriberService.saveSubscriber(subscriber);
    }

    @GetMapping("/{id}")
    public AppSubscriber getSubscriberById(@PathVariable("id") Long id) {
        log.info("Inside getSubscriberById method of AppSubscriberController");
        return subscriberService.getSubscriberById(id);
    }

    @GetMapping("/")
    public List getAllSubscriber() {
        log.info("Inside getAllSubscriber method of AppSubscriberController");
        return subscriberService.getAllSubscribers();
    }
}
