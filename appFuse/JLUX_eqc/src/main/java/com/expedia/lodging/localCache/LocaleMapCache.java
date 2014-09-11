package com.expedia.lodging.localCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expedia.lodging.entity.EQCLocale;
import com.expedia.lodging.repository.IEQCLocale;
import com.expedia.lodging.util.Validation;

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

	boolean loadFlag_localeCodeAndId = false;

	private List<EQCLocale> locales = new LinkedList<EQCLocale>();

	boolean loadFlag_locales = false;

	/* (non-Javadoc)
	 * @see com.expedia.lodging.localCache.ICache#getlocaleId(java.lang.String)
	 */
	public Integer getlocaleId(String localeCode) {
		if (Validation.notNullCheck(localeCode)
				&& localeCodeAndId.containsKey(localeCode))
			localeCodeAndId.get(localeCode);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.expedia.lodging.localCache.ICache#loadLocaleAndCode(java.util.Map)
	 */
	public Map<String, Integer> loadLocaleAndCode(Map<String, Integer> mapData) {
		if (!loadFlag_localeCodeAndId) {
			localeCodeAndId = mapData;
		}
		loadFlag_localeCodeAndId = true;
		return localeCodeAndId;
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
	 * @see com.expedia.lodging.localCache.ICache#load()
	 */
	public void load() {
		
		if( locales.size() == 0 ){
			List<EQCLocale> list = locale.findAll();
			loadLocales(list);
		}
	
	}

}
