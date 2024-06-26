package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;
@Service
public class EmployeeServiceMgmt implements IEmployeeMgmtService {
@Autowired
	private EmployeeRepository repo;
	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}
}
