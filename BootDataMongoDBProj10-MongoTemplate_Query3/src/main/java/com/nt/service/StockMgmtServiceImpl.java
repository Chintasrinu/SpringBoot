package com.nt.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.nt.Doucement.StockDetails;
@Service("stockmgmt")
public class StockMgmtServiceImpl implements IStockMgmtService {
	@Autowired
	private MongoTemplate template;

	@Override
	public String fetchStockDetailsByStock(int stockdetails) {
		StockDetails result = template.findById(stockdetails,  StockDetails.class);
		return result==null?"Document is not found+":result.toString()+" Document is found";
	}
	@Override
	public String fetchAndUpdateStockDetailsByStockid(int stockid, double newprice, String newExchange) {
		//query object for single doc retriving
		Query query = new Query();
		query.addCriteria(Criteria.where("stockid").is(stockid));
		//update object for modification
		Update update = new Update();
		update.set("price",newprice);
		update.set("exchangeName",newExchange);
		// call the mehod
		StockDetails details = template.findAndModify(query, update,StockDetails.class);
		return details==null?"stock does not found":"stock found and updated";
	}
	@Override
	public String modifyExchangeByStockPriceRange(double startPrice, double endPrice,double number) {
	Query query = new Query();
	query.addCriteria(Criteria.where("price").gte(startPrice).andOperator(Criteria.where("price").lte(endPrice)));
	//update object
	Update update = new Update().set("price",number);
	// call the method
	UpdateResult result = template.updateMulti(query, update, StockDetails.class);
		return result.getModifiedCount()+"no.. of records are effeted";
	}
	@Override
	public String registerOrUpdateStockByStockName(String stockName, double newprice, String newExchange) {
		//query object for single doc retriving
		Query query = new Query();
		query.addCriteria(Criteria.where("stockName").is(stockName));
		//update object
		Update update = new Update();
		update.set("exchangeName",newExchange);
		update.setOnInsert("stockName", stockName);
		update.set("price",newprice);
		update.setOnInsert("stockid",new Random().nextInt(10000));
		UpdateResult  result = template.upsert(query, update, StockDetails.class);
		return result.getModifiedCount()+"  no  of records are effeted";
	}
	@Override
	public String fetchAndRemovieByStockName(String stockName) {
		// quey object for single doc retriving
		Query query = new Query();
		query.addCriteria(Criteria.where("stockName").is(stockName));
		// call the method 
		StockDetails details = template.findAndRemove(query, StockDetails.class);
		return details==null?"stock is found":"stock found and delected";
	}
	@Override
	public  String fetchAndRemovieByStockDetailsAndBulk(List<Integer> ids) {
		Query query = new Query();
		query.addCriteria(Criteria.where("stockid").in(ids));
		List<StockDetails> result = template.findAllAndRemove(query, StockDetails.class);
		return result==null?"not delete all documents":"delete all documents";
	}
}
