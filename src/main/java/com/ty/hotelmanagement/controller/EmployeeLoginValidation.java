package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Emplogin")
public class EmployeeLoginValidation extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
	String id=req.getParameter("empId");
	String password=req.getParameter("empPassword");
	
	if(id.equals("1")&&password.equals("12345")) {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmployeeHomePage.jsp");
		requestDispatcher.forward(req, resp);

	}else
	{
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Emplogin.jsp");
		requestDispatcher.forward(req, resp);

	}
	
	
	}

}
