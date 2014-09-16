package com.expedia.lodging.connectivity.service;

import com.expedia.lodging.connectivity.entity.Pages;

public interface IPagesService {

	public Pages findPagesByPermalink(String link);
	
}
