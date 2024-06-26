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
public List<Tourist> fetchAllTouristByNativePlace(String nativePlace) {
	return touristrerpo.getAllTouristByNativePlace(nativePlace);
}
@Override
public List<Tourist> fetchAllTouristByNativePlaceAndAge(String nativePlace, long age) {
	return touristrerpo.getAllTouristsByNativePlaceAndAge(nativePlace, age);
}
@Override
public List<Tourist> fetchAllTouristByAgeRange(int minage, int maxage) {
	return touristrerpo.getAllTouristByAgeRange(minage, maxage);
	}
@Override
public List<Tourist> fetchTouristDataByNativePlaces(String nativePlace1, String nativePlace2) {
	return touristrerpo.getAllTouristByNativePlaces(nativePlace1, nativePlace2);
}
@Override
public List<Object[]> fetchTouristDataByNativePlace(String nativePlace) {
	return touristrerpo.getTouristDataByNativePlace(nativePlace);
}
@Override
public List<Object[]> fetchTouristDataByNativePlace(String nativeplace1, String nativeplace2, String nativeplace3) {
	return touristrerpo.getTouristDataByNativePlace(nativeplace1, nativeplace2, nativeplace3);
}
}