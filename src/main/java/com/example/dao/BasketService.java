package com.example.dao;

import java.util.List;

import com.example.model.Basket;
import com.example.model.Product;

public interface BasketService {
	public void save(Object object);

	public List<Product> getAllBasketProduct(String id);

	public Basket getBasket(String id);
}
