package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	//@Query("from Movie where mid>=?1 and mid<=?2")
	//@Query("from Movie as m where m.mid>=?1 and m.mid<=?2")
	/*@Query("from Movie where mid>=:min and mid<=:max")
	public List<Movie> searchMovieByIdRange(@Param("min") int start,@Param("max") int end);*/
	/*@Query("from Movie where mid>=:min and mid<=:max")
	public List<Movie> searchMovieByIdRange( int start,int end);*/

//@Query("from Movie where  mname In(:name1,:name2,:name3,:name4) order by mname asc")
//public List<Movie> searchMovieByMname(String name1,String name2,String name3 ,String name4);

	//@Query("from Movie where  mname In(?1,?2,?3,?4)order by mname asc")
	//public List<Movie> searchMovieByMname(String name1,String name2,String name3,String name4);

	
	//probleam
	  @Query("select mid, mname,year from SP_DATA_MOVIE where rating>=:rat and year in(:y1,:y2,:y3)")
	public List<Object[]> fetchMovieDetailsByRatingsAndYear(float rat, String y1, String y2, String y3);

/* single Row Entity Query
	@Query("from Movie where mname=:name")  // assuming movie name are unique name
	public Movie fetchMovieDataByMname(String name);*/
	
	// single row Scalary Query giving specific multiple column values
//	@Query("select year from Movie where mname=:name")
//	public String  fetchMovieSingleDataByMname(String name);
}