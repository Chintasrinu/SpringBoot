package com.nt.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.PoliticianProfile;
@Controller
public class PoliticanOperationController {
	
	@GetMapping("/")
	public String showHome() {
		System.out.println("PoliticanOperationController.showHome()");
		// return logical name
		return "home";
	}
	@GetMapping("/register")
	public  String showFromPage(@ModelAttribute("pp") PoliticianProfile profile ) {
		System.out.println("PoliticanOperationController.showFromPage()");
		// return logical name
		return "politiciation_register";
	}
	@PostMapping("/register")
	public  String registerPolitician(@ModelAttribute("pp") PoliticianProfile profile ) {
		System.out.println("PoliticanOperationController.registerPolitician()");
		// return logical name
		return "show_result";
	}
	@InitBinder
	public void myDataBinder(WebDataBinder binder) {
		System.out.println("PoliticanOperationController.myDataBinder()");
		SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-DD");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sdf, false));
	}

}
