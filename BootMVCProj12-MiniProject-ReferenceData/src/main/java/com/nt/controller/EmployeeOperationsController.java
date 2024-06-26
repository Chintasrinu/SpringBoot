package com.nt.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;
import com.nt.validations.EmployeeValidator;

@Controller
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeMgmtService service;
	@Autowired
	private EmployeeValidator empValidator;
	
@GetMapping("/")
public String showHome() {
	return "home";
}
@GetMapping("/report")
public String showEmployeeReport(@PageableDefault(page=0,size = 3,sort = "job",direction = Sort.Direction.ASC) Pageable pageable ,Map<String,Object> map) {
	// use service
	Page<Employee> page = service.getEmployeePageData(pageable);
	//put the results in model attribute
	map.put("empsData", page);
	//return LVN
	return "employee_report";
}
@GetMapping("/add")
public String showAddEmployeeFrom(@ModelAttribute("emp") Employee emp ){
	System.out.println("EmployeeOperationsController.showAddEmployeeFrom()");
	// inital value to display in form comp as initial value
	emp.setJob("CLERK");
	//return LVN
	return "employee_register"; 
}

@PostMapping("/add")
public String addEmployee(RedirectAttributes attrs,@ModelAttribute("emp") Employee emp,BindingResult errors) {
	if(emp.getVflag().equalsIgnoreCase("no")) {
	//checking for type mismatch errors
	if(errors.hasFieldErrors()) 
		return "employee_register";
	// checking for type validation errors
	if(empValidator.supports(emp.getClass())) {
		empValidator.validate(emp, errors);//T
		if(errors.hasErrors())
			return "employee_register";
	}
	}
	//application logical errors
	if(emp.getJob().equalsIgnoreCase("hacker")) {
		errors.rejectValue("job","job.reject");
	return "employee_register";
}
	// use service
	String result = service.registerEmployees(emp);
	// keep results in model attribute(RedirectAttribute)
	attrs.addFlashAttribute("resultMsg",result);
	// return LVN
	return  "redirect:report";
}
@GetMapping("/edit")
public String showEditEmployeeFrom(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {

	// get Employee details dyanamically based on the given emp no
	Employee emp1=service.getEmployeeByno(no);
	// emp=emp1;
	BeanUtils.copyProperties(emp1, emp);
	// return
	return "employee_edit";
}
@PostMapping("/edit")
public String editEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs, BindingResult errors ) {
	if(emp.getVflag().equalsIgnoreCase("no")) {
	//checking for type mismatch errors
		if(errors.hasFieldErrors()) 
			return "employee_edit";
		// checking for type validation errors
	if(empValidator.supports(emp.getClass())) {
		empValidator.validate(emp, errors);
	if(errors.hasErrors())
		return "employee_edit";
	}
	}
	//application logical errors
	if(emp.getJob().equalsIgnoreCase("hacker")) {
		errors.rejectValue("job","job.reject");
	return "employee_edit";
}
	String msg = service.editEmployee(emp);
	// keep results in model attributes(Retdiretcattrs)
	attrs.addFlashAttribute("resultMsg", msg);
	//return LVN
	return "redirect:report";
}
@GetMapping("/delete")
public String deleteEmployee(@RequestParam("no") int no, RedirectAttributes attrs) {
	// use service
	String msg = service.deleteEmployee(no);
	// keep results in model attributes(Retdiretcattrs)
		attrs.addFlashAttribute("resultMsg", msg);
	// return LVN
	return "redirect:report";
}
@ModelAttribute("countriesInfo")
public Set<String> populateCountries(){
	System.out.println("EmployeeOperationsController.populateCountries()");
	// use service
	Set<String> countrySet = service.getAllCountries();
	return countrySet;
}
}