package com.hubezoo.frontendpro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "reglogin";
	}

}
