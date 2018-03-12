package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import models.Vector3D;

class Vector3DTest 
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		
	}

	@Test
	void test() 
	{
		Vector3D expected  = new Vector3D(1.4,2.4,3.5);
		Vector3D actual = new Vector3D(1.4,2.4,3.5);
		assertTrue(Vector3D.equals(expected, actual));
	}
	
	@Test
	void test2() 
	{
		Vector3D expected  = new Vector3D(2,4,0);
		Vector3D actual = new Vector3D(1.4,2.4,3.5);
		assertFalse(Vector3D.equals(expected, actual));
	}

	@Test
	void test3() 
	{
		Vector3D vector  = new Vector3D(1.4,2.4,3.5);
		Vector3D actual = new Vector3D(1.4,2.4,3.5);
		assertTrue(vector.equals(actual));
	}
	
	@Test
	void test4() 
	{
		Vector3D vector  = new Vector3D(1.4,2.4,3.5);
		Vector3D actual = new Vector3D(1.5,2.3,10);
		assertFalse(vector.equals(actual));
	}

	void test5()
	{
		Vector3D vector  = new Vector3D(2,3,5);
		double expected = 6.1;
		assertEquals(expected, vector.calculateNorm());
	}
	
	
}
