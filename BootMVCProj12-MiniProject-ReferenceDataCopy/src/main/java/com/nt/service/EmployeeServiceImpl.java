package com.nt.service;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepo;
@Service("empservice")
public class EmployeeServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public String registerEmployees(Employee emp) {
		// use result
		Integer idval = empRepo.save(emp).getEmpno();
		return "Employee is saved with id Value::"+idval;
	}

	@Override
	public Employee getEmployeeByno(int no) {
		Employee emp = empRepo.findById(no).get();
		return emp;
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

	@Override
	public Page<Employee> getEmployeePageData(Pageable pageable) {
	Page<Employee> page=empRepo.findAll(pageable);
		return page;
	}

	@Override
	public Set<String> getAllCountries() {
		// get all locales of the world
		Locale locales[] = Locale.getAvailableLocales();
		Set<String> countrySet = new TreeSet();
		for(Locale l:locales) {
			if(l!=null)
				countrySet.add(l.getDisplayCountry());
			}
		return countrySet;
	}
	}