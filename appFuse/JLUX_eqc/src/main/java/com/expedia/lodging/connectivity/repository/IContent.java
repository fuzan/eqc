package com.expedia.lodging.connectivity.repository;

import java.util.List;

import javax.persistence.NoResultException;

import com.expedia.lodging.connectivity.entity.LocaleContent;
import com.expedia.lodging.connectivity.entity.LocaleNavLink;

public interface IContent {
	
		public List<LocaleContent> findAll();
		
		public LocaleContent findByLocaleId(Integer localeID) throws NoResultException;
		
		
		public LocaleContent findByLocaleIdAndPageId(Integer localeId,Integer pageId) throws NoResultException;
	
		public List<LocaleNavLink> findAllNavLink();
		
		public LocaleNavLink findNavLinkByLocaleIdAndPageId(Integer localeId,Integer pageId) throws NoResultException;
		
}
