package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.PersonInfo;

@SpringBootApplication
public class BootProj05ConfigurationPropertiesAnnotattionApplication {

	public static void main(String[] args) {
		// get ioc container
		ApplicationContext ctx =SpringApplication.run(BootProj05ConfigurationPropertiesAnnotattionApplication.class, args);
		// get spring bean class object
		 PersonInfo info = ctx.getBean("pInfo", PersonInfo.class);
		// invoke business method
		System.out.println("PersonInfo object data::"+info);
		System.out.println("===============");
		((ConfigurableApplicationContext)ctx).close();
	
	}

}
