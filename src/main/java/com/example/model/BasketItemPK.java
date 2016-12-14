package com.example.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BasketItemPK implements Serializable {
	private int basketId;

	private int productId;

	public BasketItemPK() {
	}

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + basketId;
		result = prime * result + productId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasketItemPK other = (BasketItemPK) obj;
		if (basketId != other.basketId)
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}
}
