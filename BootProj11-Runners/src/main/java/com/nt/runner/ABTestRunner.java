package com.nt.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(-1)
public class ABTestRunner implements CommandLineRunner, Ordered{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ABTestRunner----------------------------run()");
		System.out.println("Runner to Test....."+Arrays.toString(args));
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 10;
	}

}
