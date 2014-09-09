package com.expedia.lodging.localCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.expedia.lodging.entity.EQCLocale;
import com.expedia.lodging.service.interf.ILocaleService;
import com.expedia.lodging.util.Validation;


/**
 * use for caching the locale information pair.
 * @author zafu
 *
 */
public class LocaleMapCache {
	
	       @Autowired
	static ILocaleService localeService;

	private static Map<String,Integer> localeCodeAndId = new HashMap<String,Integer>();
	
	static boolean loadFlag_localeCodeAndId = false;
	
	private static List<EQCLocale> locales = new LinkedList<EQCLocale>();
	
	static boolean loadFlag_locales = false;

    public static Integer getlocaleId(String localeCode){
    	if( Validation.notNullCheck(localeCode) && localeCodeAndId.containsKey(localeCode) )
    		localeCodeAndId.get(localeCode);
    	return null;
    }
    
    /**
     * load the locale id and code into map, can be access by same folder classes, it is a singleton map.
     */
    public static Map<String,Integer> loadLocaleAndCode(Map<String, Integer> mapData){
    	if(!loadFlag_localeCodeAndId){
    		localeCodeAndId = mapData;
    	}
    	loadFlag_localeCodeAndId = true;
    	return localeCodeAndId;
    }
	
    /**
     * load the locales into list, it is a singleton list.
     */
    public static List<EQCLocale> loadLocales(List<EQCLocale> localesData){
    	if( !loadFlag_locales )
    		locales = localesData;
    	loadFlag_locales = true;
    	return locales;
    }
    
    public static void load(){
    	List<EQCLocale> list = localeService.getLocales();
    	loadLocales(list);
    }
    
}
