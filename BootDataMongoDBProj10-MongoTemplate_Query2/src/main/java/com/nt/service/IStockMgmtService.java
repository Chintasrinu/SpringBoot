package com.nt.service;

import java.util.List;

import com.nt.Doucement.StockDetails;

public interface IStockMgmtService {
	public List<StockDetails> fetchStockDetailsByExchange(String exchange);
	public List<StockDetails> fetchStockDetailsByPriceRange(double startPrice, double endPrice);

}
