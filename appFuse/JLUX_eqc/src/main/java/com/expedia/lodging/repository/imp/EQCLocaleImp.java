package com.expedia.lodging.repository.imp;

import java.util.List;

import javax.persistence.NoResultException;

import com.expedia.lodging.entity.EQCLocale;
import com.expedia.lodging.repository.IEQCLocale;

public class EQCLocaleImp extends RepositoryBase implements IEQCLocale{

	
	public List<EQCLocale> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from EQCLocale",EQCLocale.class).getResultList();
	}

	public EQCLocale findByLocaleCode(String code) throws NoResultException{
		// TODO Auto-generated method stub
		return entityManager.createQuery("from EQCLocale  el where el.code = ?",EQCLocale.class).setParameter(1, code).getSingleResult();
	}

}
