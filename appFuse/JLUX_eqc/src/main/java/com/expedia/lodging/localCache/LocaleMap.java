package com.expedia.lodging.localCache;

import java.util.HashMap;
import java.util.Map;


/**
 * use for caching the locale information pair.
 * @author zafu
 *
 */
public class LocaleMap {
	

	private static Map<String,Integer> localeCodeAndId = new HashMap<String,Integer>();
	

    public static Map<String,Integer> localeCodeAndIdMap(){
    	
    	return localeCodeAndId;
    }
    
    /**
     * load the locale id and code into map, can be access by same folder classes, it is a singleton map.
     */
    public static Map<String,Integer> loadLocaleAndCode(Map<String, Integer> mapData){
    	if( localeCodeAndId.size() > 0 )
    		return localeCodeAndId;
    	else
    		localeCodeAndId = mapData;
    	return localeCodeAndId;
    }
	
}
