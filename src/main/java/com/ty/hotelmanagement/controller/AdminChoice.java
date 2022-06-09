package com.ty.hotelmanagement.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/adminchoice")
public class AdminChoice extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	      String addHotel=req.getParameter("addHotel");
	      String addEmployee=req.getParameter("addEmployee");
	      if(addHotel!=null) {
	    	  System.out.println(" Hotel console is promoted");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminloginhotel.jsp");
				requestDispatcher.forward(req, resp);

	      }
	      else if(addEmployee!=null)
	      {
	    	  System.out.println("Employee console promoted");
	    	  RequestDispatcher requestDispatcher = req.getRequestDispatcher("createEmployee.jsp");
				requestDispatcher.forward(req, resp);
	      }
	      else
	      {
	    	  System.out.println("all good");
	      }
	}

}
