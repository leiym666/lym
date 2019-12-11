package com.qdgx.dmp.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qdgx.dmp.comm.ResponseData;
import com.qdgx.dmp.test.client.IUserServiceClient;
import com.qdgx.dmp.test.dao.IUserDao;
import com.qdgx.dmp.test.dao.IUserTestDao;
import com.qdgx.dmp.test.entity.User;
import com.qdgx.dmp.test.mapper.UserMapper;
import com.qdgx.dmp.test.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private IUserServiceClient userServiceClient;
	
	@Autowired
    private IUserTestDao userTestDao;

	@Transactional(readOnly = true)
	@Override
	public User findUserById(Long id) {
		return userDao.findUserById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}

	@Override
	public int insertUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public int replaceUser(User user) throws Exception {
		return userDao.replaceUser(user);
	}

	@Override
	public User getUserById(Integer id) {
		return userMapper.findUserById(id);
	}

	@Override
	public List<User> findUserByAge(Integer age) {
		return userTestDao.findUserByAge(age);
	}

	@Override
	public User saveJPA(User user) {
		return userTestDao.save(user);
	}

	@Override
	public ResponseData sysAddType(String json) {
		return userServiceClient.sysAddType(json);
	}
	
	@Override
	public ResponseData findMenuByRoles() {
		return userServiceClient.findMenuByRoles();
	}

	@Override
	public ResponseData login(String json) {
		return userServiceClient.login(json);
	}
	
	@Override
	public ResponseData getTypeById(String id) {
		return userServiceClient.getTypeById(id);
	}
}
