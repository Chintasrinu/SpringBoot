package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity	
@Table(name = "SP_DATA_MOVIE")
public class Movie implements Serializable {
	@Id
@Column(name = "MID")
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mid;
	@Column(name = "MNAME")
	private String mname;
	@Column(name = "YEAR")
	private String year;
	@Column(name="RATING")
	private Float rating;

}
