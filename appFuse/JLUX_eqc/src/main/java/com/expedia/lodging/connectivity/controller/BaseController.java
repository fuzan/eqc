package com.expedia.lodging.connectivity.controller;


import org.springframework.beans.factory.annotation.Autowired;

import com.expedia.lodging.connectivity.localCache.ICache;
import com.expedia.lodging.connectivity.service.interf.IContentAndNavLinkLocaleService;
import com.expedia.lodging.connectivity.service.interf.ILocaleService;
import com.expedia.lodging.connectivity.service.interf.IPagesService;

public abstract class BaseController {
	
	
	@Autowired
	protected IContentAndNavLinkLocaleService contentService;
	
	@Autowired
	protected ILocaleService localeService;
	
	@Autowired
	protected IPagesService pages;
	
	
	
	@Autowired
	protected ICache cache;
	
}
