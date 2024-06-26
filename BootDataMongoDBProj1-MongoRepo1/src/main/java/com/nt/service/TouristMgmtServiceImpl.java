package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Doucement.Tourist;
import com.nt.repo.TouristRepo;
@Service("touristmgmt")
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
	private TouristRepo touristrepo;

	@Override
	public String registerTourist(Tourist tourist) {
		
		return "Document is savd with id value::"+touristrepo.insert(tourist).getId();
	}

	@Override
	public List<Tourist> fetchAllTourists() {
	
		return touristrepo.findAll();
				}

	@Override
	public String saveTouristGroup(List<Tourist> tourist) {
		int count = touristrepo.saveAll(tourist).size();
		return count+" no.. of Count records are saved";
	}

}
