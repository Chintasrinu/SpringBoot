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
/*int result = repo.registerMovie("jawan", 4.5f, "2024");
System.out.println(result==0?"Movie not registered":"movie registered");*/
	
	System.out.println("date and time:"+repo.fetchSysDate());
	System.out.println("===============");
	int result = repo.createTempTable();
	System.out.println(result<0?"Table is not created":"Table is creted");
	}
}