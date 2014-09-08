package com.expedia.lodging.service.interf;

import java.util.List;

import com.expedia.lodging.entity.LocaleContent;

public interface IContentLocaleService {

	
	public List<LocaleContent> findAll();
	
	public LocaleContent findByLocaleId(int localeID);
	
	
	public LocaleContent findByLocaleIdAndPageId(int localeID,int pageId);
	
}