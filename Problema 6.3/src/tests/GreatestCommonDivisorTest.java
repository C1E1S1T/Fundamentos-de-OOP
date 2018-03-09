package tests;

import org.junit.jupiter.api.Test;
import models.GreatestCommonDivisor;

import org.junit.Assert;

class GreatestCommonDivisorTest 
{
	GreatestCommonDivisor gcd;

	@Test
	void test1() 
	{
		gcd = new GreatestCommonDivisor(532,112);
		int expecteds = 28;
		int actuals =  gcd.calculate();
		Assert.assertEquals(expecteds, actuals);
	}
	
	@Test
	void test2() 
	{
		gcd = new GreatestCommonDivisor(12,8);
		int expecteds = 4;
		int actuals =  gcd.calculate();
		Assert.assertEquals(expecteds, actuals);
	}
	
	@Test
	void test3() 
	{
		gcd = new GreatestCommonDivisor(0,4);
		int expecteds = 4;
		int actuals =  gcd.calculate();
		Assert.assertEquals(expecteds, actuals);
	}
	
	@Test
	void test4() 
	{
		gcd = new GreatestCommonDivisor(4,0);
		int expecteds = 4;
		int actuals =  gcd.calculate();
		Assert.assertEquals(expecteds, actuals);
	}
	
	@Test
	void test5() 
	{
		gcd = new GreatestCommonDivisor(0,4);
		int expecteds = 4;
		int actuals =  gcd.calculate();
		Assert.assertEquals(expecteds, actuals);
	}
	
	@Test
	void test6() 
	{
		gcd = new GreatestCommonDivisor(1,1);
		int expecteds = 1;
		int actuals =  gcd.calculate();
		Assert.assertEquals(expecteds, actuals);
	}
	
	@Test
	void test7() 
	{
		try 
		{
			    gcd = new GreatestCommonDivisor(1,-1); 
			    gcd.calculate();
			    Assert.fail("Negative numbers not valid");
		} 
		catch(ArithmeticException error)  
		{
			
		}
	}
	
}
