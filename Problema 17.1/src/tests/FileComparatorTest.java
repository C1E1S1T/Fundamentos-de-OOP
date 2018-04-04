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
		file1.create();
		file1.write("PERFECCION");
		FileComparator file2 = new FileComparator("resource","hola2.txt");
		file2.create();
		file2.write("PERFECCION");
		assertTrue( file1.equals( file2  )   );
	}

	@Test
	void testCaseDifferentFiles() 
	{
		FileComparator file1 = new FileComparator("resource","test1.txt");
		file1.create();
		file1.write("HOLAMUNDO");
		FileComparator file2 = new FileComparator("resource","test2.txt");
		file2.create();
		file2.write("backtrack");
		assertFalse( file1.equals( file2  )   );
	}
	
	@Test
	void testReader() 
	{
		FileComparator file1 = new FileComparator("resource","test3.txt");
		file1.create();
		file1.write("HOLA");
		String actual = file1.read();
		String expected = "HOLA\n";
		assertEquals(expected,actual);
	}
	

}
