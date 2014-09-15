package com.expedia.lodging.connectivity.service.interf;

import com.expedia.lodging.connectivity.entity.Pages;

public interface IPagesService {

	public Pages findPagesByPermalink(String link);
	
}
