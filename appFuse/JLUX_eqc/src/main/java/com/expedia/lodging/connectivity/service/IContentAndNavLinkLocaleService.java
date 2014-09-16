package com.expedia.lodging.connectivity.service;

import java.util.List;

import com.expedia.lodging.connectivity.entity.LocaleContent;
import com.expedia.lodging.connectivity.entity.LocaleNavLink;

public interface IContentAndNavLinkLocaleService {

	
	public List<LocaleContent> findAll();
	
	public LocaleContent findByLocaleId(Integer localeID);
	
	/**
	 * 
	 * @param localeID
	 * @param pageId
	 * @return
	 */
	public LocaleContent findByLocaleIdAndPageId(Integer localeID,Integer pageId);
	
	/**
	 * load nav link text
	 * @return
	 */
	public List<LocaleNavLink> findAllNavLinkText(); 
	
}