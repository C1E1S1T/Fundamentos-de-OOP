package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import app.FactorialDecomposition;

class FactorialDecompositionTest {

	FactorialDecomposition factorialDecomposition;
	
	@Test
	void test1() 
	{
		FactorialDecomposition factorialDecomposition = new FactorialDecomposition();
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2); expected.add(2);expected.add(5);expected.add(5);
		expected.add(19);
		ArrayList<Integer> actual = factorialDecomposition.calculate(1900);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() 
	{
		FactorialDecomposition factorialDecomposition = new FactorialDecomposition();
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2); expected.add(2);expected.add(2);expected.add(2);
		expected.add(5); expected.add(5);expected.add(5);
		ArrayList<Integer> actual = factorialDecomposition.calculate(2000);
		assertEquals(expected, actual);
	}

}
