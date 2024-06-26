package com.nt.Runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IOneToManyMappingMgmtService;
@Component
public class OneToManyMappingTestRunner implements CommandLineRunner {
	@Autowired
private IOneToManyMappingMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		PhoneNumber ph = new PhoneNumber();
		ph.setPhoneNum(99999999L); ph.setNumberType("personal");
		ph.setProvider("BSNL");
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPhoneNum(88888888L); ph1.setNumberType("Office");
		ph1.setProvider("Jio");
		PhoneNumber ph2 = new PhoneNumber();
		ph2.setPhoneNum(88888888L); ph2.setNumberType("Office");
		ph2.setProvider("vodefone");
		
		Person per = new Person();
		per.setPname("kavya"); per.setPaddrs("hyd"); 
		per.setPhonesInfo(Set.of(ph,ph1,ph2));
	try {
		//invoke method
		System.out.println(service.saveDataUsingParent(per));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}