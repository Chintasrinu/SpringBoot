package com.nt.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.Doucement.Tourist;

public interface TouristRepo extends MongoRepository<Tourist, String> {
//-----------min and max tourist count-----------------
	@Query(value="{age:{$gte:?0,$lte:?1}}",count = true)
	public int getTouristCountByAgeRange(int minAge, int maxAge);
	
	//1 is ascending order,, -1 is desending order
		@Query(value="{}" ,sort = "{nativePlace:-1}")
		public List<Tourist> getAllTouristsSortedByName();
	//---------------delect the select document-----
		@Query(value="{passportName:null}",delete = true)
	public int delectTouristsWithNoContactNumber();
		//------------exists ------------------available or not----------
		@Query(value="{vaccinated:falsh}",exists = true)
		public  boolean isTouristExistsWithOutVaccination();
		
		
}

