package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Component
public class FinalMethodRunner implements CommandLineRunner {
	@Autowired
	private EntityManager manager;
	@Override
	public void run(String... args) throws Exception {
//create storedProcedureQuery object representing the given PL/SQL  Procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("PRO_AUTHENTICATION");
		// register parameters of PL/SQL Procedure with java types
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		// set values to IN params
		query.setParameter(1, "JNA");
		query.setParameter(2, "SIRI");
		// call PL/SQL Procedure and get the result
		String result = (String)query.getOutputParameterValue(3);
	System.out.println("Authenticaton result::"+result);
}// run(-)
	//class
}