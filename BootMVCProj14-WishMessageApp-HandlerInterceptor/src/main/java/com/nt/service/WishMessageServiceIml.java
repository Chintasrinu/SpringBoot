package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceIml implements IwishMessage {
	LocalDateTime ldt = LocalDateTime.now();
	@Override
	public String fetchWishMessage() {
		int hour = ldt.getHour();
		if(hour<=12)
			return "Good Moring";
		else if(hour<=16)
			return "Good Evening";
		else if(hour<=18)
			return "Good Afternoon";
		else
			return"Good Night";
	}
}
