package com.qdgx.dmp.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.qdgx.dmp.test.dao.IUserDao;
import com.qdgx.dmp.test.entity.User;
@Component
public class UserDaoImpl implements IUserDao {

	/**
	 * 通过@Resource注解引入JdbcTemplate对象。
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User findUserById(Long id) {
		// 1. 定义一个sql语句
		String querySQL = "select * from dmp_user where id = ?";

		// 2. 定义一个RowMapper
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

		// 3. 执行查询方法

		// List<User> list = jdbcTemplate.query("select * from account where id
		// = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));

		User user = jdbcTemplate.queryForObject(querySQL, new Object[] { id }, rowMapper);

		return user;
	}

	@Override
	public List<User> findAllUsers() {
		// 1. 定义一个sql语句
		String querySQL = "select * from dmp_user";

		// 2. 定义一个RowMapper
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

		// 3. 执行查询方法
		List<User> users = jdbcTemplate.query(querySQL, new Object[] {}, rowMapper);

		return users;
	}

	@Override
	public int insertUser(User user) {
		// 1. 定义一个sql语句
		String execSQL = "INSERT into dmp_user (username, name, age, balance) values (?, ?, ?, ?)";

		// 2. 执行查询方法
		int result = jdbcTemplate.update(execSQL,
				new Object[] { user.getUsername(), user.getName(), user.getAge(), user.getBalance() });

		return result;
	}

	@Override
	public int addUser(User user) {
		// 1. 定义一个sql语句
		String execSQL = "INSERT into dmp_user (username, name, age, balance) values (?, ?, ?, ?)";

		// 2. 执行查询方法
		int result = jdbcTemplate.update(execSQL,
				new Object[] { user.getUsername(), user.getName(), user.getAge(), user.getBalance() });

		return result;
	}

	@Override
	public int replaceUser(User user) {
		// 1. 定义一个sql语句
		String execSQL = "INSERT into dmp_user (username, name, age, balance) values (?, ?, ?, ?)";

		// 2. 执行查询方法
		int result = jdbcTemplate.update(execSQL,
				new Object[] { user.getUsername(), user.getName(), user.getAge(), user.getBalance() });

		return result;
	}

}
