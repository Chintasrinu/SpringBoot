package com.nt.runner;

import java.time.LocalDateTime;
import java.util.List;

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
//	
	//============findAllDocuments
//service.fetchAllTourists().forEach(System.out::println);
		//=========saveAll(-)Methods=============
		try {
			Tourist tourist = new Tourist(null,"srinu","hyd",23.0f,"123456",999999L,true,100,LocalDateTime.of(2022,10,20,10,25));
			Tourist tourist1 = new Tourist();
			tourist1.setTouristName("PARAVALIKA"); tourist1.setNativePlace("bplm");
			Tourist tourist3 = new Tourist(null,"srinu","hyd",23.0f,"123456",999999L,true,null,null);
			List<Tourist> touristList = List.of(tourist,tourist1,tourist3);
			String msg = service.saveTouristGroup(touristList);
					System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}