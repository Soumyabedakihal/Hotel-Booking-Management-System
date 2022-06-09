package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Employee;
import com.ty.hotelmanagement.service.EmployeService;
@WebServlet(value = "/employee")
public class SaveEmployee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("empName");
		String email = req.getParameter("empEmail");
		String password = req.getParameter("empPassword");
		String designation=req.getParameter("empDesignation");
		long phone = Long.parseLong(req.getParameter("empPhone"));
		
		
		
		Employee employee=new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setDesignation(designation);
		employee.setPhone(phone);
		EmployeService employeService=new EmployeService();
		 Employee employee2=employeService.saveEmployee(employee);
		 PrintWriter printWriter = resp.getWriter();
		 if(employee2!=null) {
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("EmployeeCreated.jsp");
			 requestDispatcher.forward(req, resp);
		 }
		 else 
		 {
			 printWriter.write("<html><body><h1> Invalid Employee Credential </h1></body></html>");
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("createEmployee.jsp");
			 requestDispatcher.include(req, resp);
		 }
	
	}
}
