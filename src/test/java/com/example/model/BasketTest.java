package com.example.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	private Basket basket;

	@Before
	public void setUp() throws Exception {
		basket = new Basket("receiver", "shipTo");
	}

	@After
	public void tearDown() throws Exception {
		basket = null;
	}

	@Test
	public void test_GetReceiverSide_ReturnReceiver_WhenCalled() {
		// Arrange

		// Act
		String s = basket.getReceiverSide();
		// Assert
		assertEquals("receiver", s);
	}

	@Test
	public void test_GetShipTo_ReturnShipTo_WhenCalled() {
		// Arrange

		// Act
		String s = basket.getShipTo();
		// Assert
		assertEquals("shipTo", s);
	}

	@Test
	public void test_SetReceiverSide_ReturnSomething_WhenCalled() {
		// Arrange

		// Act
		basket.setReceiverSide("Something");
		// Assert
		assertEquals("Something", basket.getReceiverSide());
	}

	@Test
	public void test_SetShipTo_ReturnSomething_WhenCalled() {
		// Arrange

		// Act
		basket.setShipTo("Something");
		// Assert
		assertEquals("Something", basket.getShipTo());
	}

	@Test
	public void test_ToString_ReturnNotNull_WhenCalled() {
		// Arrange

		// Act
		String s = basket.toString();
		// Assert
		assertNotNull(s);
	}
}
