package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import models.Employees;

class XXXTest 
{
	Employees employees;
	
	@Test
	void test1() 
	{
		employees = new Employees();
		employees.setSalary(1000);
		double actual = employees.increaseSalary();
		double expected = 1200;
		assertEquals(expected,actual);
	}
	
	@Test
	void test2() 
	{
		employees = new Employees();
		employees.setSalary(1200);
		double actual = employees.increaseSalary();
		double expected = 1440;
		assertEquals(expected,actual);
	}
	
	@Test
	void test3() 
	{
		employees = new Employees();
		employees.setSalary(9000);
		double actual = employees.increaseSalary();
		double expected = 10800;
		assertEquals(expected,actual);
	}
	
	@Test
	void test4() 
	{
		employees = new Employees();
		employees.setSalary(9001);
		double actual = employees.increaseSalary();
		double expected = 9901.1;
		assertEquals(expected,actual);
	}

}
