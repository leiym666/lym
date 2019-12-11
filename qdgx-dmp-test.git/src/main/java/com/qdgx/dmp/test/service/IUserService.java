package com.qdgx.dmp.test.service;

import java.util.List;

import com.qdgx.dmp.comm.ResponseData;
import com.qdgx.dmp.test.entity.User;

public interface IUserService {
	User findUserById(Long id);

	List<User> findAllUsers();

	int insertUser(User user);

	int addUser(User user);

	int replaceUser(User user) throws Exception;
	
	public User getUserById(Integer id);
	
	public List<User> findUserByAge(Integer age);
	
	public  User saveJPA(User reqUser);
	
	public ResponseData sysAddType(String json);
	
	public ResponseData findMenuByRoles();
	
	public ResponseData login(String json);
	
	public ResponseData getTypeById(String id);
}
