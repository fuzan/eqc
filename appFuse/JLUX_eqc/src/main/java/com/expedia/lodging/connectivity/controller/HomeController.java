package com.expedia.lodging.connectivity.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expedia.lodging.connectivity.entity.EQCLocale;
import com.expedia.lodging.connectivity.entity.LocaleContent;
import com.expedia.lodging.connectivity.entity.Pages;
import com.expedia.lodging.connectivity.util.Validation;


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
		String view = "/content/home/index";
		log.debug("url mapping " + url);
		
		if(Validation.nullCheck(localeCode))
			localeCode = Locale.US.getLanguage();
		
		log.debug("locale id is " + localeCode);
		Pages p = pages.findPagesByPermalink(url);
		Integer localeId = cache.getlocaleId(localeCode);
		
		if(p == null && localeId == null ){
			return view;
		}
		
		
		LocaleContent lc = contentService.findByLocaleIdAndPageId(localeId, p.getId());
		List<EQCLocale> locales = localeService.getLocales();
		
		if( lc != null ){
			log.debug(" locale content loaded, title " + lc.getTitle() + ", and id :" + lc.getId());
			model.put("title", lc.getTitle() );
			model.put("content", lc.getContent());
			model.put("locales", locales);
		}
		return view;
	}
	
	
}
