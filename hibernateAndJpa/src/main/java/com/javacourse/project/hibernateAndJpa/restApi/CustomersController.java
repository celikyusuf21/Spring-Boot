package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javacourse.project.hibernateAndJpa.Business.ICustomersService;
import com.javacourse.project.hibernateAndJpa.Entities.*;

@RestController
@RequestMapping("/api")
public class CustomersController {
	
	private ICustomersService customersService;
	
	@Autowired
	public CustomersController(ICustomersService customersService) {
		this.customersService = customersService;
	}
	
	@GetMapping("/custmrs")
	public List<Customers> get(){
		
		return customersService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Customers customers) {
		customersService.add(customers);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Customers customers) {
		customersService.add(customers);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Customers customers) {
		customersService.add(customers);
	}
	
	@GetMapping("/custmrs/{id}")
	public Customers getById(@PathVariable int id){
		return customersService.getById(id);
	}
}
