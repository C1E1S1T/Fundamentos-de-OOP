package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import models.Square;

class SquareTest 
{
	
	private static Square square;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		square = new Square(4);
	}

	@Test
	void testArea() 
	{
		double actualArea = square.calculateArea();
		double expectedArea = 16;
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	void testPerimeter() 
	{
		double actualPerimeter = square.calculatePerimeter();
		double expectedArea = 16;
		assertEquals(expectedArea, actualPerimeter);
	}

	@Test
	void testDiagonal() 
	{
		double actualDiagonal = square.calculateDiagonal();
		double expectedArea = 5.656854249492381;
		assertEquals(expectedArea, actualDiagonal);
	}
	

}
