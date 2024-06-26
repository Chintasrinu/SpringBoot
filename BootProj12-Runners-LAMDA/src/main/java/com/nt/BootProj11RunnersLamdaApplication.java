package com.nt;

import java.util.Set;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class BootProj11RunnersLamdaApplication {

@Bean
@Order(-30)
	public CommandLineRunner createClRunner() {
		// LAMDA impl for functional interface(imporive)
		
// CommandLineRunner clr = (String...args)->{
//System.out.println("From CommandLineRunner:"+Arrays.toString(args)); };
//return clr;
//}	
		// LAMDA impl for functional interface with for cach / enhance for loop
//		CommandLineRunner clr =(String...args)->{
//			System.out.println("From CommandLineRunner:"+Arrays.toString(args));
//		};
//	return clr;
//
//			for each loop
//		CommandLineRunner clr =(String...args)->{
//			System.out.println("CommandLineRunner");
//			for(String arg: args) {
//				System.out.println(arg);
//			}
//		};
//		return clr;
	
	
CommandLineRunner clr = args->{
		System.out.println("CommandLineRunner::");
	Stream.of(args).forEach(System.out::println);		};
	return clr;
	
	}

	@Bean
	public ApplicationRunner createAppRunner() {
	return aargs->{
		System.out.println("Non Option arg Values:"+aargs.getNonOptionArgs());
		System.out.println("option arg names and values:");
		Set<String>optionArgs = aargs.getOptionNames();
		optionArgs.forEach(oarg->{
			System.out.println(oarg);
			System.out.println(aargs.getOptionValues(oarg));
		});

	};
	}
	public static void main(String[] args) {
		SpringApplication.run(BootProj11RunnersLamdaApplication.class, args);
	}

}
