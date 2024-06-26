package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;
@Component
public class PL_SQLFuncationCallRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMgmtService service ;
	@Override
	public void run(String... args) throws Exception {
		service.fetchEmpdetailsByDesg("CLERK","MANAGER").forEach(System.out::println);
}
}	