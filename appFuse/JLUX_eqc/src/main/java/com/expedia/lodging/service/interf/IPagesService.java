package com.expedia.lodging.service.interf;

import com.expedia.lodging.entity.Pages;

public interface IPagesService {

	public Pages findPagesByPermalink(String link);
	
}
