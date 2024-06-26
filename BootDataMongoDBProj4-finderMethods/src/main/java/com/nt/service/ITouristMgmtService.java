package com.nt.service;

import java.util.List;

import com.nt.Doucement.Tourist;

public interface ITouristMgmtService {
public List<Tourist> fetchTouristByNativePlaceAscOrder(String nativePlace);
public Tourist fetchTouristByContactNo(long contactNo);
}
