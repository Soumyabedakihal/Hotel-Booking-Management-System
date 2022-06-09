package com.ty.hotelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotelmanagement.dto.Customer;
import com.ty.hotelmanagement.dto.Employee;

public class CustomerDao {


	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("soumya");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Customer saveCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
	public boolean removeCustomerById(int id) {
		Customer customer  = entityManager.find(Customer.class, id);
		if (customer != null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
}
}