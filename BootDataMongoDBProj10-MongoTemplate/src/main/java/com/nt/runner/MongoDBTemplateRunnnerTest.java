package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Doucement.StockDetails;
import com.nt.service.IStockMgmtService;
@Component
public class MongoDBTemplateRunnnerTest implements CommandLineRunner {
	@Autowired
private IStockMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		/*StockDetails details = new StockDetails(new Random().nextInt(1000),"ICICI",77777,"BSE");
		String result = service.registerStockDetails(details);
		System.out.println(result);*/
		/*System.out.println("--------------------update document using save(-)---------");
		StockDetails details = new StockDetails(4,"srk",111111,"BSE");
		String result = service.registerStockDetails(details);
		System.out.println(result);*/
		System.out.println("-----------insertAll(-) to save multiple document---------------");
		StockDetails details1 = new StockDetails(new Random().nextInt(1000),"CBIC",44444,"BSE");
		StockDetails details2 = new StockDetails(new Random().nextInt(1000),"CHETAK",33333,"BSE");
		StockDetails details3 = new StockDetails(new Random().nextInt(1000),"KARODA",555555,"BSE");
		String msg = service.registerStockDetailsBatch(List.of(details1,details2,details3));
		System.out.println(msg);
	}

}
