package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;
	@Override
	public List<Employee> fetchEmployeeDetailsByDesgs(String desg1,String desg2,String desg3)throws Exception{
		// use dao 
		List<Employee> listEmps = dao.getEmpsByDesg(desg1, desg2, desg3);
		return listEmps;
	}

}
