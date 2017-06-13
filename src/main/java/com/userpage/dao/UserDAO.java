package com.userpage.dao;
import java.util.List;

import com.userpage.entity.User;
public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int UserId);
}
 