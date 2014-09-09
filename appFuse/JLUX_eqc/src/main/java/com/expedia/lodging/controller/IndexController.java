package com.expedia.lodging.controller;

import java.util.Date;
import java.util.List;
import java.util.Locale;
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
import com.expedia.lodging.service.interf.IContentLocaleService;
import com.expedia.lodging.util.Validation;


@RestController
public class IndexController {
	@Value("${application.message:Hello World}")
	private String message = "opi";
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public IContentLocaleService contentService;

	/**
	 * hard code for the navigation
	 * @return
	 */
	@RequestMapping("/")
	public String redirectToHome(){
		return "redirect:/hello/home";
	}
	
	
	@RequestMapping("/hello/{url}")
	public String methodNameTest(
			Map<String, Object> model,
			
			@RequestParam(value="locale", required=false) 
			String locale,
			
			@RequestParam(required=true)
			String url
			) {
		
		if(!Validation.notNullCheck(locale)){
			locale = Locale.US.getDisplayName();
		}
//		int localeID = 
//		LocaleContent list = content.findByLocaleId(localeID);
//		
//		
//		log.debug("single " + content.findByLocaleId(localeID));
//		
//		if(list!=null)
//			log.debug(list.toString());
//		
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
