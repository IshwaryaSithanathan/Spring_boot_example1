package com.userpage.service;

import java.util.List;

import com.userpage.entity.User;

public interface UserService {
     List<User> getAllUsers();
     User getUserById(int UserId);
}
