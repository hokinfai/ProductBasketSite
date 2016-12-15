package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.model.Basket;
import com.example.model.BasketItem;
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
				.createQuery("FROM Product AS product WHERE product.productId=?");
		query.setParameter(0, id);
		Product product = (Product) query.getSingleResult();
		return product;
	}

	public Basket getBasket(int id) {
		Query query = this.em
				.createQuery("FROM Basket AS basket WHERE basket.basketId=?");
		query.setParameter(0, id);
		Basket basket = (Basket) query.getSingleResult();
		return basket;
	}

	public BasketItem getBasketItem(int bId, int pId) {
		Query query = this.em
				.createQuery("FROM BasketItem AS bi WHERE bi.basketId=? And bi.productId = ?");
		query.setParameter(0, bId);
		query.setParameter(1, pId);
		BasketItem bt = (BasketItem) query.getSingleResult();
		return bt;
	}

}
