package com.nt.Doucement;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document(collection ="Tourist11")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist implements Serializable {
	@Id
	private Integer touristId; //fixed name
	private String touristName;
	private String  nativePlace;
	private Float age;
	private String PassportName;
	private Long contactName;
	private Boolean isvaccinated;
	private Integer visaDuration;
	private LocalDateTime visaExpiryTime;
}
