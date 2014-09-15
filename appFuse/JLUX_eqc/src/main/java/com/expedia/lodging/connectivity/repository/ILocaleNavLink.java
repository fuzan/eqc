package com.expedia.lodging.connectivity.repository;

import java.util.List;

import com.expedia.lodging.connectivity.entity.LocaleNavLink;

public interface ILocaleNavLink {
	List<LocaleNavLink> findAll();
	
	LocaleNavLink findByPageIdAndLocaleId(Integer pageId,Integer localeId);
	
}
