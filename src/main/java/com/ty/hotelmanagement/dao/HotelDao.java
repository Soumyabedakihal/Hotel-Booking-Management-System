package com.ty.hotelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hotelmanagement.dto.Hotel;
import com.ty.hotelmanagement.dto.Room;


public class HotelDao {


	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("soumya");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	

	public Hotel saveHotel(Hotel hotel) 
	{
		entityTransaction.begin();
		entityManager.persist(hotel);
		entityTransaction.commit();
		return hotel;
	}
	
	public List<Hotel> getAllHotels()
	{
		Query query=entityManager.createQuery("SELECT h from Hotel h");
		return query.getResultList();
	}
	
	public Hotel getHotelById(int id)
	{
		return entityManager.find(Hotel.class, id);
	}
	public boolean issueRoomByHotel(Hotel hotel,List <Room> room) {
		for(Room r:room) {
			if(hotel!=null && r!=null) {  
				entityTransaction.begin();
				entityManager.merge(hotel);
				entityManager.merge(r);
				entityTransaction.commit();
		        
			}
		return true;	       
		}
		return false;
		}
	
	public boolean returnRoomByHotelId(Hotel hotel,List <Room> room) {
		for(Room r: room) {
			if(r!=null && hotel!=null) {
				
			entityTransaction.begin();
			entityManager.merge(r);
			entityManager.merge(hotel);
			entityTransaction.commit();
				System.out.println("person vacated and returned or again room available");
			} 
		return true;
	} 
	         return false;
	
	}
	
}
