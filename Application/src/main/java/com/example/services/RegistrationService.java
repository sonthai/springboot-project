package com.example.services;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ResponseMessage;
import com.example.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RegistrationService {
	private static final Logger log = LoggerFactory.getLogger(RegistrationService.class);
	
	@Autowired
	User user;
	
	@Autowired
	ResponseMessage response;
	
	
	
	public ResponseMessage registerService(HashMap<String, String> data) {
		log.info("Registration service is called");
		ObjectMapper mapper = new ObjectMapper();
		User u = mapper.convertValue(data, User.class);
		
		response.setResponseCode(0);
		response.setResponseMsg("Register successfully");
		
		return response;
		
	}
}
