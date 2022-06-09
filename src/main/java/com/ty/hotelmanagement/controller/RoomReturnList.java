package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/roomReturnList")
public class RoomReturnList extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		System.out.println(id+ "is your book id");
		int bid=Integer.parseInt(id);
		System.out.println(bid);
		if(bid!=0) {
			req.setAttribute("myid", bid);
			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("hotelIdIdentification.jsp");
				requestDispatcher.forward(req, resp);
		}
	
	
	
	
	
	}

}