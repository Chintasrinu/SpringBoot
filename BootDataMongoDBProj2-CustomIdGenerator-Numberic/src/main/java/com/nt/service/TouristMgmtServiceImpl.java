package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Doucement.Tourist;
import com.nt.repo.TouristRepo;
@Service("touristmgmt")
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
	private TouristRepo touristrerpo;

	@Override
	public String registerTourist(Tourist tourist) {
		
		return "Document is savd with id value::"+touristrerpo.insert(tourist).getTouristId();
	}

}
