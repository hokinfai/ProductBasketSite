package com.example.model;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {
	private Product product;

	@Before
	public void setUp() throws Exception {
		product = new Product("productName", 1.00d, 1.00d, "category", 1,
				"description");
	}

	@After
	public void tearDown() throws Exception {
		product = null;
	}

	@Test
	public void test_GetProductName_ReturnProductName_WhenCalled() {
		// Arrange

		// Act
		String s = product.getProductName();
		// Assert
		assertEquals("productName", s);
	}

	@Test
	public void test_GetUnitPrice_ReturnOne_WhenCalled() {
		// Arrange

		// Act
		double s = product.getUnitPrice();
		// Assert
		assertEquals(1.00d, s, 0.00);
	}

	@Test
	public void test_GetBuyPrice_ReturnOne_WhenCalled() {
		// Arrange

		// Act
		double s = product.getBuyPrice();
		// Assert
		assertEquals(1.00d, s, 0.00);
	}

	@Test
	public void test_GetCategory_ReturnCategory_WhenCalled() {
		// Arrange

		// Act
		String s = product.getCategory();
		// Assert
		assertEquals("category", s);
	}

	@Test
	public void test_GetInStock_ReturnOne_WhenCalled() {
		// Arrange

		// Act
		int s = product.getInStock();
		// Assert
		assertEquals(1, s);
	}

	@Test
	public void test_GetDescription_ReturnDescription_WhenCalled() {
		// Arrange

		// Act
		String s = product.getDescription();
		// Assert
		assertEquals("description", s);
	}

	@Test
	public void test_SetProductName_ReturnSomething_WhenSetToSomething_AndCalledGetter() {
		// Arrange

		// Act
		product.setProductName("Something");
		// Assert
		assertEquals("Something", product.getProductName());
	}

	@Test
	public void test_SetUnitPrice_ReturnTen_WhenSetToTen_AndCalledGetter() {
		// Arrange

		// Act
		product.setUnitPrice(10.00d);
		// Assert
		assertEquals(10.00d, product.getUnitPrice(), 0.00);
	}

	@Test
	public void test_SetBuyPrice_ReturnTen_WhenSetToTen_AndCalledGetter() {
		// Arrange

		// Act
		product.setBuyPrice(10.00d);
		// Assert
		assertEquals(10.00d, product.getBuyPrice(), 0.00);
	}

	@Test
	public void test_SetCategory_ReturnSomething_WhenSetToSomething_AndCalledGetter() {
		// Arrange

		// Act
		product.setCategory("Something");
		// Assert
		assertEquals("Something", product.getCategory());
	}

	@Test
	public void test_SetInStock_ReturnTen_WhenSetToTen_AndCalledGetter() {
		// Arrange

		// Act
		product.setInStock(10);
		// Assert
		assertEquals(10, product.getInStock());
	}

	@Test
	public void test_SetDescription_ReturnSomething_WhenSetToSomething_AndCalledGetter() {
		// Arrange

		// Act
		product.setDescription("Something");
		// Assert
		assertEquals("Something", product.getDescription());
	}

	@Test
	public void test_ToString_ReturnNotNull_WhenCalled() {
		// Arrange

		// Act
		String s = product.toString();
		// Assert
		assertNotNull(s);
	}

}
