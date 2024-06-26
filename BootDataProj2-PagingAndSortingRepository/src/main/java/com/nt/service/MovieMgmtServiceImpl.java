package com.nt.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public Iterable<Movie> displayMovieByOrder(boolean asc, String... Properties) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,Properties);
		return movieRepo.findAll(sort);
	}

	@Override
	public Page<Movie> generateReport(int pageNo, int pageSize, boolean asc, String... props) {
		// create Peageable  obj
		Pageable peageable = PageRequest.of(pageNo, pageSize,Sort.by(asc?Direction.ASC:Direction.DESC,props));
		// get requested page records
		Page<Movie> page =movieRepo.findAll(peageable);
		return page;
	}

//	@Override
//	public void generateMovieReport(int pageSize) {
//		// get count of records
//		long recordsCount = movieRepo.count();
//		// decide no.of pages (pagesCount)
//		long pagesCount = recordsCount/pageSize;
//		// get exact pageCount
//		pagesCount = recordsCount%pageSize==0?pagesCount:++pagesCount;
//		
//		for(int pageNo=0; pageNo<pagesCount; ++pageNo) {
//			// prepare peagble object
//			Pageable peagble = PageRequest.of(pageNo, pageSize);
//			Page<Movie> page = movieRepo.findAll(peagble);
//			System.out.println("page no::"+pageSize+"pageSize:"+pageSize+"pageRecord count::"+page.getNumberOfElements());
//			List<Movie> list = page.getContent();
//			list.forEach(movie->{
//				System.out.println(movie);
//			});
//			}
	@Override
	public void generateMovieReport(int pageSize) {
		// get count of records
		long recordsCount = movieRepo.count();
		// decide no.of pages (pagesCount)
		System.out.println("------record count::"+recordsCount);
		long pagesCount = 0;
		if(pageSize>=1) {
			pagesCount = recordsCount/pageSize;
		// get exact pageCount
		pagesCount = recordsCount%pageSize==0?pagesCount:++pagesCount;
		System.out.println("-------------pagesCount---------"+pagesCount);
		}
		else {
			throw new IllegalArgumentException("page Size can to be<=Zero");
		}
		for(int pageNo=0; pageNo<pagesCount; ++pageNo) {
			// prepare peagble object
			Pageable peagble = PageRequest.of(pageNo, pageSize);
			Page<Movie> page = movieRepo.findAll(peagble);
			System.out.println("page no::"+pageSize+"pageSize:"+pageSize+"pageRecord count::"+page.getNumberOfElements());
			List<Movie> list = page.getContent();
			list.forEach(movie->{
				System.out.println(movie);
			});
			}
		
	
	}

	
	
	}