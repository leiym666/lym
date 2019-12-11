package com.qdgx.dmp.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qdgx.dmp.test.entity.User;

public interface IUserTestDao extends JpaRepository<User, Integer>{
	
	 public List<User> findUserByAge(Integer age);
}
