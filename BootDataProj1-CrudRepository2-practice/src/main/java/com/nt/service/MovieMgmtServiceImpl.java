package com.nt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;
@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService{
	private static final String Integer = null;
	// injects the dynamically generate proxy class object
	@Autowired
	private IMovieRepo movieRepo;
	@Override
	public String registerMovie(Movie movie) {
		System.out.println("class name::"+movieRepo.getClass()+"-----------"+Arrays.toString(movieRepo.getClass().getAnnotatedInterfaces()));
		// use repo
		System.out.println("before saving::"+movie);
		Movie movie1 = movieRepo.save(movie);
		System.out.println("After saving::"+movie1);
		return "Movie is  registered with the id value::"+movie1.getMid();
	}
	@Override
	public long fetchMoviesCount() {
		System.out.println("class name::"+movieRepo.getClass()+"-----------"+Arrays.toString(movieRepo.getClass().getAnnotatedInterfaces()));
		System.out.println("--------------------------------------------");
		System.out.println("methods name::"+Arrays.toString(movieRepo.getClass().getDeclaredMethods()));
		return movieRepo.count();
	}
	@Override
	public boolean checkMovieById(Integer mid) {
		return movieRepo.existsById(mid);
	}
	@Override
	public Iterable<Movie> fectAllMovie() {
		return movieRepo.findAll();
	}
	@Override
	public Iterable<Movie> fectAllMovieByIds(List<Integer> mids) {
		
		return movieRepo.findAllById(mids);
	}
	@Override
	public Movie fetchMovieById(Integer mid) {
		return movieRepo.findById(mid).orElseThrow(()->new IllegalArgumentException("Recor not found"));
}
//	@Override
//	public Movie fectchMoviesById(Integer mid) {
//		return movieRepo.findById(mid).orElse(new Movie()); // if record is avaliable return obj with data
//		                                                                                                            // otherwise empty entity object
//	}
	@Override
	public Optional<Movie> gatherMovieById(Integer mid) {
		Optional<Movie> opt = movieRepo.findById(mid);
		
		return opt.isEmpty()?Optional.empty():opt;
	}
	@Override
	public String groupMovieRegistration(List<Movie> moviesList) {
	Iterable<Movie> savedmovie =movieRepo.saveAll(moviesList); 
	List<Integer> listids = new ArrayList();
	if(savedmovie!=null &&((List<Movie>)savedmovie).size()>0) {
	savedmovie.forEach(m->{listids.add(m.getMid());
	});
	} //if
		return listids.toString()+"movies are saved";
	}
	@Override
	public String updateMovieDetails(Integer mid, String newYear, float newRating) {
Optional<Movie> opt = movieRepo.findById(mid);
if(opt.isPresent()) {
	Movie movie = opt.get();
	movie.setYear(newYear);
	movie.setRating(newRating); // always calls merge(-) to perform update operation
	movieRepo.save(movie);
	return mid+"movie id  movie is updated";
}
	else
		return"movie id movie is not available";
}
//	@Override
//	public String updateMovie(Movie movie) {
//		Optional<Movie> opt = movieRepo.findById(movie.getMid());
//		if(opt.isPresent()) {
//			movieRepo.save(movie);
//			return"movie is updated";
//		}
//		else
//		return "movie is not found to update";
//	}
	@Override
	public String updateMovie(Movie movie) {
			movieRepo.save(movie);
			return"movie is updated";
	}
	@Override
	public String removeMovieById(Integer mid) {
		Movie movie =movieRepo.findById(mid).orElseThrow(()->new IllegalArgumentException("movie not found"));
		movieRepo.delete(movie);
		return "record delected";
	}
	@Override
	public String removeMovie(Movie movie) {
		movieRepo.delete(movie);
		return "record delect";
	}
	@Override
	public String removeAllMovies() {
		long count = movieRepo.count();
		if(count!=0)
			movieRepo.deleteAll();
		return count+"no.of record are delected";
	}
	@Override
	public String removeAllMoviesByids(List<Integer> ids) {
		Iterable<Movie> it = movieRepo.findAllById(ids);
		long count = ((List<Movie>) it).size();
		if(ids.size()!=0 && ids.size()==count) {
			movieRepo.deleteAllById(ids);
			return ((List<Movie>)it).size()+ "no.of records are deleted";
		}
		else 
			return "No ids are given to delect or either all or some ids are not available to delect";
	}
	
	
	
	}