package com.expedia.lodging.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expedia.lodging.repository.IContent;


@Controller
public class HomeController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public IContent content;

	
	@RequestMapping("/content/{home}")
	public String home(Map<String, Object> model,
			@RequestParam(value="localeID", required=false) 
			String localeID) {
		
		log.debug("single " + content.findByLocaleId(localeID));
		model.put("content", content.findByLocaleId(localeID));

		return "/content/home/index";
	}
	
	
	@RequestMapping("/content/connectivity")
	public String connectivity(Map<String, Object> model,
			@RequestParam(value="localeID", required=false) 
			String localeID) {
		
		log.debug("single " + content.findByLocaleId(localeID));
		model.put("content", content.findByLocaleId(localeID));

		return "/content/home/index";
	}
}
