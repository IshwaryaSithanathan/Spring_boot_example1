package com.userpage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.userpage.entity.User;
@Transactional
@Repository
public class UserDAOImpl implements UserDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public User getUserById(int UserId) {
		return entityManager.find(User.class, UserId);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "FROM User as user ORDER BY user.userId";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}	
}
