package com.nt.runner;

import java.util.Optional;

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
		//---------------------------sort by object ascending and descending---------------------------------------------
		//service.fetchAllTourists(true, "touristName","touristName").forEach(System.out::println);
		//-------------------------findById----------------------------------------
		/*Optional<Tourist> option= service.fetchTouristById("65856c78485f386657ab5011");
		if(option.isPresent())
			System.out.println("document is::"+option.get());
		else
			System.out.println("document is not found");*/
		//-----------------------------------updated----------------------------------------------
		//System.out.println(service.modifyTouristById("65856c78485f386657ab5011","devi","vijag"));
	//-------------------------------------------remove document-----------------------
		//System.out.println(service.removeTouristById("65856c78485f386657ab5013"));
	//----------------------------------------------------------------------------------
	}
}