package com.nt.service;

import java.util.List;

import com.nt.Doucement.Tourist;

public interface ITouristMgmtService {
public List<Tourist> fetchAllTouristByNativePlace(String nativePlace);
public List<Tourist> fetchAllTouristByNativePlaceAndAge(String nativePlace, long age);
public List<Tourist> fetchAllTouristByAgeRange(int minage, int maxage);
public List<Tourist> fetchTouristDataByNativePlaces(String nativePlace1,String nativePlace2 );
public List<Object[]>  fetchTouristDataByNativePlace(String nativePlace);
public List<Object[]> fetchTouristDataByNativePlace(String nativeplace1,String nativeplace2,String nativeplace3);
}
