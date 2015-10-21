package com.hbc.demo5.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbc.demo5.mapper.UserMapper;
import com.hbc.demo5.model.User;
import com.hbc.demo5.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public int insertUser(User user) {		
		
		return userMapper.insertUser(user);
		// TODO Auto-generated method stub
		
	}

	public User UserMapper(int userId) {
		// TODO Auto-generated method stub
		User user = userMapper.selectUser(userId);
		
		return user;
	}

	@Override
	public List<User> getList(int userId) {
		// TODO Auto-generated method stub
		
		
		return userMapper.getList(userId);
	}

}
