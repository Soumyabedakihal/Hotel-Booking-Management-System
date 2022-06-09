package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/admin")
public class adminlogin  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email1");
		String password = req.getParameter("password1");
		
		String email1="admin@gmail.com";
		String password1="1234";
		PrintWriter printWriter = resp.getWriter();
		
		if(email.equals(email1)&&password.equals(password1))
		{
			System.out.println("admin successfully loggedin");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminchoice.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
		{
			printWriter.write("<html><body><h1> Invalid Admin Credential </h1></body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("admin.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
