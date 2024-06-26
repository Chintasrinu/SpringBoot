package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Exceptions.EmployeeNotFoundException;
import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepo;
@Service("empservice")
public class EmployeeServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public String registerEmployees(Employee emp) {
		// use result
		Integer idval = empRepo.save(emp).getEmpno();
		return "Employee is saved with id Value::"+idval;
	}

	@Override
	public Employee getEmployeeByno(int no) {
		// use repo
		 return empRepo.findById(no).orElseThrow(()->new EmployeeNotFoundException("emp not found"));
		// throw new RuntimeException("problem in fetching record"
	}

	@Override
	public String editEmployee(Employee emp) {
		int idval = empRepo.save(emp).getEmpno();
		return idval + ":Employee is updated";
	}

	@Override
	public String deleteEmployee(int no) {
		empRepo.deleteById(no);
		return no+ ":emp no Employee is deleted";
	}
	}