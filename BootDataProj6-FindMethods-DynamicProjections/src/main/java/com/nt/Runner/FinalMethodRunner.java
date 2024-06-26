package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;
@Component
public class FinalMethodRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo  repo;

	@Override
	public void run(String... args) throws Exception {
//		Iterable<ResultView1> list = repo.findByMnameIn(List.of("RRR", "AMMA"),ResultView1.class);
//		list.forEach(v1->{System.out.println(v1.getMid()+" "+v1.getMname());});
//		
//		System.out.println("===================");
//		 repo.findByMnameIn(List.of("RRR", "AMMA"),
//		ResultView2.class).forEach(v2->{System.out.println(v2.getMid()+" "+v2.getMname()+" "+v2.getRating());});
//		 System.out.println("===================");
//		 repo.findByMnameIn(List.of("RRR", "AMMA"),
//		ResultView3.class).forEach(v3->{System.out.println(v3.getMid()+" "+v3.getMname()+" "+v3.getYear());});
	
	Movie movie = new Movie();
	movie.setMname("NAGOOR");
	movie.setRating(4.5f);
	movie.setYear("2002");
	System.out.println(repo.save(movie));
	
	
	}

}
