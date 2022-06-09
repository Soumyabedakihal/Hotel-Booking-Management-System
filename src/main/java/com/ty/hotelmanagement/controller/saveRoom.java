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

import com.ty.hotelmanagement.dto.Room;
import com.ty.hotelmanagement.service.RoomService;

@WebServlet(value="/rooms")
public class saveRoom extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		String type=req.getParameter("roomtype");
		String checkin=req.getParameter("checkin");
		String checkout=req.getParameter("checkout");
		double cost=Double.parseDouble(req.getParameter("cost"));
		
		Room room=new Room();
		room.setType(type);
		room.setCheckin(checkin);
		room.setCheckout(checkout);
		room.setCost(cost);
		
		List<Room> rooms=new ArrayList();
		rooms.add(room);
		
		
		RoomService roomService=new RoomService();
		Room room1=	roomService.saveRoom(room);
		
		if(room1!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("roomAddedSuccessfully.jsp");
			requestDispatcher.forward(req, resp);
		}
		else 
		{
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("createRoom.jsp");
			requestDispatcher.forward(req, resp);
		}
	
	}
}
