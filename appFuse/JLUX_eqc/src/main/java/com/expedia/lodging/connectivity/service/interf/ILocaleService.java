package com.expedia.lodging.connectivity.service.interf;

import java.util.List;
import java.util.Map;

import com.expedia.lodging.connectivity.entity.EQCLocale;

public interface ILocaleService {
	
	/**
	 * load name , code pair. Used for drop down select menu page view.
	 * example :
	 *     
	 *     <select value="en"> English </select>
	 *     <select value="Fr"> French/Français </select>
	 *     
	 * @return
	 */
	public abstract Map<String, String> loadLocaleNameAndCode();

	
	/**
	 * wrapper function for get the locale Id
	 * @param code
	 * @return
	 */
	public EQCLocale getLocalebyCode(String code);
	
	
	
	
	public List<EQCLocale> getLocales();
}