package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Customers;

public interface ICustomersService {
	
	List<Customers> getAll();
	void add(Customers custmrs);
	void update(Customers custmrs);
	void delete(Customers custmrs);
	Customers getById(int id);
}
