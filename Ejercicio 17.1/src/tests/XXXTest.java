package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import models.FileNumbers;

class XXXTest 
{

	@Test
	void testRead() 
	{
		FileNumbers numbers = new FileNumbers("resources");
		ArrayList<Integer> actual = numbers.read();
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1); expected.add(2); expected.add(3);
		assertEquals(expected.toString() , actual.toString());
	}
	
	@Test
	void testWrite() 
	{
		FileNumbers fileNumbers = new FileNumbers("resources");
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1); numbers.add(2); numbers.add(3);
		fileNumbers.write(numbers);
		ArrayList<Integer> actual = fileNumbers.read();
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1); expected.add(2); expected.add(3);
		assertEquals(expected.toString() , actual.toString());
	}
	
	@Test
	void testCountNegativeNumbers_case0() 
	{
		FileNumbers fileNumbers = new FileNumbers("resources");
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1); numbers.add(2); numbers.add(3);
		fileNumbers.write(numbers);
		Long actual = fileNumbers.countNegativeNumbers();
		Long expected = (long) 0;
		assertEquals(expected , actual);
	}
	
	
	@Test
	void testCountNegativeNumbers_case2()
	{
		FileNumbers fileNumbers = new FileNumbers("resources");
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(-1); numbers.add(-2); numbers.add(3);
		fileNumbers.write(numbers);
		Long actual = fileNumbers.countNegativeNumbers();
		Long expected = (long) 2;
		assertEquals(expected , actual);
	}
	
	
	
}
