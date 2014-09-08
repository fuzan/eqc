package com.expedia.lodging.repository.imp;

import java.util.List;
import com.expedia.lodging.entity.LocaleContent;
import com.expedia.lodging.repository.IContent;

public class ContentImp extends RepositoryBase implements IContent{
	
	
	public List<LocaleContent> findAll() {
		return entityManager.createQuery("from LocaleContent",LocaleContent.class).getResultList();
	}

	public LocaleContent findByLocaleId(String localeID) {
		Integer localeID_integer = Integer.parseInt(localeID);
		return entityManager.createQuery("from LocaleContent lc where lc.locale_id = ? ",LocaleContent.class).setParameter(1, localeID_integer).getSingleResult();
	}

}
