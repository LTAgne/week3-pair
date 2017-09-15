package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBankCustomer {
	
	BankCustomer sut;
	SavingAccount testSavingAccount; 

	@Before
	public void setUp() throws Exception {
		sut = new BankCustomer("sut", "1234 frontst", "8675309" );
		testSavingAccount = new SavingAccount(); 
		testSavingAccount.deposit(new DollarAmount(30000));
		sut.addAccounts(testSavingAccount);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		assertEquals("sut", sut.getName());
		assertEquals("1234 frontst", sut.getAddress());
		assertEquals("8675309", sut.getPhoneNumber());
		
	}
	
	@Test
	public void testAddAccount() {
		testSavingAccount.setAccountNumber("123456");
		assertEquals("123456", testSavingAccount.getAccountNumber());
		
		testSavingAccount.setAccountNumber("54321");
		assertEquals("54321", testSavingAccount.getAccountNumber());
		
	}
	
	@Test
	public void testIsVIP() {
		assertEquals(true, sut.isVip());
		
		testSavingAccount.withdraw(new DollarAmount (20000));
		assertEquals(false, sut.isVip());
		
	}
}
