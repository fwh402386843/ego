package com.ego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
	@Autowired

	@RequestMapping("/")
	public String tomain()throws Exception{
		return "index";
	}
	@RequestMapping("/{page}")
	public String showPage(String page) throws Exception{
		return page;
	}
	
	
}
