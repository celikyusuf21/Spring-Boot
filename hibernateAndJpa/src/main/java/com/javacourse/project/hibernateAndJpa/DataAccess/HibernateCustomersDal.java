package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;  // EntityManager Classı icin entegrsyon 
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.Customers;

@Repository
public class HibernateCustomersDal implements ICustomerDal {
	
	
	private EntityManager entityManager;  // Session factorye alternatif Jpa Class'ı olarak kulaniriz.
	
	@Autowired  // Bu Annotation bizlere Hibernate injectionu gerçeklestirecek
	public HibernateCustomersDal(EntityManager entityManager) {  // EntityManager icin bir constructor olusturduk.
		this.entityManager = entityManager;
	}
	
	// AOP -> Ascept Oriented Programing 
	@Override
	@Transactional
	public List<Customers> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Customers> cstmrs = session.createQuery("from Customers",Customers.class).getResultList();
		return cstmrs;
	}

	@Override
	public void add(Customers custmrs) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(custmrs);
		
	}

	@Override
	public void update(Customers custmrs) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(custmrs);
		
	}

	@Override
	public void delete(Customers custmrs) {
		Session session = entityManager.unwrap(Session.class);
		Customers custmrsToDelete = session.get(Customers.class,custmrs.getId());
		session.delete(custmrsToDelete);
		
	}
	
	public Customers getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Customers custmrs = session.get(Customers.class,id);
		return custmrs;
	}



}
