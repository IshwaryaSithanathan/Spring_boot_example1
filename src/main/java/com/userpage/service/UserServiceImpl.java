package com.userpage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userpage.dao.UserDAO;
import com.userpage.entity.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO UserDAO;
	@Override
	public User getUserById(int UserId) {
		User obj = UserDAO.getUserById(UserId);
		return obj;
	}	
	@Override
	public List<User> getAllUsers(){
		return UserDAO.getAllUsers();
	}
}
