package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.Hospital;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// get IOC  container 
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		// get spring bean object 
		 Hospital hospital  = ctx.getBean("hsptl",Hospital .class);
		 // invoke businnes method
		 System.out.println("spring bean class obj data::"+hospital);
	
	// close Ioc Container 
	((ConfigurableApplicationContext)ctx).close();

}
}

