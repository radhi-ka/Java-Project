package com.keerthi.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showViewPage() {
		return "Main-Menu";
		
	}

	
	
}
