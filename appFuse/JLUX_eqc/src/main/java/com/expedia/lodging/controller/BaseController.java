package com.expedia.lodging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.expedia.lodging.localCache.ICache;
import com.expedia.lodging.service.interf.IContentLocaleService;
import com.expedia.lodging.service.interf.ILocaleService;
import com.expedia.lodging.service.interf.IPagesService;

public abstract class BaseController {
	
	
	@Autowired
	protected IContentLocaleService contentService;
	
	@Autowired
	protected ILocaleService localeService;
	
	@Autowired
	protected IPagesService pages;
	
	@Autowired
	protected ICache cache;

	/**
	 * customized error handling
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
 
		ModelAndView model = new ModelAndView("error/error.jsp");
		return model;
 
	}
	
}
