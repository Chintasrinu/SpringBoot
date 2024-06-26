package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class PersonInfo {
	@Id
	@GeneratedValue
	private Integer pno;
	private String pname;
	private float page;
	private LocalDate dob;
	private LocalTime tob;
	private LocalDateTime doj;
}
