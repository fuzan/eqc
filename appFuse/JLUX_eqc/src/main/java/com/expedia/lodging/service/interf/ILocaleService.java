package com.expedia.lodging.service.interf;

import java.util.Map;

public interface ILocaleService {

	/**
	 * load id , code pair, for url navigation
	 * if receive any url like 
	 *     /home/con?locale=fr
	 *     then go to the map search the locale id, then use that id retrive the locale content.
	 *     
	 * @return
	 */
	public abstract Map<String, Integer> loadLocaleIdAndCode();

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

}