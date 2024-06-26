package com.nt.Doucement;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document(collection = "PERSONINFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonInfo implements Serializable {
	@Id
	private Integer pid;
	private String pname;
	private String  Paddrs;
	private String[] favColor;
	private List<String> friends;
	private Set<Long> contactNumbers;
	private Map<String, Long> bankAccountDetails;
	private Properties idDetails;
}
