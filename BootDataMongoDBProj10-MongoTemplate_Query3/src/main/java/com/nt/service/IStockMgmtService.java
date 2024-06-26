package com.nt.service;

import java.util.List;

public interface IStockMgmtService {
	public  String fetchStockDetailsByStock(int stockdetails);
	public String fetchAndUpdateStockDetailsByStockid(int stockid, double newprice, String newExchange);
public String modifyExchangeByStockPriceRange(double startPrice, double endPrice, double number);
public String registerOrUpdateStockByStockName(String stockName, double newprice, String newExchange);
public String fetchAndRemovieByStockName(String stockName);
public String fetchAndRemovieByStockDetailsAndBulk(List<Integer> stockids);
}
