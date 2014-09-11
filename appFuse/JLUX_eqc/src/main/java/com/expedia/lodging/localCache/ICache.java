package com.expedia.lodging.localCache;

import java.util.List;



//@Bean
//@Singleton
import com.expedia.lodging.entity.EQCLocale;

public interface ICache {

	public Integer getlocaleId(String localeCode);

	/**
	 * load the locales into list, it is a singleton list.
	 */
	public List<EQCLocale> loadLocales(List<EQCLocale> localesData);

	public void load();
	
	
	public List<EQCLocale> getLocaleCache();

}