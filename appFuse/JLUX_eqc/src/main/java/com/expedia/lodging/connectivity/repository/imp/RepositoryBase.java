package com.expedia.lodging.connectivity.repository.imp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class RepositoryBase {
	@PersistenceContext
    protected EntityManager entityManager;
	
}
