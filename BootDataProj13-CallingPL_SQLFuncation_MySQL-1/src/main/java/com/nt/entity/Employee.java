package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue
	private Integer eno;
	private String ename;
	private String desg;
	private float sal;
}
