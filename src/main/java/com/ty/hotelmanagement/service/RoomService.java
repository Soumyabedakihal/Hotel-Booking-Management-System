package com.ty.hotelmanagement.service;

import java.util.List;

import com.ty.hotelmanagement.dao.RoomDao;
import com.ty.hotelmanagement.dto.Room;

public class RoomService {

	RoomDao roomDao=new RoomDao();
	public Room saveRoom(Room room)
	{
	return roomDao.saveRoom(room);
	}
	public List<Room> getAllRoom()
	{
		return roomDao.getAllRoom();	
	}
	public Room getRoomById(int room_no)
	{
		return roomDao.getRoomById(room_no);
	}
}
