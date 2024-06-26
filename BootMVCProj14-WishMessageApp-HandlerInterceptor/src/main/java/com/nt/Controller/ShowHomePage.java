package com.nt.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.IwishMessage;

import jakarta.servlet.http.HttpSession;
@Controller
public class ShowHomePage {
	@Autowired
	private IwishMessage service;
	
	@GetMapping("/report")
	public String showHomePages() {
		//return Lvn
		return "show_report";
	}
	@GetMapping("/")
	public String showHomePage1() {
	System.out.println("ShowHomePage.showHomePage1()");
	// return LVN
		return "home";
	}
}