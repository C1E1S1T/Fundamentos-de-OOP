package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import models.Rectangle;

class RectangleTest 
{
	
	private static Rectangle rectangle;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		rectangle = new Rectangle(4,3);
	}

	@Test
	void testArea() 
	{
		double actualArea = rectangle.calculateArea();
		double expectedArea = 12;
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	void testPerimeter() 
	{
		double actualPerimeter = rectangle.calculatePerimeter();
		double expected = 14;
		assertEquals(expected, actualPerimeter);
	}

	@Test
	void testDiagonal() 
	{
		double actualDiagonal = rectangle.calculateDiagonal();
		double expected = 5;
		assertEquals(expected, actualDiagonal);
	}
	

}