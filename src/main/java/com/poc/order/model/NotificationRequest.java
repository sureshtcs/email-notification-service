package com.poc.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(schema = "OSPCM", name = "OT_NOTIFICATION_REQUESTS")
@IdClass(NotificationRequestId.class)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest implements Serializable {
	@Id
	private BigDecimal headerId;
	@Id
	private String requestedBy;
	@Id
	private String requestedTo;

	private String notificationType;
	@Type(type = "yes_no")
	private Boolean notificationFlag;

	private LocalDateTime creationDate;

	private LocalDateTime lastUpdateDate;

	private String createdBy;

	private String lastUpdatedBy;

	private String requestedToName;

	private String requestedToSurname;
}
