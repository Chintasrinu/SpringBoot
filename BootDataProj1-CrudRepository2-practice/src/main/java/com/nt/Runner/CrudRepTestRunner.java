package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IMovieMgmtService;
@Component
public class CrudRepTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieMgmtService service;

	@Override
	public void run(String... args) throws Exception {
			// invoke service method
					Movie movie = new Movie();
					movie.setMname("JONEE");
					movie.setRating(4.0f);
			movie.setYear("2021");
			try {
				System.out.println(service.registerMovie(movie));
			}
			catch(Exception e) {
				e.printStackTrace();
			}

//		System.out.println("---------------------------");
//		try {
//			System.out.println("record count::"+service.fetchMoviesCount());
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("---------------------------");
//		try {
//			System.out.println("is 2 mid movie avaliable ?"+service.checkMovieById(2));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	System.out.println("------------1-------------------"); // enhance for loop
//	try {
//		Iterable<Movie> list = service.fectAllMovie();
//		for(Movie movie: list) {
//			System.out.println(movie);
//		}
//		System.out.println("-------------2------------");   // forEach() method
//		list.forEach(movie->{System.out.println(movie);});
//		
//		System.out.println("----------------3------------------");
//		
//		
//	}
//	catch(Exception e ) {
//		e.printStackTrace();
//	}
		
//		System.out.println("---------for findAllById(-)-- method---------------");
//		try {
//			List<Integer> idlist = new ArrayList();
//			idlist.add(2); idlist.add(1);
//			System.out.println("movie are::"+service.fectAllMovieByIds(idlist));
//			System.out.println("------------------------");
//			System.out.println("movie are::"+service.fectAllMovieByIds(List.of(1,2)));
//			System.out.println("------------------------");
//			System.out.println("movie are::"+service.fectAllMovieByIds(Arrays.asList(1,2)));
//		}
//		catch(Exception e ) {
//			e.printStackTrace();
//	}
		
//		try {
//			System.out.println("2 movie is::"+service.fectchMoviesById(11));
//			
//		}
//		catch(Exception e ) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//	}
	
//		
//		System.out.println("------------for findbyid(-)--method-------------------");
//		try {
//			Optional<?> opt = service.gatherMovieById(2);
//			if(!opt.isEmpty())
//				System.out.println("2 movie::"+opt.get());
//			else
//				System.out.println("record not found");
//		}
//		catch(Exception e ) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//	}
//		System.out.println("------------for findbyid(-)--method-------------------");
//		try {
//			String result = service.groupMovieRegistration(List.of(new Movie("KALKHI", "2024", 5.6f), new Movie("pushpa", "2022" ,4.3f), null ));
//			
//			System.out.println(result);
//					  
//		}
//		catch(Exception e ) {
//			e.printStackTrace();
//}
//		System.out.println("------------for save(-)--method----update obect operation--method-------------------");
//		
//		try {
//			String result =service.updateMovieDetails(952, "kabali",4.3f);
//			System.out.println(result);
//		}
//		catch(Exception e ) {
//		e.printStackTrace();
//}
//System.out.println("------------for save(-)--method----update object operation--method-------------------");
		
//		try {
//			Movie movie = new Movie("guruvu","2024",5.0f);
//			movie.setMid(1953);
//			String result = service.updateMovie(movie);
//			System.out.println(result);
//		}
//		catch(Exception e ) {
//		e.printStackTrace();
//}

//System.out.println("------------for save(-)--method----update object operation--method-------------------");
//	try {
//		System.out.println(service.removeMovieById(52));
//	}// try
//	catch(Exception e ) {
//		e.printStackTrace();
//}
//	System.out.println("------------for save(-)--method----update object operation--method-------------------");
//	try {
//		Movie movie = new Movie();
//		String result = service.removeMovie(movie);
//		movie.setMid(1953);
//		System.out.println(result);
//	}// try
//	catch(Exception e ) {
//		e.printStackTrace();
//}
//		
//		System.out.println("------------for save(-)--method----update object operation--method-------------------");
//		try {
//			System.out.println(service.removeAllMoviesByids(List.of(1,2)));
//		}
//		catch(Exception e ) {
//			e.printStackTrace();
//	}
	}
	
}