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
import javax.servlet.http.HttpSession;

import com.ty.hotelmanagement.dto.Room;
import com.ty.hotelmanagement.service.RoomService;


@WebServlet(value = "/addRooms")
public class  AddRoomInHotel extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String type=req.getParameter("type");
		String checkin=req.getParameter("checkin");
		String checkout=req.getParameter("checkout");
		//double cost=Double.parseDouble(req.getParameter("cost"));
//		int cost1= Integer.parseInt( req.getParameter("cost"))  ;
		Room room=new Room();
		room.setType(type);
		room.setCheckin(checkin);
		room.setCheckout(checkout);
//		room.setCost(cost1);
		
		List<Room> rooms=new ArrayList();
		rooms.add(room);
		
		RoomService roomService=new RoomService();
		List<Room> r=roomService.saveRooms(rooms);
		
		if(r!=null) 
		{
			HttpSession httpSession=req.getSession();
			httpSession.setAttribute("room", "addRoom");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("roomAddedSuccessfully.jsp");
			requestDispatcher.forward(req, resp);
		}
		else 
		{
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("addRoom.jsp");
			requestDispatcher.forward(req, resp);
		}
	}	
}

