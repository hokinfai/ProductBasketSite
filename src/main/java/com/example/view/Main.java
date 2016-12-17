package com.example.view;

import java.util.List;

import com.example.dao.ProductImp;
import com.example.dao.ProductService;
import com.example.dao.SingleFactory;
import com.example.model.Basket;
import com.example.model.BasketItem;
import com.example.model.Product;

public class Main {

	public static void main(String[] args) {
		ProductService service = new ProductImp();

		// CODE THAT LINK PRODUCT AND BASKET TOGETHER

		// Product product1 = new Product("Coke", 1.0, 0.4, "Drink", 100,
		// "Soft drink");
		// Basket bk = new Basket("Alan", "Leeds");
		// BasketItemPK bipk = new BasketItemPK();
		// BasketItem bi = new BasketItem();
		// bi.setBasketItemPK(bipk);
		// bi.setQuantity(50);
		// bi.setBasket(bk);
		// bi.setProduct(product1);
		// service.save(product1);
		// service.save(bk);
		// service.save(bi);

		// CODE THAT ADD PRODUCT TO BASKET

		// Product product2 = new Product("Coffee", 0.99, 0.8, "Drink", 30,
		// "Cold drink");
		// Basket bk = service.getBasket(2);
		// BasketItem bi = new BasketItem();
		// bi.setQuantity(1);
		// bi.setBasket(bk);
		// bi.setProduct(product2);
		// service.save(bk);
		// service.save(product2);
		// service.save(bi);

		// CODE THAT ONLY ADD PRODUCT

		Product product = new Product("beer", 4.99, 3.8, "Alcohol", 30,
				"Adult drink");
		service.save(product);

		// CODE THAT INCREASE THE QUANTITY OF EXISTING PRODUCT

		// Basket bk = service.getBasket(2);
		// List<BasketItem> bi = bk.getProductList();
		// Product product = service.getSingleProduct(5);
		// for (BasketItem b : bk.getProductList()) {
		// if ((b.getProduct().getProductName()).equals(product
		// .getProductName())) {
		// System.out.println(b.getQuantity());
		// }
		// }

		// BasketItemPK bipk = new BasketItemPK();
		// BasketItem bi = new BasketItem();
		// bi.setBasketItemPK(bipk);
		// bi.setQuantity(quantity++);
		// bi.setBasket(bk);
		// bi.setProduct(product);
		// service.save(bk);
		// service.save(product);
		// service.save(bi);

		// System.out.println(pro.toString());
		// Basket bk1 = new Basket("Kirana", "Manchester");
		// Product product3 = new Product("Water", 0.89, 0.8, "Drink", 300,
		// "Water drink");
		// bk1.addProduct(bi);
		// product3.addBasket(bi);
		// product1.addBasket(bi);
		// bk.addProduct(bi);

		// service.save(product3);

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
