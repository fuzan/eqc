package com.expedia.lodging.repository.imp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class RepositoryBase {
	@PersistenceContext
    protected EntityManager entityManager;
	
}
