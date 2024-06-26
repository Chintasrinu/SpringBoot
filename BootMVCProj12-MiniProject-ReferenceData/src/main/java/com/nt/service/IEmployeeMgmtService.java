package com.nt.service;


import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {
	
	public Page<Employee> getEmployeePageData(Pageable pageable);

	public String registerEmployees(Employee emp);
	
	public Employee getEmployeeByno(int no);

	
	public String editEmployee(Employee emp);
	
	public String deleteEmployee(int no);
	
	public Set<String> getAllCountries();

}