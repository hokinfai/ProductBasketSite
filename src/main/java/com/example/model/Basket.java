package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Basket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "basket_id")
	private int basketId;
	@Column(name = "receiver")
	private String receiverSide;

	private String shipTo;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "basket_id")
	private List<BasketItem> productList;

	public Basket() {

	}

	public Basket(String receiver, String shipTo) {
		this.receiverSide = receiver;
		this.shipTo = shipTo;
		productList = new ArrayList<BasketItem>();
	}

	public String getReceiverSide() {
		return receiverSide;
	}

	public void setReceiverSide(String receiverSide) {
		this.receiverSide = receiverSide;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public List<BasketItem> getProductList() {
		return productList;
	}

	public void addProduct(BasketItem item) {
		this.productList.add(item);
	}

	public int getId() {
		return basketId;
	}

	@Override
	public String toString() {
		return "Basket [id=" + basketId + ", receiverName=" + receiverSide
				+ ", shipTo=" + shipTo + ", productList=" + productList + "]";
	}

}
