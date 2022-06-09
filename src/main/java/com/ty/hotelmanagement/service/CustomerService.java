package com.ty.hotelmanagement.service;

import com.ty.hotelmanagement.dao.CustomerDao;
import com.ty.hotelmanagement.dto.Customer;

public class CustomerService {

	CustomerDao customerDao=new CustomerDao();
	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}
	public boolean removeCustomerById(int id) {
		return customerDao.removeCustomerById(id);
	}
}
