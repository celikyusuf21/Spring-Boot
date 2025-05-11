package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List; // List icin import

import com.javacourse.project.hibernateAndJpa.Entities.Customers; // Customers icin burayi import edeceğiz

public interface ICustomerDal {
	List<Customers> getAll();
	void add(Customers custmrs);
	void update(Customers custmrs);
	void delete(Customers custmrs);
	Customers getById(int id);

}
