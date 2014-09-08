package com.expedia.lodging.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class LocaleMappingLoadService  implements ApplicationListener<ContextRefreshedEvent>{


	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		log.debug(" Init the locale map : " + event.getApplicationContext().getApplicationName());
	}

}