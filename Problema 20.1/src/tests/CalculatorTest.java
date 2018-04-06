package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Calculator;

class CalculatorTest 
{

	@Test
	void testAdd() 
	{
		Calculator calculator = new Calculator(3.0,4.0);
		Double actual = calculator.add();
		Double expected = 7.0;
		assertEquals(expected,actual);
	}
	
	@Test
	void testSubstract() 
	{
		Calculator calculator = new Calculator(4.0,5.0);
		Double actual = calculator.subtract();
		Double expected = -1.0;
		assertEquals(expected,actual);
	}
	
	@Test
	void testDivide() 
	{
		Calculator calculator = new Calculator(10.0,5.0);
		Double actual = calculator.divide();
		Double expected = 2.0;
		assertEquals(expected,actual);
	}
	
	@Test
	void testMultiply() 
	{
		Calculator calculator = new Calculator(10.0,5.0);
		Double actual = calculator.multiply();
		Double expected = 50.0;
		assertEquals(expected,actual);
	}
	

}
