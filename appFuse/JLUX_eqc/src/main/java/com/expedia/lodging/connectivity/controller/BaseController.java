package com.expedia.lodging.connectivity.controller;


import org.springframework.beans.factory.annotation.Autowired;

import com.expedia.lodging.connectivity.localCache.ICache;
import com.expedia.lodging.connectivity.service.IContentAndNavLinkLocaleService;
import com.expedia.lodging.connectivity.service.ILocaleService;
import com.expedia.lodging.connectivity.service.IPagesService;

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
