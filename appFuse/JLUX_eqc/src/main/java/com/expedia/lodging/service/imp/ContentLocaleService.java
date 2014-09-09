package com.expedia.lodging.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.expedia.lodging.entity.LocaleContent;
import com.expedia.lodging.repository.IContent;
import com.expedia.lodging.service.interf.IContentLocaleService;

public class ContentLocaleService implements IContentLocaleService {

	@Autowired
	public IContent content;
	
	
	public List<LocaleContent> findAll(){
		return content.findAll();
	}
	
	public LocaleContent findByLocaleId(int localeID){
		return content.findByLocaleId(localeID);
	}
	
	
	public LocaleContent findByLocaleIdAndPageId(int localeID,int pageId){
		return content.findByLocaleIdAndPageId(localeID, pageId);
	}

}
