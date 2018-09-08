package com.mall.admin.main.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.shop.HomeController;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
//	@RequestMapping(value="login")
//	public String login(Locale locale, Model model) {
//	    logger.info("Admin login page!");
//		
//		return "/admin/login";
//	}
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
	    logger.info("Welcome Admin!");
		
		return "/admin/index";
	}

}
