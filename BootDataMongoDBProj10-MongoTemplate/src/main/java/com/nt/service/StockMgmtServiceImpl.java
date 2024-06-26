package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.nt.Doucement.StockDetails;
@Service("stockmgmt")
public class StockMgmtServiceImpl implements IStockMgmtService {
	@Autowired
	private MongoTemplate template;

	@Override
	public String registerStockDetails(StockDetails details) {
		// given doc object data will be saved by creating collection called "stock"
		//int idvalue = template.save(details,"stock").getStockid(); 
		//---------------------------------------------
		// given doc object data will be saved by creating collection  with document class
		int idvalue = template.save(details).getStockid();
//---------------------------------------------------------------------
		// given doc object data will be saved by crating collection with document class
		//int idvalue = template.insert(details).getStockid();
		return "Document is saved with id value::"+idvalue;
	}
	//---------------------batch--InsertDocument-----------------------
	@Override
	public String registerStockDetailsBatch(List<StockDetails> list) {
		int size = template.insertAll(list).size();
		return "no. of documents are saved::"+size;
	}
}
