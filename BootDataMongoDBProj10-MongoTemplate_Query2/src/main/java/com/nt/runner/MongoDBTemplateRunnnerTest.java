package com.nt.runner;

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
		System.out.println("-----------find(-,0)---for selecting the documents------");
		//service.fetchStockDetailsByExchange("srk").forEach(System.out::println);
		System.out.println("------------------------------------------");
		service.fetchStockDetailsByPriceRange(500,100000).forEach(System.out::println);
}
}