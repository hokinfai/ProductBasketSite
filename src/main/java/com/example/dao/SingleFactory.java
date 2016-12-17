package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleFactory {
	private static EntityManagerFactory emf;
	private static EntityManager em;

	private SingleFactory() {
	}

	public static EntityManager getEM() {
		if (em == null) {
			emf = Persistence.createEntityManagerFactory("default");
			em = emf.createEntityManager();
		}
		return em;
	}

	public static void close() {
		if (em != null)
			em.close();
	}
}
