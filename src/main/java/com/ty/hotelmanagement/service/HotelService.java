package com.ty.hotelmanagement.service;

import java.util.List;

import com.ty.hotelmanagement.dao.HotelDao;
import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.dto.Room;

public class HotelService {

	HotelDao hotelDao = new HotelDao();

	public Hotel saveHotel(Hotel hotel) {
		return hotelDao.saveHotel(hotel);
	}

	public List<Hotel> getAllHotels() {
		return hotelDao.getAllHotels();
	}

	public Hotel getHotelById(int id) {

		return hotelDao.getHotelById(id);
	}

	public boolean issueRoomByHotel(Hotel hotel,List <Room> room)  {

		return hotelDao.issueRoomByHotel(hotel, room);

	}

	public boolean returnRoomByHotelId(Hotel hotel,List <Room> room) {
		return hotelDao.returnRoomByHotelId(hotel,room);
	}
}
