package com.nt.runner;

import java.time.LocalDateTime;
import java.util.UUID;

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
		try {
			String id = UUID.randomUUID().toString();
			System.out.println(id);
		Tourist tourist = new Tourist(id,"srinu","UK",25.0f,"dsc1234789",999999L,true,10,LocalDateTime.now());
		String result = service.registerTourist(tourist);
		System.out.println(result);
		}
catch(Exception e) {
	e.printStackTrace();
}
	}

}
