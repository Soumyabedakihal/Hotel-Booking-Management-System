package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.service.HotelService;

@WebServlet(value="/viewhotel")
public class ViewHotel extends HttpServlet{

	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		 String db=req.getParameter("hoteldetails");
		 
		 if(db!=null) {
			 System.out.println("All good");
		}
	}
}
