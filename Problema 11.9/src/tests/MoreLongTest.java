package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.MoreLong;

class MoreLongTest 
{


	@Test
	void testAdd_caseOneDigit() 
	{
		MoreLong expected = new MoreLong("2");
		MoreLong actual = new MoreLong("1");
		actual.add(new MoreLong("1"));
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testAdd_caseTwoDigits() 
	{
		MoreLong expected = new MoreLong("10");
		MoreLong actual = new MoreLong("8");
		actual.add(new MoreLong("2"));
		assertEquals(expected.toString(), actual.toString());
	}
	
	
	@Test
	void testAdd_caseThreeDigits() 
	{
		MoreLong expected = new MoreLong("100");
		MoreLong actual = new MoreLong("50");
		actual.add(new MoreLong("50"));
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testAdd_caseComplexThreeDigits() 
	{
		MoreLong expected = new MoreLong("125");
		MoreLong actual = new MoreLong("60");
		actual.add(new MoreLong("65"));
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testAdd_caseMoreLong() 
	{
		MoreLong expected = new MoreLong("2000000000000000000000000000000000000000000");
		MoreLong actual = new MoreLong("1000000000000000000000000000000000000000000");
		actual.add(new MoreLong("1000000000000000000000000000000000000000000"));
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testAdd_caseComplex() 
	{
		MoreLong expected = new MoreLong("1998");
		MoreLong actual = new MoreLong("999");
		actual.add(new MoreLong("999"));
		assertEquals(expected.toString(), actual.toString());
	}
	

}
