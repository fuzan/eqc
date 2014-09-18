package com.expedia.lodging.connectivity.localCache;

import java.util.List;



//@Bean
//@Singleton


import com.expedia.lodging.connectivity.entity.EQCLocale;
import com.expedia.lodging.connectivity.entity.LocaleNavLink;

public interface ICache {

	public Integer getlocaleId(String localeCode);

	/**
	 * load the locales into list, it is a singleton list.
	 */
	public List<EQCLocale> loadLocales(List<EQCLocale> localesData);

	public void load();
	
	
	public List<EQCLocale> getLocaleCache();

	
	public List<LocaleNavLink> findAllNavLinkTextByLocaleId(Integer localeId);
}