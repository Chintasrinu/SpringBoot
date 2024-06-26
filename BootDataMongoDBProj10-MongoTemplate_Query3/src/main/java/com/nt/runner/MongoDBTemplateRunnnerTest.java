package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IStockMgmtService;
@Component
public class MongoDBTemplateRunnnerTest implements CommandLineRunner {
	@Autowired
private IStockMgmtService service;
	@Override
	public void run(String... args) throws Exception {
	/*	String msg = service.fetchStockDetailsByStock(30);
		System.out.println(msg);*/
		//System.out.println("-----------------findandmodify()-------------------");
		//System.out.println(service.fetchAndUpdateStockDetailsByStockid(137, 9950.0, "CSE"));
		System.out.println("-----------------updateMultiple(-)-------------------");
		//System.out.println(service.modifyExchangeByStockPriceRange(500, 50000, 96969.0));
		//System.out.println("-----------------upsert(-)-method------------------");
		//System.out.println(service.registerOrUpdateStockByStockName("CBB", 3300000.3, "CLOCKTC"));
		//System.out.println(service.fetchAndRemovieByStockName("CBI"));
		System.out.println(service.fetchAndRemovieByStockDetailsAndBulk(List.of(7161,603,7559)));
}
}