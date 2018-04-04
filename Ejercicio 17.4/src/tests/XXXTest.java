package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.Serializable;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import app.ComplexNumber;
import app.RationalNumber;
import models.FileNumbers;

class XXXTest 
{

	@Test
	void test() 
	{ 
		ArrayList<Serializable> numbers = new ArrayList<>();
		numbers.add(new ComplexNumber(2,3));
		numbers.add(new ComplexNumber(2,4));
		numbers.add(new RationalNumber(5,10));
		numbers.add(new RationalNumber(10,6));
		numbers.add(new ComplexNumber(6,30));
		Integer actual = numbers.size();
		Integer expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	void test2() 
	{ 
		ArrayList<Serializable> numbers = new ArrayList<>();
		numbers.add(new ComplexNumber(2,3));
		numbers.add(new ComplexNumber(2,4));
		numbers.add(new RationalNumber(5,10));
		numbers.add(new RationalNumber(10,6));
		numbers.add(new ComplexNumber(6,30));
		String expected = "[2+3i, 2+4i, 5/10, 10/6, 6+30i]";
		assertEquals(expected, numbers.toString());
	}
	
	@Test
	void testRead() 
	{ 
		ArrayList<Serializable> expected = new ArrayList<>();
		expected.add(new ComplexNumber(2,3));
		expected.add(new ComplexNumber(2,4));
		expected.add(new ComplexNumber(2,5));
		expected.add(new RationalNumber(2,10));
		expected.add(new RationalNumber(5,10));
		ArrayList<Serializable> actual = new FileNumbers("resources","test1.txt").read();
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	void testWrite() 
	{ 
		ArrayList<Serializable> expected = new ArrayList<>();
		expected.add(new ComplexNumber(2,3));
		expected.add(new ComplexNumber(2,4));
		expected.add(new ComplexNumber(2,5));
		expected.add(new RationalNumber(2,10));
		expected.add(new RationalNumber(5,10));
		FileNumbers fileNumbers = new FileNumbers("resources", "test2.txt");
		fileNumbers.create();
		fileNumbers.write(expected);
		ArrayList<Serializable> actual = new FileNumbers("resources","test2.txt").read();
		assertEquals(expected.toString(), actual.toString());
	}
	
	
	
	
	
}
