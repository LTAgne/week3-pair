package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {

	HourlyWorker sut; 
	
	@Before
	public void setUp() throws Exception {
		sut = new HourlyWorker("John", "Smith", 10);
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
		assertEquals(400, sut.getWeeklyPay(40), 0.001);
	}
	
	@Test
	public void testNoWork(){
		assertEquals(0, sut.getWeeklyPay(0), 0.001);
	}
	
	@Test
	public void testOvertime(){
		assertEquals(415, sut.getWeeklyPay(41), 0.001);
	}
	
}
