package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;
@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService{
	
	// injects the dynamically generate proxy class object
	@Autowired
	private IMovieRepo movieRepo;

	@Override
	public String removieMoviesById(List<Integer> ids) {
		List<Movie> list = movieRepo.findAllById(ids);
		long count = list.size();
		movieRepo.deleteAllByIdInBatch(ids);
				return count+"number of record are deleted";
	}

	@Override
	public List<Movie> searchMovieByMovie(Movie movie, boolean asc, String... props) {
	Example example = Example.of(movie);
	Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,props);
	List<Movie> list = movieRepo.findAll(example,sort);
		return list;
	}

	@Override
	public Movie searchMovieById(Integer id) {
		Movie movie = movieRepo.getById(id);
		System.out.println(movie.getClass());
		return movie;
	}

	}