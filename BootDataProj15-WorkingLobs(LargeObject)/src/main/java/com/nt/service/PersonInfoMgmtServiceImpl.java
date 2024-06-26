package com.nt.service;

import java.util.List;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonInfo;
import com.nt.repository.IPersonInfoRepo;
@Service("personImpl")
public class PersonInfoMgmtServiceImpl implements IPersonInfoMgmtService {
	@Autowired
private IPersonInfoRepo repo;

	@Override
	public String registerPerson(PersonInfo info) {
	
		return repo.save(info).getPid()+ "Person is Saved";
	}

	@Override
	public List<PersonInfo> fetchAllPersonDetails() {
		return repo.findAll();
	}
}
