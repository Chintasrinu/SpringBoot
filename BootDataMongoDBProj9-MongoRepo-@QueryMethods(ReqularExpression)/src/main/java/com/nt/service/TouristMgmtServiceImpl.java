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
	public List<Tourist> fetchTouristByNativePlaceWithRegEx(String nativePlace) {
		return touristrerpo.getTouristsByNativePlaceRegEx(nativePlace);
	}

}
