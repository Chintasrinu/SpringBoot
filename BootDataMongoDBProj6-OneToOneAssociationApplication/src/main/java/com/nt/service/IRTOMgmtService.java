package com.nt.service;

import java.util.List;

import com.nt.Doucement.DrivingLicense;
import com.nt.Doucement.Person;

public interface IRTOMgmtService {
public String registerPersonWithDrivingLicense(Person person);
public String registerLicenseWithDrivingLicense(DrivingLicense license);

public List<Person> fetchAllPersonDetails();
public List<DrivingLicense> fetchAllLicenseDetails();

}
