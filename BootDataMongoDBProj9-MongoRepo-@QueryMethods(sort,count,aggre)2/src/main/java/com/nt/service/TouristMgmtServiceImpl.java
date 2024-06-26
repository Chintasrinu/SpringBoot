package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Doucement.Tourist;
import com.nt.repo.TouristRepo;
@Service("touristmgmt")
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
	private TouristRepo touristrerpo;
	
	@Override
	public int fetchTouristsCountByAgeRange(int minAge, int maxAge) {
		return touristrerpo.getTouristCountByAgeRange(minAge, maxAge);
	}	
@Override
public List<Tourist> fetchTouristsSortedByName() {
	return touristrerpo.getAllTouristsSortedByName();
}
@Override
public int delectTouristWithNoContactNumber() {
	return touristrerpo.delectTouristsWithNoContactNumber();
}
@Override
public boolean isThereTouristsExistWithOutVaccination() {
	return touristrerpo.isTouristExistsWithOutVaccination();
}
}
