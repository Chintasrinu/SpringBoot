package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="ON_PERSON_DETAILS")
@Setter
@Getter
public class Person implements Serializable {
@Id
@SequenceGenerator(name = "gen1",initialValue = 1000,allocationSize = 1,sequenceName = "PID_SEQ1")
@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
private Integer pid;
@Column(length=20)
private String pname;
@Column(length=20)
private String paddre;
}
