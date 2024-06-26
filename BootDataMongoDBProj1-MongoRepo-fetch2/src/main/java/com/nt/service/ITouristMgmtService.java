package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.Doucement.Tourist;

public interface ITouristMgmtService {
public String registerTourist(Tourist tourist);
public List<Tourist> fetchAllTourists(boolean asc ,String ...properties);
//------------------------findbyid---------------------------------
public Optional<Tourist> fetchTouristById(String id);
//------------------------updating--------------------------------------------
public String modifyTouristById(String id, String touristnam, String nativePlace);
//------------------------------------------------------------
public String removeTouristById(String id);
}