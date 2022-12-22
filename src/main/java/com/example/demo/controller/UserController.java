package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DAO.UserDAO;
import com.example.demo.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("index")
	public String user() {
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String addUser(User user) {
		userdao.save(user);
		return "index.jsp";
	}
}
