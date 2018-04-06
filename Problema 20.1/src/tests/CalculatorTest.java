package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Calculator;

class CalculatorTest 
{

	@Test
	void testAdd() 
	{
		Calculator calculator = new Calculator();
		Double actual = calculator.add(3.0,4.0);
		Double expected = 7.0;
		assertEquals(expected,actual);
	}
	
	@Test
	void testSubstract() 
	{
		Calculator calculator = new Calculator();
		Double actual = calculator.subtract(4.0,5.0);
		Double expected = -1.0;
		assertEquals(expected,actual);
	}
	
	@Test
	void testDivide() 
	{
		Calculator calculator = new Calculator();
		Double actual = calculator.divide(10.0,5.0);
		Double expected = 2.0;
		assertEquals(expected,actual);
	}
	
	@Test
	void testMultiply() 
	{
		Calculator calculator = new Calculator();
		Double actual = calculator.multiply(10.0,5.0);
		Double expected = 50.0;
		assertEquals(expected,actual);
	}
	

}
