package com.ty.hotelmanagement.service;

import com.ty.hotelmanagement.dao.EmployeeDao;
import com.ty.hotelmanagement.dto.Employee;

public class EmployeService {

	EmployeeDao employeeDao=new EmployeeDao();
	 public Employee saveEmployee(Employee employee) {
		 
	return employeeDao.saveEmployee(employee);	 
	 
	 }
	 public boolean removeCustomerById(int id)
	 {
			return employeeDao.removeEmployeeById(id);
	 }
}
