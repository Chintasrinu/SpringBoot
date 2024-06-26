
package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("hsptl")
@PropertySource("classpath:input.properties")
public class Hospital {
	@Value("KIMS")   // HARD CODING 
private String  name;
	@Value("30")  // HARD CODING 
private int rank;

	@Value("${hsptl.name}")  // collecting from properties file
private String name1;
	@Value("${hsptl.age}")  // collecting from properties file
private int age;

	@Value("${Path}")  //  injecting from environment variable
private String path;
	@Value("${os.name}")  //  injecting from environment variable
private String os;
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", rank=" + rank + ", name1=" + name1 + ", age=" + age + ", path=" + path
				+ ", os=" + os + "]";
	}
  
	

}
