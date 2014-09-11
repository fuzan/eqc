package com.expedia.lodging.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.expedia.lodging.localCache.ICache;




public class LocaleMappingLoadService implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	ICache cache;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		long start = System.currentTimeMillis();
		log.debug(" Init the locale map begin ");
		cache.load();
		long elapse = System.currentTimeMillis() - start; 
		log.debug(" Init the locale map end, time consuming : " + (elapse) + " ms");
		log.debug("Locale list contains : " + cache.getLocaleCache().size() + " records");
	}

}