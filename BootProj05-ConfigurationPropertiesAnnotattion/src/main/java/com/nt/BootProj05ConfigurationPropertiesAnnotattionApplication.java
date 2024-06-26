package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.CustomerInfo;
import com.nt.beans.Employee;

@SpringBootApplication
public class BootProj05ConfigurationPropertiesAnnotattionApplication {

	public static void main(String[] args) {
		// get ioc container
		ApplicationContext ctx =SpringApplication.run(BootProj05ConfigurationPropertiesAnnotattionApplication.class, args);
		// get spring bean class object
		CustomerInfo cust = ctx.getBean("CustInfo",CustomerInfo.class);
		// invoke business method
		System.out.println("CustomerInfo object data::"+cust);
		System.out.println("===============");
		Employee emp = ctx.getBean("emp",Employee.class);
		System.out.println("Employee object data::"+emp);
		((ConfigurableApplicationContext)ctx).close();
	
	}

}
