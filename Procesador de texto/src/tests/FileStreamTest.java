package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import models.FileStream;

class FileStreamTest 
{

	@Test
	void testRead_fileExistsAndHasContent_expectedContent() 
	{
		FileStream fileStream = new FileStream("resources","file.txt");
		String actual = null;
		try 
		{
			actual = fileStream.read();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		String expected = "Hola\n";
		assertEquals(expected, actual);
	}

	@Test
	void testWrite_fileNotExistsAndHasContent_expectedContentInFile()
	{
		FileStream fileStream = new FileStream("resources","file2.txt");
		try {
			fileStream.write("Hola\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String actual = null;
		try 
		{
			actual = fileStream.read();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		String expected = "Hola\n";
		fileStream.getFile().delete();
		assertEquals(expected,actual);
	}
	
	@Test
	void testWrite_fileExistsAndHasContent_expectedOverwriteContent()
	{
		FileStream fileStream = new FileStream("resources","file3.txt");
		try {
			fileStream.write("Como has estado?");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			fileStream.write("Hola\n");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String actual = null;
		try 
		{
			actual = fileStream.read();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		String expected = "Hola\n";
		fileStream.getFile().delete();
		assertEquals(expected,actual);
	}
	
}
