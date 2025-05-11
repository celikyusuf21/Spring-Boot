package com.javaLesson.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	// MVC -> Model View Controller
	
	@GetMapping("/")
	
	public String get() {
		
		return "Book";
		
	}
	
	@GetMapping("/products")
	
	public String get2() {
		
		return "Book4";
		
	}

}
