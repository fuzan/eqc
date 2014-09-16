package com.expedia.lodging.connectivity.repository.imp;

import java.util.List;

import javax.persistence.NoResultException;

import com.expedia.lodging.connectivity.entity.LocaleContent;
import com.expedia.lodging.connectivity.entity.LocaleNavLink;
import com.expedia.lodging.connectivity.repository.IContent;

public class ContentImp extends RepositoryBase implements IContent{
	
	
	public List<LocaleContent> findAll() {
		return entityManager.createQuery("from LocaleContent",LocaleContent.class).getResultList();
	}

	public LocaleContent findByLocaleId(Integer localeID) throws NoResultException{
		return entityManager.createQuery("from LocaleContent lc where lc.locale_id = ? ",LocaleContent.class).setParameter(1, localeID).getSingleResult();
	}

	public LocaleContent findByLocaleIdAndPageId(Integer localeId, Integer pageId) throws NoResultException{
		return entityManager.createQuery("from LocaleContent lc where lc.locale_id = ? and lc.page_id = ?",LocaleContent.class).setParameter(1, localeId).setParameter(2, pageId).getSingleResult();
	}

	public List<LocaleNavLink> findAllNavLink() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from LocaleNavLink",LocaleNavLink.class).getResultList();
	}

	public LocaleNavLink findNavLinkByLocaleIdAndPageId(Integer localeId, Integer pageId) throws NoResultException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LocaleNavLink> findAllNavLinkTextByLocaleId(Integer localeId) {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from LocaleNavLink ll where ll.locale_id = ? ",LocaleNavLink.class).setParameter(1, localeId).getResultList();
	}
	
}
