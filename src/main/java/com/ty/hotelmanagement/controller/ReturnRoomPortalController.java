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


@WebServlet(value = "/returnRoom")
public class ReturnRoomPortalController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String roomNo= req.getParameter("roomNo");
      String hotelId= req.getParameter("hotelId");
      
      int hid= Integer.parseInt(hotelId);
      int rid= Integer.parseInt(roomNo);
      
      HotelService hotelService=new HotelService();
      
      Hotel hotel=hotelService.getHotelById(hid);
      
     RoomService roomService=new RoomService();  
      List<Room> rooms=roomService.getAllRoom();
      for(Room r:rooms) {
    	  if(r.getRoom_no()==rid) {
    		  
    		  Room r1=roomService.getRoomById(rid);
    		  r1.setHotel(null);
    	
    		  List<Room> r2=new ArrayList();
              r2.add(r1);
              
              hotel.setRooms(r2);
              boolean a=hotelService.returnRoomByHotelId(hotel,r2);
              if(a==true) {
            	  RequestDispatcher requestDispatcher = req.getRequestDispatcher("roomReturned.jsp");
					requestDispatcher.forward(req, resp);
				 
              }else {
            	  RequestDispatcher requestDispatcher = req.getRequestDispatcher("roomReturnPortal.jsp");
					requestDispatcher.forward(req, resp);
				 
              }
         	
    	  }
      }
      
	}

}
