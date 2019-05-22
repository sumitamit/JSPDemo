package com.springjsp.Jspdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.springjsp.Jspdemo.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
