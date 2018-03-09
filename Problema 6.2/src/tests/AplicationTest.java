package tests;

import aplication.Triangle;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicationTest {

	Triangle triangle;
	@BeforeEach
	void setUp() throws Exception 
	{
		triangle = new Triangle();
	}

	@Test
	void testDrawLine_caseLimit5() 
	{
		int actuals[]=triangle.drawLine(5);
		int expecteds[] = {1,2,3,4,5,-1}; 
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	void testDrawLines(){
		int[] actuals = triangle.drawLines(4);
		int expecteds[] = {1,2,3,4,-1,1,2,3,-1,1,2,-1,1,-1};
		Assert.assertArrayEquals(expecteds, actuals);
	}
}



