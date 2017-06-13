package com.userpage.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.userpage.entity.User;
import com.userpage.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
		User User = userService.getUserById(id);
		return new ResponseEntity<User>(User, HttpStatus.OK);
	}
	@GetMapping("users")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> list = userService.getAllUsers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}	
} 