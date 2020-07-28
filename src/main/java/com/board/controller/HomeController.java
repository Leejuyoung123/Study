package com.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/sample/contact", method = RequestMethod.GET)
	public String contact(Locale locale, Model model) {
		
		return "sample/contact";
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/sample/post", method = RequestMethod.GET)
	public String post(Locale locale, Model model) {
		
		return "sample/post";
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/sample/about", method = RequestMethod.GET)
	public String about(Locale locale, Model model) {
		
		return "sample/about";
	}
	/** 
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/sample/index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		
		return "sample/index";
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
}
