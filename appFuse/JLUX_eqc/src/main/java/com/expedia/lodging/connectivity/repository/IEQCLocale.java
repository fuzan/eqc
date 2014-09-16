package com.expedia.lodging.connectivity.repository;

import java.util.List;

import javax.persistence.NoResultException;

import com.expedia.lodging.connectivity.entity.EQCLocale;


public interface IEQCLocale {
	
	
	List<EQCLocale> findAll();
	
	
	EQCLocale findByLocaleCode(String code) throws NoResultException;
	
}
