package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DollarAmountTest {
	DollarAmount sut;
	@Before
	public void setUp() throws Exception {
		sut = new DollarAmount(140);
	}

	@Test
	public void testConstructor() {
		assertEquals(1, sut.getDollars());
		assertEquals(40, sut.getCents());
		
	}
	
	@Test
	public  void testToString() {
		assertEquals("$1.40", sut.toString());
		sut = new DollarAmount(-1303);
		sut.isNegative();
		assertEquals("$-13.03", sut.toString());
	}
	@Test
	public void testNegative() {
		sut = (new DollarAmount(-1303));
		sut.isNegative();
		assertEquals(true, sut.isNegative());
	}
	
	@Test
	public void testPositive() {
		sut = (new DollarAmount(1203));
		sut.isNegative();
		assertEquals(false, sut.isNegative());
	}
}
