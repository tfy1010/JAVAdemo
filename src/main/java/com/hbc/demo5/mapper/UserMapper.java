package com.hbc.demo5.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.hbc.demo5.model.User;

@Component
public interface UserMapper {
	@Select("SELECT state,nickname FROM `days_user` where id ='${userId}'")
	 public User selectUser(@Param("userId")int userId);
	
	/**
     * ������û�
     * @param user
     * @return
     */
    public int insertUser(User user);
    
    /**
     * 获取用户列表
     * @return
     */
    public List<User> getList(@Param("userId") Integer userId);
	
}
