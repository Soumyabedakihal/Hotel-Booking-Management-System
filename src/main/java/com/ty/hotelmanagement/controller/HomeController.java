package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/home")
public class HomeController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		String admin=req.getParameter("admin");
		String employee=req.getParameter("employee");
		String customer=req.getParameter("customer");
		
		if(admin!=null) {
			System.out.println("admin");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("admin.jsp");
			requestDispatcher.forward(req, resp);

		}
		else
			
			if(employee!=null) 
			{
				System.out.println("emp");
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("Emplogin.jsp");
				requestDispatcher.forward(req, resp);

			}else
				if(customer!=null){
					System.out.println("cust");
					RequestDispatcher requestDispatcher=req.getRequestDispatcher("createCustomer.jsp");
					requestDispatcher.forward(req, resp);

				}
		
	
	}
}
