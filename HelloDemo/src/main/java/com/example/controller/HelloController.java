package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("greeting", "Hello, world");
		return "hello";
	}
}
