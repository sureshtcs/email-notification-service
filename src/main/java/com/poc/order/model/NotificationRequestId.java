package com.poc.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequestId implements Serializable {
	@Id
	private BigDecimal headerId;
	@Id
	private String requestedBy;

}
