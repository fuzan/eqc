package com.expedia.lodging.repository;

import java.util.List;

import com.expedia.lodging.entity.EQCLocale;


public interface IEQCLocale {
	
	
	List<EQCLocale> findAll();
	
	
	EQCLocale findByLocaleCode(String code);
	
}
