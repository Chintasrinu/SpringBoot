package com.nt.Doucement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class StockDetails {
	@Id
	private Integer stockid;
	private String stockName;
	private double price;
	private String exchangeName;

}
