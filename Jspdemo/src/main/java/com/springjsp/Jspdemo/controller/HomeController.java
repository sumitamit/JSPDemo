package com.springjsp.Jspdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springjsp.Jspdemo.dao.UserDao;
import com.springjsp.Jspdemo.model.User;

@Controller
public class HomeController {

	@Autowired
	UserDao repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAllien(User user) {
		repo.save(user);
		return "home.jsp";
	}
    
	@RequestMapping("/user/{id}")
	@ResponseBody
	public Optional<User> getAlien(@PathVariable("id") int id) {
		
        return repo.findById(id);
	}
}
