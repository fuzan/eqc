package com.expedia.lodging.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.expedia.lodging.entity.Pages;
import com.expedia.lodging.repository.IPages;
import com.expedia.lodging.service.interf.IPagesService;
import com.expedia.lodging.util.Validation;

public class PagesService implements IPagesService {

	@Autowired
	IPages pages;

	public Pages findPagesByPermalink(String link) {
		if(Validation.notNullCheck(link))
			return pages.findByPermalink(link);
		return null;
	}
	

}
