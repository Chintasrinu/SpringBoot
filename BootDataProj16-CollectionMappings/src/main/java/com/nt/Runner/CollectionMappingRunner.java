package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.EmployeeInfo;
import com.nt.service.IEmployeeMgmtService;
@Component
public class CollectionMappingRunner implements CommandLineRunner {
	@Autowired
private IEmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {
//		try {
//			// prepared object
//	EmployeeInfo info = new  EmployeeInfo(123, "Ragahava",List.of("Lasya","siri","venna"), Set.of(1233333L,12344444L,123455555L),Map.of("Aadhara","23457","PanCard","23455"));
//	System.out.println(service.registerEmployee(info));
//		
//		}// try
//	catch(Exception e) {
//		e.printStackTrace();
//	}
		try {
			EmployeeInfo into = new  EmployeeInfo(1,"raghava",List.of("ramaya"), null, null);
			System.out.println(service.registerEmployee(into));
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
