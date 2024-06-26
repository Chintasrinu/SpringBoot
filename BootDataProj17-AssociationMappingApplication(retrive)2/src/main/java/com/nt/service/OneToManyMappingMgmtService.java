package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.PersonInfoRepo;
import com.nt.repository.PhoneNumberInfoRepo;
@Service("serviceImpl")
public class OneToManyMappingMgmtService implements IOneToManyMappingMgmtService {
@Autowired
	private PersonInfoRepo personRepo;
@Autowired
private PhoneNumberInfoRepo phoneNumber;
@Override
public void loadDataUsingParent() {
	List<Person> list = personRepo.findAll();
	list.forEach(per->{
		System.out.println("Person::"+per);
	// get child of cach parent
	Set<PhoneNumber> childs = per.getPhonesInfo();
	childs.forEach(ph->{
		System.out.println("childs::"+ph);
});
	});
}
}