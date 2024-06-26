package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.nt.Doucement.StockDetails;
@Service("stockmgmt")
public class StockMgmtServiceImpl implements IStockMgmtService {
	@Autowired
	private MongoTemplate template;

	@Override
	public List<StockDetails> fetchStockDetailsByExchange(String exchange) {
		Query query = new Query();
		query.addCriteria(Criteria.where("stockName").is(exchange));
		List<StockDetails> list = template.find(query,StockDetails.class);
		return list;
	}
	@Override
	public List<StockDetails> fetchStockDetailsByPriceRange(double startPrice, double endPrice) {
		Query query = new Query();
		query.addCriteria(Criteria.where("price").gte(startPrice).lte(endPrice));
		List<StockDetails> list = template.find(query,StockDetails.class);
		return list;
	}
}
