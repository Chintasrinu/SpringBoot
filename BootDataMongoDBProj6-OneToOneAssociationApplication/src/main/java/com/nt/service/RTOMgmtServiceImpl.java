package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Doucement.DrivingLicense;
import com.nt.Doucement.Person;
import com.nt.repo.IDrivingLicenseRepo;
import com.nt.repo.IPersonRepo;
@Service("touristmgmt")
public class RTOMgmtServiceImpl implements IRTOMgmtService {
	@Autowired
	private  IPersonRepo personRepo;
	@Autowired
	private  IDrivingLicenseRepo licenseRepo;
	@Override
	public String registerPersonWithDrivingLicense(Person person) {
		return "person with DrivingLicense is saved::"+personRepo.save(person);
	}
	@Override
	public String registerLicenseWithDrivingLicense(DrivingLicense license) {
		return "Registered with Person By DrivingLicense::"+licenseRepo.save(license);
	}
	@Override
	public List<Person> fetchAllPersonDetails() {
		return personRepo.findAll();
	}
	
	@Override
	public List<DrivingLicense> fetchAllLicenseDetails() {
		return licenseRepo.findAll();
	}

	

}
