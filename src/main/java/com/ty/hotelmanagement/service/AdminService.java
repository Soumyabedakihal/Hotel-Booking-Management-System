package com.ty.hotelmanagement.service;

import com.ty.hotelmanagement.dao.AdminDao;
import com.ty.hotelmanagement.dto.Admin;

public class AdminService {

	AdminDao adminDao = new AdminDao();
	public Admin saveAdmin(Admin admin)
	{
		return adminDao.saveAdmin(admin);	
	}
}
