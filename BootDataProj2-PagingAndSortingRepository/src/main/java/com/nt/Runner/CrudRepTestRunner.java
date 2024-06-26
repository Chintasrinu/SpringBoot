package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IMovieMgmtService;
@Component
public class CrudRepTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieMgmtService service;

	@Override
	public void run(String... args) throws Exception {
//	
//System.out.println("-----------finall(peagble peagble)-----------");
//
//		try {
//		Page<Movie> page = service.generateReport(1, 1, true,"Mname");
//		System.out.println("page number::"+page.getNumber());
//		System.out.println("pages Count::"+page.getTotalElements());
//		System.out.println("is it first page::"+page.isFirst());
//		System.out.println("is it last page::"+page.isLast());
//		System.out.println("page Size::"+page.getSize());
//		System.out.println("page element count::"+page.getNumberOfElements());
//		if(!page.isEmpty()) {
//			List<Movie> list = page.getContent();
//			list.forEach(System.out::println);
//		}
//		else
//			System.out.println("no page found");
//		}// try
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("-----------finall(peagble peagble)-----------");
		try {
			service.generateMovieReport(5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}