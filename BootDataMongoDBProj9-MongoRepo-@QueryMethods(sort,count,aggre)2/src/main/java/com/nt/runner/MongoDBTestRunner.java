package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Component;

import com.nt.Doucement.Tourist;
import com.nt.service.ITouristMgmtService;
@Component
public class MongoDBTestRunner implements CommandLineRunner {
	@Autowired
	private ITouristMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		//--------------------------count tourist-------
		//System.out.println("Tourist countis::"+service.fetchTouristsCountByAgeRange(21,22));
		
		//--1 is ascending order,, -1 is desending order-----------------
				//service.fetchTouristsSortedByName().forEach(System.out::println);
		
		//---------delect the document---------------
		//System.out.println("delect docs count is::"+service.delectTouristWithNoContactNumber());
		//----------------------available or not
		System.out.println("docs the tourist exist without vaccination::"+service.isThereTouristsExistWithOutVaccination());
	}

}
