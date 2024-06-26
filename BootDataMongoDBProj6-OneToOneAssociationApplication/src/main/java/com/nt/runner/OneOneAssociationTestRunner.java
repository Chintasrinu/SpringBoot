package com.nt.runner;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Doucement.DrivingLicense;
import com.nt.Doucement.Person;
import com.nt.service.IRTOMgmtService;
@Component
public class OneOneAssociationTestRunner implements CommandLineRunner {
	@Autowired
	private IRTOMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		// person to child
		try {
//child to parent
			Person per =new Person(new Random().nextInt(1000),"raja","hyd1" );
			DrivingLicense license = new DrivingLicense(new Random().nextLong(),"4-wheeler",LocalDate.now());
			// parent  to child
 		license.setPersonDetails(per);
		System.out.println(service.registerLicenseWithDrivingLicense(license));
		}// try
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("========================");
		service.fetchAllLicenseDetails().forEach(lic->{
			System.out.println("child::"+lic);
			Person per = lic.getPersonDetails();
			System.out.println("person::"+per);
		});
	}

}
