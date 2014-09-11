package com.expedia.lodging.repository;

import java.util.List;

import javax.persistence.NoResultException;

import com.expedia.lodging.entity.LocaleContent;

public interface IContent {
	
		public List<LocaleContent> findAll();
		
		public LocaleContent findByLocaleId(int localeID) throws NoResultException;
		
		
		public LocaleContent findByLocaleIdAndPageId(int localeID,int pageId) throws NoResultException;
	
}
