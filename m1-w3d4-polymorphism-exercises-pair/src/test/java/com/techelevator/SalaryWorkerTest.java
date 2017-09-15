package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SalaryWorkerTest {

	SalaryWorker sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SalaryWorker("John", "Smith",52000);
	}

	
	@Test
	public void testConstructor() {
		assertEquals(52000, sut.getAnnualSalary(), 0.001);
	}

	@Test
	public void testGetFirstName(){
		assertEquals("John", sut.getFirstName());
	}

	@Test
	public void testGetLastName(){
		assertEquals("Smith", sut.getLastName());
	}
	

	@Test
	public void testGetWeeklyPay(){
		assertEquals(1000, sut.getWeeklyPay(40), 0.001);
	}
	

}

