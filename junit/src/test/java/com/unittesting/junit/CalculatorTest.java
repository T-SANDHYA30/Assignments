package com.unittesting.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		int expected=10;
		int actualvalue= new Calculator().addtest(5,5);
		assertEquals(expected,actualvalue);
	}
	@Test
	public void subtractiontest() {
		int expected=5;
		int actualvalue= new Calculator().subtractiontest(9,4);
		assertEquals(expected,actualvalue);
	}
	@Test
	public void multiplicationtest() {
		int expected=20;
		int actualvalue= new Calculator().multiplicationtest(5,4);
		assertEquals(expected,actualvalue);
	}
	@Test
	public void divisiontest() {
		int expected=2;
		int actualvalue= new Calculator().divisiontest(11,4);
		assertEquals(expected,actualvalue);
	}
	@Test
	public void isEvenTest() {
		assertTrue(new Calculator().isEven(4));
	}
	@Test
	public void checkArraysTest() {
		int brr[]= {1,2,3,4,5};
		assertEquals(brr,new Calculator().checkArrays());
	}
	@Test
	public void checkAETest() {
		ArithmeticException ex=new ArithmeticException();
		assertEquals(ex, new Calculator().checkAE());
		
	}

}
