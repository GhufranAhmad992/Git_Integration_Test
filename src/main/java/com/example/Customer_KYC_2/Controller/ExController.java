package com.example.Customer_KYC_2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ExController {
	
	@GetMapping("/message")
	public String home() {
		return "Welcome to Eclipse git Integration!.. How Are You?.. I am OK.";
	}

}
