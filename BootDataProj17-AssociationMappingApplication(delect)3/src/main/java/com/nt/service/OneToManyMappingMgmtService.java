package com.nt.service;

import java.util.Optional;

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
public String delectParentAndItsChilds(int pid) {
	// Load parent object
	Optional<Person> opt = personRepo.findById(pid);
	// Here along with parent object the associated child object will be loaded
	if(opt.isPresent()) {
		personRepo.delete(opt.get());
		return "person and his PhoneNumber are delected";
	}
		else {
		return"person not found";
		}
}
}
