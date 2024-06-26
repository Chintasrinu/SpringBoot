package com.nt.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("CustInfo")
@ConfigurationProperties(prefix = "cust.info")
public class CustomerInfo {
	// spring bean properties
	private String name;
	private  int age;
	private String address;
	private float billAmt;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "CustomerInfo [name=" + name + ", age=" + age + ", address=" + address + ", billAmt=" + billAmt + "]";
	}

}
