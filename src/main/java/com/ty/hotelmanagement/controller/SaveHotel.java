package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.service.HotelService;
@WebServlet(value = "/hotel")
public class SaveHotel extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("hotelName");
		long phone=Long.parseLong(req.getParameter("hotelPhone"));
		String website=req.getParameter("hotelWebsite");
		String address=req.getParameter("hotelAddress");
		
		Hotel hotel=new Hotel();
		hotel.setName(name);
		hotel.setPhone(phone);
		hotel.setWebsite(website);
		hotel.setAddress(address);
		
		HotelService hotelService=new HotelService();
		Hotel hotel1=hotelService.saveHotel(hotel);
		PrintWriter printWriter = resp.getWriter();
		if(hotel1!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("hotelCreated.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			printWriter.write("<html><body><h1> Invalid Hotel Credential </h1></body></html>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminloginhotel.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
