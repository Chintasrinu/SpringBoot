package com.nt.entity;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity	
@Table(name = "SP_DATA_MOVIE")
@RequiredArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {
@Id
@Column(name = "MID")
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mid;
	@Column(name = "MNAME")
	@Nonnull
	private String mname;
	@Column(name = "YEAR")
	@Nonnull
	private String year;
	@Column(name="RATING")
	@Nonnull
	private Float rating;

}
