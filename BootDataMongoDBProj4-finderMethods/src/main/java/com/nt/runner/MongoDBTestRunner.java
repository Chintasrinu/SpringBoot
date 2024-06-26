package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Doucement.Tourist;
import com.nt.service.ITouristMgmtService;
@Component
public class MongoDBTestRunner implements CommandLineRunner {
	@Autowired
	private ITouristMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		//service.fetchTouristByNativePlaceAscOrder("hyd").forEach(System.out::println);
//------------------------------------------------------------------
		Tourist tourist = service.fetchTouristByContactNo(9999991L);
		if(tourist==null)
			System.out.println("tourist not found");
		else
			System.out.println("tourist details::"+tourist);
}
}