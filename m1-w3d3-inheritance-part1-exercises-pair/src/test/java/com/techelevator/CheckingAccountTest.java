package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
	CheckingAccount sut;
	@Before
	public void setUp() throws Exception {
		sut = new CheckingAccount();
	}


	@Test
	public void testWithdraw() {
		sut.withdraw(new DollarAmount(100));
		assertEquals(new DollarAmount(-1100), sut.getBalance());
	}
	
	@Test
	public void testDecline() {
		sut.withdraw(new DollarAmount(30000));
		assertEquals(new DollarAmount(0), sut.getBalance());

	}
}
