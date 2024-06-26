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
		//============find methods======
		repo.findByMnameEquals("AKKA").forEach(System.out::println);
System.out.println("=======findByMnameEquals==============");
  repo.findByMnameEquals("AMMA").forEach(System.out::println);

System.out.println("=======findByMnameIs==============");
repo.findByMname("babu").forEach(System.out::println);
System.out.println("======findByMnameStartingWith===============");
repo.findByMnameStartingWith("b").forEach(System.out::println);
System.out.println("========findByMnameEndingWith=============");
repo.findByMnameEndingWith("a").forEach(System.out::println);
System.out.println("=========findByMnameConatining============");
repo.findByMnameContaining("u").forEach(System.out::println);

System.out.println("========findByMnameEqualsIgnoreCase=============");
repo.findByMnameEqualsIgnoreCase("amMa").forEach(System.out::println);
System.out.println("=======findByMnameContainingIgnoreCase==============");
repo.findByMnameContainingIgnoreCase("u").forEach(System.out::println);
System.out.println("=======findByMnameLike==============");
repo.findByMnameLike("%R").forEach(System.out::println);

	}

}
