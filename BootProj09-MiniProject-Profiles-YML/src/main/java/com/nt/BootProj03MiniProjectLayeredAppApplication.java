package com.nt;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.payRollSystemController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03MiniProjectLayeredAppApplication {

		@Bean(name = "c3p0DS")
		@Profile({"uat"})
		 public DataSource createDs() { 
			   ComboPooledDataSource cds = new ComboPooledDataSource(); 
		  //cds.setDriverClass("oracle.jdbc.driver.OracleDriver"); 
		  cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl"); 
		  cds.setUser("system"); 
		  cds.setPassword("Srinu@155"); 
		  return cds;
		  }

	public static void main(String[] args) {
		// get ioc container 
		ApplicationContext ctx = SpringApplication.run(BootProj03MiniProjectLayeredAppApplication.class, args);
		payRollSystemController payroll = ctx.getBean("controller",payRollSystemController.class);
		// gather inputs from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter desg1:");
		String desg1 = sc.next().toUpperCase();
		System.out.println("enter desg2:");
		String desg2 = sc.next().toUpperCase();
		System.out.println("enter desg3:");
		String desg3 = sc.next().toUpperCase();
		// invoke method
		try {
			List<Employee> listEmps = payroll.showEmpsDetailsByDesg(desg1, desg2,desg3);
			for(Employee e: listEmps) {
				System.out.println(e);
			}// for loop
		}// try
		catch(SQLException se) {
			se.printStackTrace();
			System.out.println("Internal DB probleam ");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unkonw probleam");
		}
		sc.close();
		((ConfigurableApplicationContext)ctx).close();

	}
}
