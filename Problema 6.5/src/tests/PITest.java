package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.PI;

class PITest 
{
	PI pi;
		
	@Test
	void test1() 
	{
		pi = new PI();
		double actual = pi.calculateNumbers(4);
		double expected = 1.4860770975056687;
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() 
	{
		pi = new PI();
		double actual = pi.calculateNumbers(0);
		double expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void test3() 
	{
		pi = new PI();
		double actual = pi.calculateNumbers(-1);
		double expected = 1;
		assertEquals(expected, actual);
	}

	
}
