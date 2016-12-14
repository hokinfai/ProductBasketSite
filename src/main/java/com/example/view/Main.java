package com.example.view;

import com.example.dao.BasketImp;
import com.example.dao.BasketService;
import com.example.dao.ProductImp;
import com.example.dao.ProductService;
import com.example.dao.SingleFactory;
import com.example.model.Basket;
import com.example.model.BasketItem;
import com.example.model.Product;

public class Main {

	public static void main(String[] args) {
		ProductService service = new ProductImp();
		// BasketService basSer = new BasketImp();
		// Product product1 = new Product("Coke", 1.0, 0.4, "Drink", 100,
		// "Soft drink");
		// Product product2 = new Product("Red Bull", 1.89, 0.8, "Drink", 300,
		// "Energy drink");
		Basket bk = new Basket("Alan", "Leeds");
		// BasketItem bi = new BasketItem();
		// bi.setQuantity(5);
		// product1.addBasket(bi);
		// product2.addBasket(bi);
		// order1.addProduct(bi);
		// service.save(product1);
		// service.save(product2);
		service.save(bk);
		// service.save(bi);
		// List<Product> allItem = service.getAllProduct();
		// for (Product p : allItem)
		// System.out.println(p.toString());

		// function about basket
		// Basket basket = new Basket();
		// Product product1 = service.getSingleProduct(1);
		// Product product2 = service.getSingleProduct(2);
		// System.out.println(product1);
		// System.out.println(product2);
		// basket.addProduct(product1);
		// basSer.save(basket);
		// service.save(product1);
		SingleFactory.close();
	}
}
