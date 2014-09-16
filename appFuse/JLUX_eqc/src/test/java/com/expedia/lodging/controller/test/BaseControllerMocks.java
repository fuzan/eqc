package com.expedia.lodging.controller.test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;

import com.expedia.lodging.connectivity.controller.HomeController;
import com.expedia.lodging.connectivity.localCache.ICache;
import com.expedia.lodging.connectivity.service.IContentAndNavLinkLocaleService;
import com.expedia.lodging.connectivity.service.ILocaleService;
import com.expedia.lodging.connectivity.service.IPagesService;

public class BaseControllerMocks {
	

	@Mock
	protected IContentAndNavLinkLocaleService contentService;
	
    @Mock
	protected ILocaleService localeService;
	
    @Mock
	protected IPagesService pages;

    @Mock
	protected ICache cache;
	
    @InjectMocks
    protected HomeController homeController;
	
    
    protected MockMvc mockMvc;


	public BaseControllerMocks() {
		
	}

    
}
