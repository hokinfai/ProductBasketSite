package com.example.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class BasketItem implements Serializable {

	@EmbeddedId
	private BasketItemPK basketItemPK = new BasketItemPK();

	@MapsId("basketId")
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "basket_id")
	private Basket basket;

	@MapsId("productId")
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "product_id")
	private Product product;

	private int quantity;

	public BasketItem() {
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

	@Override
	public String toString() {
		return "BasketItem [basket=" + basket + ", product=" + product
				+ ", quantity=" + quantity + "]";
	}

}
