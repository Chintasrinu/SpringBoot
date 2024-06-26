package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonInfo;
import com.nt.repository.IPersonInfoRepo;
@Service("personImpl")
public class PersonInfoMgmtServiceImpl implements IPersonInfoMgmtService {
	@Autowired
private IPersonInfoRepo repo;

	@Override
	public PersonInfo fetchPersonDetailsById(int pid) {
		Optional<PersonInfo> opt =repo.findById(pid);
		if(opt.isPresent())
		return opt.get();
		else
			return null;
	}
}
