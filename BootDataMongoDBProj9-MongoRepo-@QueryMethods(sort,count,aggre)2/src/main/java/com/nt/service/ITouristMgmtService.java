package com.nt.service;

import java.util.List;

import com.nt.Doucement.Tourist;

public interface ITouristMgmtService {
//-----------------count------------
public int fetchTouristsCountByAgeRange(int minAge, int maxAge);
//1 is ascending order,, -1 is desending order
public List<Tourist> fetchTouristsSortedByName();
//---delect select documet----
public int delectTouristWithNoContactNumber();
//---------------exits value is true--------
public boolean isThereTouristsExistWithOutVaccination();
}