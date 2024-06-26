package com.nt.service;

import java.util.List;

import com.nt.Doucement.StockDetails;

public interface IStockMgmtService {
	public String registerStockDetails(StockDetails details);
	//---------------------batch--InsertDocument-----------------------
	public String registerStockDetailsBatch(List<StockDetails> list);

}
