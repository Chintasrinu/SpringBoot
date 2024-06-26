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
	//System.out.println("=========Query Method execution=========");
	//List<Movie> list = repo.searchMovieByMname("tiger","babu","KHAKI","null");
	//list.forEach(System.out::println);
	
	System.out.println("=========Scaler Queries(Specific multiple column values==========");
	repo.fetchMovieDetailsByRatingsAndYear(4.0f, "2020", "2021","2023").forEach(row->{
		for(Object val:row)
			System.out.print(val+"  ");
		System.out.println();
	});
	}
}
/*Movie movie = repo.fetchMovieDataByMname("akka");
if(movie!=null)
	System.out.println("RRR movie details are::"+movie);
else
	System.out.println("Movie not found");
	*/
//System.out.println("===================");
//String year = repo.fetchMovieSingleDataByMname("AKKA");
//System.out.println("Akka Movie release year::"+year);
	