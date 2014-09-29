package com.expedia.lodging.connectivity.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expedia.lodging.connectivity.DTO.LeftNavMenu;
import com.expedia.lodging.connectivity.DTO.ListLeftMenu;
import com.expedia.lodging.connectivity.entity.EQCLocale;
import com.expedia.lodging.connectivity.entity.LocaleContent;
import com.expedia.lodging.connectivity.entity.LocaleNavLink;
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
		
		// p equals Null means user passes an invilad url
		// localeId cannot be Null, because we handle that from the cache.
		if( p == null ){
			return view;
		}
		
		LocaleContent lc = contentService.findByLocaleIdAndPageId(localeId, p.getId());
		List<EQCLocale> locales = localeService.getLocales();
		
		List<LocaleNavLink> navs = contentService.findAllNavLinkTextByLocaleId(localeId);
		
		if( lc != null ){
			log.debug(" locale content loaded, title " + lc.getTitle() + ", and id :" + lc.getId());
			model.put("title", lc.getTitle() );// title show on the top
			model.put("content", lc.getContent());// content show in the body
			model.put("locales", locales); // the locale select drop down menu.
			model.put("leftMenu", navs);
		}
		return view;
	}
	
	
	@RequestMapping("/test")
	public String testUrl(){
		testNav.getData();
		
		
		LeftNavMenu l = new LeftNavMenu();
		l.setName("mkyong");
		l.setAge(30);
		
		
		LeftNavMenu l1 = new LeftNavMenu();
		l1.setName("mkyong1");
		l1.setAge(31);
		
		List<LeftNavMenu> llm = new ArrayList<LeftNavMenu>();
		llm.add(l);
		llm.add(l1);
		
		ListLeftMenu lm = new ListLeftMenu();
		lm.setList(llm);
		
		testNav.setDate(lm);
		
		
		return null;
	}
	
	
}





