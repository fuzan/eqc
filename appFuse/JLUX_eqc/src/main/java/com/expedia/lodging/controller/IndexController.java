package com.expedia.lodging.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expedia.lodging.entity.LocaleContent;
import com.expedia.lodging.repository.IContent;


@RestController
public class IndexController {
	@Value("${application.message:Hello World}")
	private String message = "opi";
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public IContent content;

	
	@RequestMapping("/hello")
	public String methodNameTest(Map<String, Object> model,
			@RequestParam(value="localeID", required=false) 
			String localeID) {
		model.put("time", new Date());
		model.put("message", this.message);
		
		List<LocaleContent> list = content.findAll();
		
		log.debug("list size is :"+list.size());
		
		log.debug("single " + content.findByLocaleId(localeID));
		
		if(list!=null)
			log.debug(list.toString());
		
		return "index";
	}
	
	
	@RequestMapping(value= "/test", method = RequestMethod.GET)
	public String test(Map<String, Object> model,
			@RequestParam(value="txtEmail", required=false) 
			String name){
		System.out.println(name);
		return "test_second_level/test";
	}

}
