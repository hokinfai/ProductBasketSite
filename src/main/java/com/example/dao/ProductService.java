package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface ProductService {
	public void save(Object object);

	public Product getSingleProduct(int id);

	public List<Product> getAllProduct();
}
