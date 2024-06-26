package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Doucement.PersonInfo;
import com.nt.service.ITouristMgmtService;
@Component
public class MongoDBTestRunner implements CommandLineRunner {
	@Autowired
	private ITouristMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Properties props = new Properties();
			props.put("srinu", "143143");
			props.put("tulasidevi", "141141");
		PersonInfo info = new PersonInfo(new Random().nextInt(10000), "srinutulasi","bplm", new String[] {"red","green","yellow"}, List.of("SRINU","TULASI","DEVI"),Set.of(99999L,8888L),Map.of("SBI" ,12345L,"ICIC",12345L),props);
			System.out.println(info);
		}//try
catch(Exception e) {
	e.printStackTrace();
}
	}

}
