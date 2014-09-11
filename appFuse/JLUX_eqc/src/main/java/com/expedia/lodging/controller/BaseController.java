package com.expedia.lodging.controller;


import org.springframework.beans.factory.annotation.Autowired;

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
	
}
