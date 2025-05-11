package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.javacourse.project.hibernateAndJpa.DataAccess.ICustomerDal;
import com.javacourse.project.hibernateAndJpa.Entities.Customers;

@Service
public class CustomersManager implements ICustomersService {
	
	
	private ICustomerDal customerDal;
	
	
	@Autowired
	public CustomersManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	@Transactional
	public List<Customers> getAll() {
		// TODO Auto-generated method stub
		return customerDal.getAll();
	}

	@Override
	@Transactional
	public void add(Customers custmrs) {
		this.customerDal.add(custmrs);
		
	}

	@Override
	@Transactional
	public void update(Customers custmrs) {
		this.customerDal.update(custmrs);
		
	}

	@Override
	@Transactional
	public void delete(Customers custmrs) {
		this.customerDal.delete(custmrs);
		
	}

	@Override
	@Transactional
	public Customers getById(int id) {
		
		return this.customerDal.getById(id);
	}
	
	

}
