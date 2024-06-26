package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
//	@Query("select mid,mname,year from Movie where  mname=:name")
//	public Object fetchMoviePartialDataByMname(String name);

	//@Query("select min(rating) from Movie")
//	public float fetchRating();
	//===================
//	@Query("select max(rating),min(rating),avg(rating),count(*) ,avg(year),sum(year), from Movie")
//	public Object fetchAggregateDataOnMovies();
//	@Query("update Movie set rating=:newRating where mname=:name")
//	@Modifying
//	@Transactional
//	public int modifyRatingByMovieName(float newRating, String name);
	
	@Query("deleted Movie  where year>=:start and year<=:end")
	@Modifying
	@Transactional
	public int deleteMovieByYearRange(String start, String end);
}