package com.example.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class BasketItem {

	@EmbeddedId
	private BasketItemPK basketItemPK;

	@MapsId("basketId")
	@ManyToOne
	@JoinColumn(name = "basket_id")
	private Basket basket;

	@MapsId("productId")
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	private int quantity;

	public BasketItem() {
		basketItemPK = new BasketItemPK();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BasketItemPK getBasketItemPK() {
		return basketItemPK;
	}

	public void setBasketItemPK(BasketItemPK basketItemPK) {
		this.basketItemPK = basketItemPK;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "BasketItem [basket=" + basket + ", product=" + product
				+ ", quantity=" + quantity + "]";
	}

}
