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
		try {
		Tourist tourist = new Tourist(null,"kavya","hyd",20.0f,"7789999",999999L,true);
		String result = service.registerTourist(tourist);
		System.out.println(result);
		}
catch(Exception e) {
	e.printStackTrace();
}
	}

}
