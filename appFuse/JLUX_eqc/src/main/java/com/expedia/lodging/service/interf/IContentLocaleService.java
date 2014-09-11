package com.expedia.lodging.service.interf;

import java.util.List;

import com.expedia.lodging.entity.LocaleContent;

public interface IContentLocaleService {

	
	public List<LocaleContent> findAll();
	
	public LocaleContent findByLocaleId(Integer localeID);
	
	
	public LocaleContent findByLocaleIdAndPageId(int localeID,Integer pageId);
	
}