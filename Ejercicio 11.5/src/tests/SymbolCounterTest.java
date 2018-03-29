package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.SymbolCounter;

class SymbolCounterTest 
{

	@Test
	void testCountVowels() 
	{
		Integer actual = new SymbolCounter("HOLA").countVowels();
		Integer expected = 2;
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testCountConsonants() 
	{
		Integer actual = new SymbolCounter("HOLA").countConsonants();
		Integer expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	void testCountDigits() 
	{
		Integer actual = new SymbolCounter("1HO1LA1").countDigits();
		Integer expected = 3;
		assertEquals(expected, actual);
	}
	

}
