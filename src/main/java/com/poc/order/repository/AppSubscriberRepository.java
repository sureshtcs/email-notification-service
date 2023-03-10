package com.poc.order.repository;

import com.poc.order.model.AppSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppSubscriberRepository extends JpaRepository<AppSubscriber, Long> {
    AppSubscriber getAppSubscriberById(Long id);
}
