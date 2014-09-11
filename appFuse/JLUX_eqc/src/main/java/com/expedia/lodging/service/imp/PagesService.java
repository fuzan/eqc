package com.expedia.lodging.service.imp;

import javax.persistence.NoResultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.lodging.entity.Pages;
import com.expedia.lodging.repository.IPages;
import com.expedia.lodging.service.interf.IPagesService;
import com.expedia.lodging.util.Validation;


@Service
public class PagesService implements IPagesService {

	@Autowired
	IPages pages;

	private Logger log =  LoggerFactory.getLogger(this.getClass());
	
	public Pages findPagesByPermalink(String link) {
		if(Validation.notNullCheck(link)){
			try{
				return pages.findByPermalink(link);
			}catch(NoResultException ex){
				log.debug(ex.getMessage());
				return null;
			}
		}
		return null;
	}
	

}
