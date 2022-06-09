package com.ty.hotelmanagement.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.dto.Room;
import com.ty.hotelmanagement.service.HotelService;
import com.ty.hotelmanagement.service.RoomService;

@WebServlet(value = "/bookhotel")
public class BookHotelController extends HttpServlet{
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String hotelId=req.getParameter("hotelId");
   String roomNo=req.getParameter("roomNo");
       
   int hid= Integer.parseInt(hotelId);
   int rno= Integer.parseInt(roomNo);
   
   HotelService hotelService=new HotelService();
   Hotel hotel=hotelService.getHotelById(hid);
   
   RoomService roomService=new RoomService();  
   List<Room> room=roomService.getAllRoom();
  
   for(Room r:room) {
	   if(r.getRoom_no()==rno) {
		 
		   Room r1=roomService.getRoomById(rno);
		  r1.setHotel(hotel);
		  
		  List<Room> r2=new ArrayList();
		  r2.add(r1);
		  
		  hotel.setRooms(r2);
		  boolean a=hotelService.issueRoomByHotel(hotel, r2);
		  if(a==true) {
			  RequestDispatcher requestDispatcher=req.getRequestDispatcher("roombookedSuccessfully.jsp");
		      requestDispatcher.forward(req, resp);
		  
		  }else {
			  System.out.println("room not booked");
			   RequestDispatcher requestDispatcher=req.getRequestDispatcher("roombookingPortal.jsp");
				requestDispatcher.forward(req, resp);
		  }
	   }
    }
  }

}
