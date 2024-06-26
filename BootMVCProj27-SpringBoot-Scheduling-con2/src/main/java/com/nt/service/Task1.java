package com.nt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("task1")
public class Task1 {
	
//	@Scheduled(cron = "15 * * * * *")
//	public void doTask() {
//System.out.println("Task1()"+ new Date());
//	}
	@Scheduled(cron = "1 2 20 * * *")
	public void doTask() {
System.out.println("Task1()"+ new Date());
	}

}
