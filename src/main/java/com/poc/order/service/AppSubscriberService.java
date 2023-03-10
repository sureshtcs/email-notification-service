package com.poc.order.service;

import com.poc.order.model.AppSubscriber;
import com.poc.order.repository.AppSubscriberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppSubscriberService {

    private static final Logger log = LoggerFactory.getLogger(AppSubscriberService.class);
    @Autowired
    private AppSubscriberRepository appSubscriberRepository;

    public AppSubscriber saveSubscriber(AppSubscriber subscriber) {
        log.info("Inside saveSubscriber method of AppSubscriberService");
        return appSubscriberRepository.save(subscriber);
    }

    public AppSubscriber getSubscriberById(Long id) {
        log.info("Inside getSubscriberById method of AppSubscriberService");
        return appSubscriberRepository.getAppSubscriberById(id);
    }
    public List getAllSubscribers() {
        log.info("Inside getAllSubscribers method of AppSubscriberService");
        return new ArrayList(appSubscriberRepository.findAll());
    }
}
