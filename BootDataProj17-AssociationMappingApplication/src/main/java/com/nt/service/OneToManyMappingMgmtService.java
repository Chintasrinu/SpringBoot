package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.repository.PersonInfoRepo;
import com.nt.repository.PhoneNumberInfoRepo;
@Service("serviceImpl")
public class OneToManyMappingMgmtService implements IOneToManyMappingMgmtService {
@Autowired
	private PersonInfoRepo personRepo;
@Autowired
private PhoneNumberInfoRepo phoneNumber;
	@Override
	public String saveDataUsingParent(Person person) {
		return personRepo.save(person).getPid()+"  Person is saved";
	}
	

	

}
