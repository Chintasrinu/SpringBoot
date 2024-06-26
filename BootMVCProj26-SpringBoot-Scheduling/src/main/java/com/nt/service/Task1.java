package com.nt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("task1")
public class Task1 {
	
	@Scheduled(initialDelay = 5000,fixedRate = 4000)
	public void doTask() {
		try {
			Thread.sleep(5000);
		}
		catch (Exception e) {
			e.printStackTrace();}
System.out.println("Task1.doTask(end)"+ new Date());
	}

}
