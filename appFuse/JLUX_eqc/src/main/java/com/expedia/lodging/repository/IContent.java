package com.expedia.lodging.repository;

import java.util.List;


import com.expedia.lodging.entity.LocaleContent;

public interface IContent {
	
		public List<LocaleContent> findAll();
		
		public LocaleContent findByLocaleId(int localeID);
		
		
		public LocaleContent findByLocaleIdAndPageId(int localeID,int pageId);
	
}
