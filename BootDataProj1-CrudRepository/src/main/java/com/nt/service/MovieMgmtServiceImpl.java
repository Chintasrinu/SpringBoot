package com.nt.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;
@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService{
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
}