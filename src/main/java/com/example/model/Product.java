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
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int productId;
	private String productName;
	private double unitPrice;
	private double buyPrice;
	private String category;
	private int inStock;
	private String description;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product")
	private List<BasketItem> basketList;

	public Product() {

	}

	public Product(String productName, double unitPrice, double buyPrice,
			String category, int inStock, String description) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.buyPrice = buyPrice;
		this.category = category;
		this.description = description;
		this.inStock = inStock;
		this.basketList = new ArrayList<BasketItem>();
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public List<BasketItem> getBasketList() {
		return basketList;
	}

	public void addBasket(BasketItem item) {
		this.basketList.add(item);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return productId;
	}

	@Override
	public String toString() {
		return "Product [id=" + productId + ", productName=" + productName
				+ ", unitPrice=" + unitPrice + ", buyPrice=" + buyPrice
				+ ", category=" + category + ", inStock=" + inStock
				+ ", description=" + description + ", basketList=" + basketList
				+ "]";
	}

}
