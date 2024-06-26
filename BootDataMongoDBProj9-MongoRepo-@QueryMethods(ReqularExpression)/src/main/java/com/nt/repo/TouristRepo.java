package com.nt.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.Doucement.Tourist;

public interface TouristRepo extends MongoRepository<Tourist, String> {
	@Query(value="{nativePlace:{$regex:?0}}")
	public List<Tourist> getTouristsByNativePlaceRegEx(String nativePlace);

}
