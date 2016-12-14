package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.model.Product;

public class ProductImp implements ProductService {
	EntityManager em;

	public ProductImp() {
		em = SingleFactory.getEM();
	}

	public ProductImp(EntityManager em) {
		this.em = em;
	}

	public void save(Object object) {
		this.em.getTransaction().begin();
		this.em.persist(object);
		this.em.getTransaction().commit();
	}

	public List<Product> getAllProduct() {
		List<Product> allItem = new ArrayList<Product>();
		Query query = this.em.createQuery("From Product");
		allItem = query.getResultList();
		return allItem;
	}

	public Product getSingleProduct(int id) {
		Query query = this.em
				.createQuery("FROM Product AS product WHERE product.id=?");
		query.setParameter(0, id);
		Product product = (Product) query.getSingleResult();
		return product;
	}

}
