package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.FileComparator;

class FileComparatorTest 
{

	@Test
	void testCaseEqualFiles() 
	{
		FileComparator file1 = new FileComparator("resource","hola.txt");
		FileComparator file2 = new FileComparator("resource","hola2.txt");
		assertTrue( file1.equals( file2  )   );
	}

	@Test
	void testCaseDifferentFiles() 
	{
		FileComparator file1 = new FileComparator("resource","test1.txt");
		FileComparator file2 = new FileComparator("resource","test2.txt");
		assertFalse( file1.equals( file2  )   );
	}
	
	@Test
	void testReader() 
	{
		FileComparator file1 = new FileComparator("resource","test1.txt");
		String actual = file1.read();
		String expected = "HOLA";
		assertEquals(expected,actual);
	}

	
	
}
