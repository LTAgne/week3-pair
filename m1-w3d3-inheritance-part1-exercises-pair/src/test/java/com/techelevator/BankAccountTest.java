package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount sut;
	@Before
	public void setUp() throws Exception {
		sut = new BankAccount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeposit() {
		sut.deposit(new DollarAmount(101));
		assertEquals(new DollarAmount(101), sut.getBalance());
	}
	
	@Test
	public void testWithdraw() {
		sut.deposit(new DollarAmount(101));
		sut.withdraw(new DollarAmount(100));
		assertEquals(new DollarAmount(1), sut.getBalance());
		sut.withdraw(new DollarAmount(1));
		assertEquals(new DollarAmount(0), sut.getBalance());
		sut.withdraw(new DollarAmount(1));
		assertEquals(new DollarAmount(-1), sut.getBalance());
	}
	
	@Test
	public void testTransfer() {
		 BankAccount sut2 = new BankAccount();
		sut.transfer(sut2, new DollarAmount(100));
		assertEquals(new DollarAmount(-100), sut.getBalance());
		
	}
	
	@Test
	public void testConstructor() {
		assertEquals(new DollarAmount(0), sut.getBalance());
	}
}
