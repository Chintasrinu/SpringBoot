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
		//gives those docs whose nativeplace start with "U"
		//service.fetchTouristByNativePlaceWithRegEx("^c").forEach(System.out::println);
		// GIVES those docs whose nativePlace endswith a
		//service.fetchTouristByNativePlaceWithRegEx("K$").forEach(System.out::println);
		//gives those docs whose nativePlace contains a
		service.fetchTouristByNativePlaceWithRegEx("y").forEach(System.out::println);
	}

}
