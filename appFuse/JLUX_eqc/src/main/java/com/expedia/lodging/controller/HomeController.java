package com.expedia.lodging.controller;

import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expedia.lodging.entity.LocaleContent;
import com.expedia.lodging.entity.Pages;
import com.expedia.lodging.util.Validation;


@Controller
public class HomeController extends BaseController{
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/content/{url}")
	public String home(Map<String, Object> model,
			
			@RequestParam(value="localeCode", required=false) 
			String localeCode,
			@PathVariable 
			String url
			
			) {
		
		log.debug("url mapping " + url);
		
		if(Validation.nullCheck(localeCode)){
			localeCode = Locale.US.getDisplayName();
		}

		log.debug("locale id is " + localeCode);
		
		Pages p = pages.findPagesByPermalink(url);
		int localeId = localeService.getLocaleIdbyCode(localeCode);
		LocaleContent lc = contentService.findByLocaleIdAndPageId(localeId, p.getId());
		
		log.debug(" locale content loaded, title " + lc.getTitle() + ", and id :" + lc.getId());
		
		model.put("title", lc.getTitle() );
		model.put("content", lc.getContent());

		return "/content/home/index";
	}
	
}
