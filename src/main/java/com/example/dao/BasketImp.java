package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.model.Basket;
import com.example.model.Product;

public class BasketImp implements BasketService {
	EntityManager em;

	public BasketImp() {
		em = SingleFactory.getEM();
	}

	public BasketImp(EntityManager em) {
		this.em = em;
	}

	public void save(Object object) {
		this.em.getTransaction().begin();
		this.em.persist(object);
		this.em.getTransaction().commit();
	}

	public List<Product> getAllBasketProduct(int id) {
		List<Product> allItem = new ArrayList<Product>();
		Query query = this.em
				.createQuery("From Basket as basket where basket.id = ?");
		query.setParameter(0, id);
		allItem = query.getResultList();
		return allItem;
	}

	public Basket getBasket(int id) {
		Query query = this.em
				.createQuery("From Basket as basket where basket.id = ?");
		query.setParameter(0, id);
		Basket basket = (Basket) query.getSingleResult();
		return basket;

	}

}
