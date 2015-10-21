package com.hbc.demo5.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hbc.demo5.model.User;

public interface UserService {
	public int insertUser(User user);
	public User UserMapper(int userId);
	
	
	public List<User> getList(int userId);
}
