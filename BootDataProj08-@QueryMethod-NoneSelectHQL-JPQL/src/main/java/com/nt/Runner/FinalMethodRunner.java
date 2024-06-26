package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;
@Component
public class FinalMethodRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo  repo;

	@Override
	public void run(String... args) throws Exception {
//	System.out.println("==================");
//	Object data = repo.fetchMoviePartialDataByMname("RRR");
//	Object result[] = (Object[])data;
//	for(Object val :result) {
//		System.out.println(val+" ");
//	}
//	System.out.println();
//	}
		//=================executing single aggregate function=========
	//System.out.println("lowest rating for Movie::"+repo.fetchRating());
//	Object result[] = (Object[])repo.fetchAggregateDataOnMovies();
//	System.out.println("Max rating::"+result[0]);
//	System.out.println("Min rating::"+result[1]);
//	System.out.println("Avg rating::"+result[2]);
//	System.out.println("count rating::"+result[3]);
//	System.out.println("Avg of year::"+result[4]);
//	System.out.println("sum of year::"+result[5]);
	//System.out.println("updating"+repo.modifyRatingByMovieName(1.0f,"amma")+ "Movies");
	System.out.println("delected"+repo.deleteMovieByYearRange("1900","2021" )+" movies are delected");
	}
}