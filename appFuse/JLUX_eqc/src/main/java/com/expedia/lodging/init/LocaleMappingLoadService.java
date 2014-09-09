package com.expedia.lodging.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;



public class LocaleMappingLoadService  implements ApplicationListener<ContextRefreshedEvent>{


	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		long start = System.currentTimeMillis();
		log.debug(" Init the locale map begin ");
		//LocaleMapCache.load();
		long elapse = System.currentTimeMillis() - start; 
		log.debug(" Init the locale map end, time consuming : " + (elapse) + " ms");
	}

}