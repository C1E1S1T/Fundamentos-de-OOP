package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import models.XXX;

class StringDifferencesTest 
{

	@Test
	void testSubstract_caseEquals() 
	{
		XXX x = new XXX();
		ArrayList<String> actual =  x.substract("HOLA","HOLA");
		ArrayList<String> expected = null;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubstract_caseOneDifference() 
	{
		XXX x = new XXX();
		ArrayList<String> actual =  x.substract("HOLA-","HOLA");
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Linea:1 Columna:4 Diferencia:-");
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testSubstract_caseTwoDifference() 
	{
		XXX x = new XXX();
		ArrayList<String> actual =  x.substract("HOLA","A");
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Linea:1 Columna:3 Diferencia:HOL");
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testSubstract_case1() 
	{
		XXX x = new XXX();
		ArrayList<String> actual =  x.substract("HOLA-A","HOLA A");
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Linea:1 Columna:4 Diferencia:    - ");
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testSubstract_case2() 
	{
		XXX x = new XXX();
		ArrayList<String> actual =  x.substract("HOLA","ADIOS");
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Linea:1 Columna:0 Diferencia:ADIOS");
		assertEquals(expected.toString(), actual.toString());
	}
	


}
