package com.expedia.lodging.connectivity.repository.imp;

import java.util.List;

import javax.persistence.NoResultException;

import com.expedia.lodging.connectivity.entity.LocaleNavLink;
import com.expedia.lodging.connectivity.repository.ILocaleNavLink;

public class LocaleNavLinkImp extends RepositoryBase implements ILocaleNavLink {

	public List<LocaleNavLink> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from LocaleNavLink",LocaleNavLink.class).getResultList();
	}

	public LocaleNavLink findByPageIdAndLocaleId(Integer pageId, Integer localeId)  throws NoResultException {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from LocaleNavLink ll where ll.locale_id = ? and ll.page_id = ?",LocaleNavLink.class).setParameter(1, localeId).setParameter(2, pageId).getSingleResult();
	}

}
