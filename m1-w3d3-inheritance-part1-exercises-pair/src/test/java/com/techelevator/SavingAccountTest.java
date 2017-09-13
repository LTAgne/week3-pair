package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SavingAccountTest {
	SavingAccount sut;
	@Before
	public void setUp() throws Exception {
		sut = new SavingAccount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWithdraw() {
		sut.deposit(new DollarAmount(14000));
		sut.withdraw(new DollarAmount(100));
		assertEquals(new DollarAmount(13700), sut.getBalance());
	}
	
	@Test
	public void testWithdrawDecline() {
		sut.deposit(new DollarAmount(14000));
		sut.withdraw(new DollarAmount(15000));
		assertEquals(new DollarAmount(14000), sut.getBalance());
	}
}
