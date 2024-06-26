package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeMgmtService service;
	
@GetMapping("/")
public String showHome() {
	return "home";
}
@GetMapping("/report")
public String showEmployeeReport(Map<String,Object> map) {
	// use service
	List<Employee> list = service.getAllEmployee();
	//put the results in model attribute
	map.put("empsData", list);
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
public String addEmployee(RedirectAttributes attrs,@ModelAttribute("emp") Employee emp) {
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
public String editEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes attrs ) {
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
}