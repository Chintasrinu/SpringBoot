package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> getAllEmployee();

	public String registerEmployees(Employee emp);
	
	public Employee getEmployeeByno(int no);

	
	public String editEmployee(Employee emp);
	
	public String deleteEmployee(int no);

}