package com.nt.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WishMessaGenerate implements IWishService{
  @Autowired
	private LocalDateTime idt;
	
	@Override
	public String generateWishMessage() {
	 int hour = idt.getHour();
	 if(hour<12)
		 return "Good Moring::";
	 else if(hour<16)
		 return "Good Afternoon::";
	 else if(hour<20)
		 return"Good Evening::";
	 else
		 return "Good Night::";
	}
}
