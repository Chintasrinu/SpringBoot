package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeInfo;
import com.nt.repository.EmployeeInfoRepo;
@Service("serviceImpl")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private EmployeeInfoRepo repo;

	@Override
	public List<EmployeeInfo> getAllEmpsDetails() {
		
		return repo.findAll();
	}

	

}
