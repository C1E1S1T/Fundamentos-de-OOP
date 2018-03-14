package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import models.Triangle;

class TriangleTest 
{

	static Triangle triangle;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		triangle = new Triangle(4,5,3);
	}

	@Test
	void testArea() 
	{
		double actualArea = triangle.calculateArea();
		double expectedArea = 6;
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	void testPerimeter() 
	{
		double actualPerimeter = triangle.calculatePerimeter();
		double expected = 12;
		assertEquals(expected, actualPerimeter);
	}

}
