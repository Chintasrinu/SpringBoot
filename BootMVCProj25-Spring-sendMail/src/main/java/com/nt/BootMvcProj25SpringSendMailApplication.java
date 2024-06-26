package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IPurchaseOrder;

@SpringBootApplication
public class BootMvcProj25SpringSendMailApplication {

	public static void main(String[] args) {
		// creat IOC container
		ApplicationContext ctx = SpringApplication.run(BootMvcProj25SpringSendMailApplication.class, args);
		// get Service class object ref 
		IPurchaseOrder order= ctx.getBean("purchese" , IPurchaseOrder.class);
		//invoke method
		try {
			String  msg = order.purchase(new String[] {"shirt","watch","fant"}, new double[] {5000,6000,7000},new String[]{"nataraj@gmail.com","srinuchinta155@gmail.com","srinuoleti155@gmail.com"});
			System.out.println(msg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		// close conatiner
		((ConfigurableApplicationContext)ctx).close();
	}
}
