package com.expedia.lodging.service.imp;

import java.util.List;

import javax.persistence.NoResultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.lodging.entity.LocaleContent;
import com.expedia.lodging.repository.IContent;
import com.expedia.lodging.service.interf.IContentLocaleService;


@Service
public class ContentLocaleService implements IContentLocaleService {

	@Autowired
	public IContent content;
	
	private Logger log =  LoggerFactory.getLogger(this.getClass());
	
	public List<LocaleContent> findAll(){
		return content.findAll();
	}
	
	public LocaleContent findByLocaleId(Integer localeID){
		try{
			return content.findByLocaleId(localeID);
		}catch(NoResultException ex){
			log.debug(ex.getMessage());
			return null;
		}
	}
	
	
	public LocaleContent findByLocaleIdAndPageId(int localeID,Integer pageId){
		try{
			return content.findByLocaleIdAndPageId(localeID, pageId);
		}catch(NoResultException ex){
			log.debug(ex.getMessage());
			return null;
		}
	}

}
