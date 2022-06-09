package com.ty.hotelmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hotelmanagement.dto.Room;

public class RoomDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("soumya");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public Room saveRoom(Room room) 
	{
		entityTransaction.begin();
		entityManager.persist(room);
		entityTransaction.commit();
		
		return room;

//	public List<Room> saveRooms(List<Room> rooms) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("soumya");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		for(Room room: rooms) 
//		{
//		entityTransaction.begin();
//		entityManager.persist(room);
//		entityTransaction.commit();
//		}
//		return rooms;
	}
	public List<Room> getAllRoom()
	{
		Query query=entityManager.createQuery("SELECT r from Room r");
		return query.getResultList();
	}
	public Room getRoomById(int room_no)
	{
		return entityManager.find(Room.class, room_no);
	}
	
}
