package com.nt.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.model.Product;
import com.nt.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService IproductService;
    @GetMapping("./")
    public Sting  showhomePage() {
    	//retun LVN
    	return "home";
    }
    
    @GetMapping("/report")
    public String showEmployeeReport(Map<String,Object> map) {
    	// use service
    	List<Product> list = IproductService.getAllProduct();
    	//put the results in model attribute
    	map.put("Products", list);
    	//return LVN
    	return "employee_report";
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String title) {
        return IproductService.searchProducts(title);
    }
}
