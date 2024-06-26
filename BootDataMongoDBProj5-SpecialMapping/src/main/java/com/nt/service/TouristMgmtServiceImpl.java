package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Doucement.PersonInfo;
import com.nt.repo.PersonInfoRepo;
@Service("personinfo")
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
	private PersonInfoRepo personInfo;

	@Override
	public String registerPerson(PersonInfo info) {
		return "Person is saved with:"+personInfo.save(info).getPid();
	}

	
}
