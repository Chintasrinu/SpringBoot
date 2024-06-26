package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeInfo;
import com.nt.repository.EmployeeInfoRepo;
@Service("serviceImpl")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private EmployeeInfoRepo repo;

	@Override
	public String registerEmployee(EmployeeInfo info) {
		
		return "Employee saved with"+repo.save(info).getEid()+"id value";
	}

	@Override
	public String insertIntoValues(EmployeeInfo into) {
		
		return "inssert the values"+repo.save(into).getEid()+"id value";
	}

}
