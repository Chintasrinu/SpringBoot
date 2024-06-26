package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
private EntityManager manager;
	@Override
	public List<Employee> fetchEmpdetailsByDesg(String desg1, String desg2) {
	// create StoredProcedure Query types
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_EMPS_BY_JOB",Employee.class);
		// register Parameter with jdbc types
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		//SET VALUES TO IN PARAMS
		query.setParameter(1, desg1);
		query.setParameter(2, desg2);
		// call the PL/SQL Procedure and get the result
		List<Employee> list = query.getResultList();
		return list;
	}

}
