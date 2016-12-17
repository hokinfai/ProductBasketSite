package com.example.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasketItemTest {
	private BasketItem basketItem;

	@Before
	public void setUp() throws Exception {
		basketItem = new BasketItem();
	}

	@After
	public void tearDown() throws Exception {
		basketItem = null;
	}

	@Test
	public void test_GetQuantity_ReturnTen_WhenSetToTenAndCalled() {
		// Arrange
		basketItem.setQuantity(10);
		// Act
		int s = basketItem.getQuantity();
		// Assert
		assertEquals(10, s);
	}

	@Test
	public void test_SetReceiverSide_ReturnTen_WhenSetToTen_AndCalledGetter() {
		// Arrange

		// Act
		basketItem.setQuantity(10);
		// Assert
		assertEquals(10, basketItem.getQuantity());
	}

	@Test
	public void test_ToString_ReturnNotNull_WhenCalled() {
		// Arrange

		// Act
		String s = basketItem.toString();
		// Assert
		assertNotNull(s);
	}
}
