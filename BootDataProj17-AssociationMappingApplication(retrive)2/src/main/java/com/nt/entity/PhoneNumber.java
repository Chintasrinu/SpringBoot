package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="ON_PHONENUMBER_DETAILS")
@Setter
@Getter
public class PhoneNumber implements Serializable {
	@Id
	@GeneratedValue
private Integer regNo;
private Long phoneNum;
@Column(length= 20)
private String numberType;
	@Column(length= 20)
private String provider;
	//taking property for FK clumn any db table is Optional
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNum=" + phoneNum + ", numberType=" + numberType + ", provider="
				+ provider + "]";
	}
	
	
}
