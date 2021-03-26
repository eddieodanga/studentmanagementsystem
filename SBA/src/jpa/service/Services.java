package jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Services {

	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;

	public void connect() {
		emf = Persistence.createEntityManagerFactory("SBA");
		em = emf.createEntityManager();
	}

	public void dispose() {
		em.close();
		emf.close();

	}
}
