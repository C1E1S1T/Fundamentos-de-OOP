package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.XXX;

class XXXTest 
{

	@Test
	void test() 
	{
		String actual = new XXX().convertToOrdinal("21/04/01");
		String expected = "21 Abril de 2001";
		assertEquals(expected, actual);
	}

}
