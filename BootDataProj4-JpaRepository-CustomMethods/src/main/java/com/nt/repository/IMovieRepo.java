package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	// select Mid, Mname, year, rating from Movie where Mname = ?
	public List<Movie> findByMnameEquals(String name);
	
	// select Mid, Mname, year, rating from Movie where Mname = ?
		public List<Movie> findByMnameIs(String name);
		// select Mid, Mname, year, rating from Movie where Mname = ?
		public List<Movie> findByMname(String name);

		// select Mid, Mname, year,rating from Movie where Mname like 'R%'
		public Iterable<Movie> findByMnameStartingWith(String initChar);
		
		// select Mid, Mname, year,rating from Movie where Mname like 'n%'
				public Iterable<Movie> findByMnameEndingWith(String lastChar);
				
				// select Mid, Mname, year,rating from Movie where Mname like '%dhe%'
				public Iterable<Movie> findByMnameContaining(String Char);
				
				// select Mid, Mname, year,rating from Movie where Mname like '%dhe%'
				public Iterable<Movie> findByMnameEqualsIgnoreCase(String name);
				// select Mid, Mname, year,rating from Movie where Mname like '%dhe%'
				public Iterable<Movie> findByMnameContainingIgnoreCase(String chars);
				
				public Iterable<Movie> findByMnameLike(String chars);
				
				// finder method with multiple properties based
				// select Mid, Mname, year, rating,  from Movie where mid>? and rating<?
				public Iterable<Movie> findByMidLessThanAndRatingGreaterThan(int StartMid, float endRating);
				// select Mid, Mname, year, rating,  from where Mname like 'R%' or (rating between 3.0 and 5.0)
				public Iterable<Movie>findByMnameStartingWithOrRatingBetween(String MnameChar ,float StartRating,float endRatings);
				// select Mid, Mname, year,rating from Moive where (Mname not like escape?) and (year in(?,?)order by manem asc
				public Iterable<Movie> findByYearInOrMnameContainingIgnoreCaseAndRatingBetween(List<String>years, String chars,float StartRating,float endRatings);
}
