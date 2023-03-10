package com.poc.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CM_APP_SUBSCRIBERS")
public class AppSubscriber {

    @Id
    @Column(name = "APP_SUBSCRIBERS_ID")
    private BigDecimal id;
    private String subscriberCode;
    private BigDecimal appId;
    private String createdBy;
    private LocalDateTime creationDate;
    private String altKey;
}
