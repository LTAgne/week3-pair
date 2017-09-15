package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VolunteerTest {
	
	VolunteerWorker sut; 
	
	@Before
	public void setUp() throws Exception {
		sut = new VolunteerWorker("Smith", "John");
	}


	@Test
	public void testName() {
		assertEquals("Smith", sut.getLastName());
		assertEquals("John", sut.getFirstName());
	}

	@Test
	public void testPay() {
		double pay = sut.getWeeklyPay(10);
		assertEquals(0, pay, 0.01);
		
	}
	
}
