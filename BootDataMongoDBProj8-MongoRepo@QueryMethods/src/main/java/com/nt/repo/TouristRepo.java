package com.nt.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.Doucement.Tourist;

public interface TouristRepo extends MongoRepository<Tourist, String> {
	//============================Entiry Query=====to select all fields values
	//@Query(fields ="{}",value = "{nativePlace:?0}")
	@Query(value = "{nativePlace:?0}")
	public List<Tourist> getAllTouristByNativePlace(String nativePlace);
	//===================applies native =? and age>=?
	//@Query(value = "{nativePlace:?0,age:{$gte:?1}}")
	@Query(value = "{nativePlace:?0,age:{$lte:?1}}")
	public List<Tourist> getAllTouristsByNativePlaceAndAge(String nativePlace, long minAge);
	//==========================applies nativePlace=? and age>=?
	//@Query(value  = "{age:{$get:?0},age:{$lte:?1}}") // OR
	@Query(value="{age:{$get:?0,$lte:?1}}")
	public List<Tourist> getAllTouristByAgeRange(int startAge, int endPage);
//==========projection(Selecting specefic single column or multiple col values=========
	@Query(value="{$or:[{nativePlace:?0},{nativePlace:?1},{nativePlace:?1}]}")
public List<Tourist> getAllTouristByNativePlaces(String nativePlace1,String nativePlace);
//------------projecttion(Selecting specific single column or multile column values)----------
	//gives select id, touristName,nativePlace,age, from Tourist where nativePlace =?
	@Query(fields="{touristName:1,nativePlace:1,age:1}",value="{nativePlace:?0,?1,?2]}")
public List<Object[]> getTouristDataByNativePlace(String nativePlace);
//---------select id ,torist,touristName,age, form tourist where nativplace=?
@Query(fields="{id:0,touristName:1,nativePlace:1,age:1,contactNo:1}",value="{nativePlace:{$in:[?0,?1,?2]}}")
public List<Object[]> getTouristDataByNativePlace(String nativeplace1,String nativeplace2,String nativeplace3);
}