package com.nt.service;

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
private PhoneNumberInfoRepo phoneNumberRepo;
@Override
public String delectAllPhoneNumberOfAPerson(int pid) {
	//Load Parent Object
	Optional<Person> opt = personRepo.findById(pid);
	if(opt.isPresent()) {
		// get child of a person
		Set<PhoneNumber> childs = opt.get().getPhonesInfo();
		childs.forEach(ph->{
		phoneNumberRepo.delete(ph);
		});
				return "All childs(PhoneNumber) of a person are delected";
	}
	else {
return"person not found";
}
}
}