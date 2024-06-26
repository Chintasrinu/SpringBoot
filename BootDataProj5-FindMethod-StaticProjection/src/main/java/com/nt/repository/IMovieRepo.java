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
}
