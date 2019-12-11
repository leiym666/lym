package com.qdgx.dmp.test.dao;

import java.util.List;

import com.qdgx.dmp.test.entity.User;

public interface IUserDao {
	User findUserById(Long id);

	List<User> findAllUsers();

	int insertUser(User user);

	int addUser(User user);

	int replaceUser(User user);
}
