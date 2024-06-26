package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;
@Component
public class CollectionMappingRunner implements CommandLineRunner {
	@Autowired
private IEmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		service.getAllEmpsDetails().forEach(System.out::println);
}
}