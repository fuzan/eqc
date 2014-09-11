package com.expedia.lodging.localCache;

import java.util.List;
import java.util.Map;

import com.expedia.lodging.entity.EQCLocale;

public interface ICache {

	public abstract Integer getlocaleId(String localeCode);

	/**
	 * load the locale id and code into map, can be access by same folder
	 * classes, it is a singleton map.
	 */
	public abstract Map<String, Integer> loadLocaleAndCode(
			Map<String, Integer> mapData);

	/**
	 * load the locales into list, it is a singleton list.
	 */
	public abstract List<EQCLocale> loadLocales(List<EQCLocale> localesData);

	public abstract void load();

}