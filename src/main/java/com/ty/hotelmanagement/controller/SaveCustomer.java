package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Customer;
import com.ty.hotelmanagement.service.CustomerService;
@WebServlet(value = "/customer")
public class SaveCustomer extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("custName");
		String email=req.getParameter("custEmail");
		String gender=req.getParameter("custGender");
		long phone=Long.parseLong(req.getParameter("custPhone"));
		
		
		Customer customer=new Customer();
		customer.setName(name);
		customer.setEmail(email);
		customer.setGender(gender);
		customer.setPhone(phone);
		
		CustomerService customerService=new CustomerService();
		 Customer customer2=customerService.saveCustomer(customer);
		 if(customer2!=null) {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("createCustomerSuccessfully.jsp");
			 requestDispatcher.forward(req, resp);
		 }else {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("createCustomer.jsp");
			 requestDispatcher.forward(req, resp);
		 }
		
	}
}
