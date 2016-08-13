package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Users;

@RestController
public class Registration {
	private static final Logger log = LoggerFactory.getLogger(Registration.class);
	
	@Autowired
	Users user;
	
	@RequestMapping(method = RequestMethod.POST, value="/register", consumes = "application/json")
	public HashMap<String, Users> register(@RequestBody HashMap<String, String> bodyRequest) {
		HashMap<String, Users> maps = new HashMap<String, Users>();
		user.setUsername(bodyRequest.get("username"));
		user.setPassword(bodyRequest.get("password"));
		user.setFullname(bodyRequest.get("fullname"));
		System.out.println("Hello, world");
		maps.put(user.getUsername(), user);
		return maps;
	}

}
