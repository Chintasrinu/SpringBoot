package controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.Service.IWishService;

@Controller
public class WishMessageOperationContoller {
	@Autowired
	private IWishService service;
	
	@GetMapping("/")
	public String showHomePage() {
		// lvn name
		return "welcome";
	}
	@GetMapping("/wish")
	public String fetchWishMessage(Map<String, Object> map) {
		String msg = service.generateWishMessage();
		map.put("wMsg", msg);
		map.put("sysDate", new Date() );
		map.put("wMsg", msg);
		return "show_result";
		
	}
}
