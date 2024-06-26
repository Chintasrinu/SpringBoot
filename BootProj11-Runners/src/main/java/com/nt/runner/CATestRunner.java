package com.nt.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(-4)
public class CATestRunner implements ApplicationRunner  {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("CATestRunner.-------------------------------run()");
		System.out.println("Non Option Values::"+args.getNonOptionArgs());
		System.out.println("Option arg names values::");
		
		for(String  name: args.getOptionNames()) {
			System.out.println(name+"------->"+args.getOptionNames());
			
		}
	}

}
