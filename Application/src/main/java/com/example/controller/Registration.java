package com.example.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ResponseMessage;
import com.example.services.RegistrationService;

@RestController
public class Registration {
	private static final Logger log = LoggerFactory.getLogger(Registration.class);
	
	@Autowired
	RegistrationService registerService;
	
	@RequestMapping(method = RequestMethod.POST, value="/register", consumes = "application/json")
	public ResponseMessage register(@RequestBody HashMap<String, String> bodyRequest) {
		log.info("Register API is called");
		
		ResponseMessage response =  registerService.registerService(bodyRequest);
		
		return response;
	}

}
