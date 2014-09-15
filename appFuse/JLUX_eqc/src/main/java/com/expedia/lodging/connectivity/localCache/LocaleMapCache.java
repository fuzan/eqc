package com.expedia.lodging.connectivity.localCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.lodging.connectivity.entity.EQCLocale;
import com.expedia.lodging.connectivity.repository.IEQCLocale;
import com.expedia.lodging.connectivity.util.Validation;

/**
 * use for caching the locale information pair.
 * 
 * @author zafu
 *
 */
@Service
public class LocaleMapCache implements ICache {

	@Autowired
	public IEQCLocale locale;
	
	private Map<String, Integer> localeCodeAndId = new HashMap<String, Integer>();

	private List<EQCLocale> locales = new LinkedList<EQCLocale>();

	boolean loadFlag_locales = false;

	/* (non-Javadoc)
	 * @see com.expedia.lodging.localCache.ICache#getlocaleId(java.lang.String)
	 */
	public Integer getlocaleId(String localeCode) {
		if (Validation.notNullCheck(localeCode)
				&& localeCodeAndId.containsKey(localeCode))
			return localeCodeAndId.get(localeCode);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.expedia.lodging.localCache.ICache#loadLocales(java.util.List)
	 */
	public List<EQCLocale> loadLocales(List<EQCLocale> localesData) {
		if (!loadFlag_locales)
			locales = localesData;
		loadFlag_locales = true;
		return locales;
	}

	/* (non-Javadoc)
	 * 
	 * load localeId , localeCode pair, 
	 * if receive any url like 
	 *     /home/con?locale=fr
	 *     then go to the map search the locale id, then use that id retrive the locale content.
	 * 
	 * @see com.expedia.lodging.localCache.ICache#load()
	 */
	public void load() {
		
		if( locales.size() == 0 ){
			List<EQCLocale> list = locale.findAll();
			loadLocales(list);
			// Load to Map
			for(EQCLocale temp_EQClocale : list){
				localeCodeAndId.put(temp_EQClocale.getCode(), temp_EQClocale.getId());
			}
		}
	
	}
	
	public List<EQCLocale> getLocaleCache(){
		return this.locales;
	}

}
