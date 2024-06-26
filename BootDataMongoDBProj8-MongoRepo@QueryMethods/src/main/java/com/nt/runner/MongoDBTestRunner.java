package com.nt.runner;

import java.sql.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ITouristMgmtService;
@Component
public class MongoDBTestRunner implements CommandLineRunner {
	@Autowired
	private ITouristMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		//service.fetchAllTouristByNativePlace("UK").forEach(System.out::println);
		//service.fetchAllTouristByNativePlaceAndAge("hyd", 22L).forEach(System.out::println);
		//service.fetchAllTouristByAgeRange(20, 21).forEach(System.out::println);
		//service.fetchTouristDataByNativePlaces("UK","hyd").forEach(System.out::println);
		//========projection(selecting specific single column or multiple col values=======
		//service.fetchTouristDataByNativePlace("UK").forEach(row->{
			//System.out.println(Arrays.toString(row));
			/*for(Object val:row) {
				System.out.println(val);
			}
			System.out.println();
		});*/
		//======================================
service.fetchTouristDataByNativePlace("vijag","bplm","hyd").forEach(row->{
	System.out.println(Arrays.toString(row));
});
}
}