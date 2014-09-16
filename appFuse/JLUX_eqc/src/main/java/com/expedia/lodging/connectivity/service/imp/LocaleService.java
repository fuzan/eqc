package com.expedia.lodging.connectivity.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.NoResultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.lodging.connectivity.entity.EQCLocale;
import com.expedia.lodging.connectivity.repository.IEQCLocale;
import com.expedia.lodging.connectivity.service.ILocaleService;
import com.expedia.lodging.connectivity.util.Validation;

@Service
public class LocaleService implements ILocaleService {
	
	@Autowired
	public IEQCLocale locale;
	
	
	private Logger log =  LoggerFactory.getLogger(this.getClass());

	/*
	 * Locale as a non-change entity, load these to cache when application start.
	 * (non-Javadoc)
	 * @see com.expedia.lodging.service.interf.ILocaleService#getLocaleIdbyCode(java.lang.String)
	 */
	public EQCLocale getLocalebyCode(String code){
		EQCLocale loc = null;
		if ( Validation.notNullCheck(code) ){
			try{
				loc = locale.findByLocaleCode(code);
			}catch(NoResultException ex){
				log.debug(ex.getMessage());
			}
			if( loc != null )
				return loc;
		} 
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see com.expedia.lodging.service.ILocaleService#loadLocaleNameAndCode()
	 */
	public Map<String,String> loadLocaleNameAndCode(){
		Map<String,String> localeNameAndCode = null;
		List<EQCLocale> list = locale.findAll();
		if( list != null && list.size() > 0 ){
			localeNameAndCode = new HashMap<String,String>();
			for( EQCLocale locale : list){
				localeNameAndCode.put(locale.getCode(), locale.getName());
			}
		}
		return localeNameAndCode;
	}


	public List<EQCLocale> getLocales() {
		// TODO Auto-generated method stub
		return locale.findAll();
	}
}