package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import models.Circle;

class CircleTest 
{

	private static Circle circle;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		circle = new Circle(3);
	}

	@Test
	void testArea() 
	{
		double actualArea = circle.calculateArea();
		double expectedArea = 28.274333882308138;
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	void testPerimeter() 
	{
		double actualPerimeter = circle.calculatePerimeter();
		double expectedArea = 18.84955592153876;
		assertEquals(expectedArea, actualPerimeter);
	}

	@Test
	void testDiameter() 
	{
		double actualDiameter = circle.calculateDiameter();
		double expectedArea = 6;
		assertEquals(expectedArea, actualDiameter);
	}

}
