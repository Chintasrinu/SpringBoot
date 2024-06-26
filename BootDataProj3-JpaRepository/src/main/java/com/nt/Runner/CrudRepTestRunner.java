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
//	
//System.out.println("-----------delectAllByIdBatch(-)-----------");
		// try{
//			System.out.println(service.removieMoviesById(List.of(7,102)));
			
//			List<Integer> ids = new ArrayList();
//			ids.add(1);
//			ids.add(null);
//			System.out.println(service.removieMoviesById(ids));
//		}
//			List<Integer> ids = Arrays.asList(2,13);
//			System.out.println(service.removieMoviesById(ids));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("--------------findAll(Example,Sort()-----------------");
//			try {
//				Movie movie = new Movie();
//				//movie.setMid(100);
//				movie.setMname("bursili");
//				//movie.setRating(5.0f); //movie.setYear("2023");
//				List<Movie> list = service.searchMovieByMovie(movie, true, "mname");
//				list.forEach(System.out::println);
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
		System.out.println("--------------getById(Integer ,id)-----------------");
		try {
			System.out.println("1:::- movie details are"+service.searchMovieById(1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}		