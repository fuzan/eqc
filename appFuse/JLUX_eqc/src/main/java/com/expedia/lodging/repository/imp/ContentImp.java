package com.expedia.lodging.repository.imp;

import java.util.List;

import javax.persistence.NoResultException;

import com.expedia.lodging.entity.LocaleContent;
import com.expedia.lodging.repository.IContent;

public class ContentImp extends RepositoryBase implements IContent{
	
	
	public List<LocaleContent> findAll() {
		return entityManager.createQuery("from LocaleContent",LocaleContent.class).getResultList();
	}

	public LocaleContent findByLocaleId(int localeID) throws NoResultException{
		return entityManager.createQuery("from LocaleContent lc where lc.locale_id = ? ",LocaleContent.class).setParameter(1, localeID).getSingleResult();
	}

	public LocaleContent findByLocaleIdAndPageId(int localeID, int pageId) throws NoResultException{
		return entityManager.createQuery("from LocaleContent lc where lc.locale_id = ? and lc.page_id = ?",LocaleContent.class).setParameter(1, localeID).setParameter(2, pageId).getSingleResult();
	}

}
