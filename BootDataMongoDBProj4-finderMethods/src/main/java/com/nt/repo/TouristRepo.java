package com.nt.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Doucement.Tourist;

public interface TouristRepo extends MongoRepository<Tourist, String> {
	public List<Tourist> findByNativePlaceOrderByTouristNameAsc(String nativePlace);
	
	public Tourist findTouristBycontactName(long contactNo);

}
