package com.expedia.lodging.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.expedia.lodging.entity.EQCLocale;
import com.expedia.lodging.repository.IEQCLocale;
import com.expedia.lodging.service.interf.ILocaleService;

public class LocaleService implements ILocaleService {
	
	@Autowired
	public IEQCLocale locale;
	
	/* (non-Javadoc)
	 * @see com.expedia.lodging.service.ILocaleService#loadLocaleIdAndCode()
	 */
	public Map<String,Integer> loadLocaleIdAndCode(){
		Map<String,Integer> localeIdAndCode = null;
		List<EQCLocale> list = locale.findAll();
		if( list != null && list.size() > 0 ){
			localeIdAndCode = new HashMap<String,Integer>();
			for( EQCLocale locale : list){
				localeIdAndCode.put(locale.getCode(), locale.getId());
			}
		}
		
		return localeIdAndCode;
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
	
}
