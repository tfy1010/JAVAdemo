package com.hbc.demo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hbc.demo5.model.User;
import com.hbc.demo5.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value ="",method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getUserList(HttpServletRequest request, HttpServletResponse response) {
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0); 
		
		System.out.println(userId);
		
		
		
		List<User> users = userService.getList(userId);
//		
//
		return new ModelAndView("userList").addObject("userList", users);
		
		
//		return "ddd";
//		return "ddd";
//		return "ddd";
	}
}
