package com.ty.hotelmanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.*;
@WebServlet(value = "/empportal")
public class EmployeePortal extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 	 String viewHotel=req.getParameter("viewHotel");
	 	 String viewRoom=req.getParameter("viewRoom");
	 	 String roomVacated=req.getParameter("addRoom");
	 	 String roomBooked=req.getParameter("removeRoom");
	 	 String roomHistory=req.getParameter("roomHistory");
	 	 String listRoomBook=req.getParameter("listRoomBook");
	 	 String listRoomVacate=req.getParameter("listRoomVacate");
	 	 
	 	if(viewHotel!=null){
			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewhotel.jsp");
			 requestDispatcher.forward(req, resp);
			 
			 
		 }else
			 if(viewRoom!=null){
	 			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewroom.jsp");
	 			 requestDispatcher.forward(req, resp);
	 			 
	 			 
	 		 }else
	 		 if(roomVacated!=null){
	 			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("roomReturnPortal.jsp");
	 			 requestDispatcher.forward(req, resp);
	 			 
	 			 
	 		 }else
	 			 if(roomBooked!=null){
	 				 RequestDispatcher requestDispatcher = req.getRequestDispatcher("roombookPortal.jsp");
	 				 requestDispatcher.forward(req, resp);
	 				 
	 			 }else
	 				 if(roomHistory!=null) {
	 					 RequestDispatcher requestDispatcher = req.getRequestDispatcher("roomsDatabase.jsp");
	 					 requestDispatcher.forward(req, resp);
	 					  
	 				 }else 
	 				 if(listRoomBook!=null)
	 				 {
	 					RequestDispatcher requestDispatcher = req.getRequestDispatcher("listRoomBook.jsp");
	 					requestDispatcher.forward(req, resp);
	 					  
	 				 }else
	 					 if(listRoomVacate!=null)
	 				 {
	 					RequestDispatcher requestDispatcher = req.getRequestDispatcher("listRoomReturn.jsp");
	 					requestDispatcher.forward(req, resp);
	 					  
	 				 }else {
	 					 RequestDispatcher requestDispatcher = req.getRequestDispatcher("Emplogin.jsp");
	 					 requestDispatcher.forward(req, resp);
	 					 
	 				 }
	  
	  
	      }
}
