
package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hsptl")
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


	@Autowired           // Autowiring
	private LabTestsInfo info;
	@Value("#{linfo.echo2DPrice+linfo.rtpcrPrice}")  //@Value("#(lInfo)")   // using  SPEL performing injection to object type property SPEL based Arthematic operation and injection
	public float labTestBillAmount;

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", rank=" + rank + ", name1=" + name1 + ", age=" + age + ", path=" + path
				+ ", os=" + os + ", info=" + info + ", labTestBillAmount=" + labTestBillAmount + "]";
	}
}
